package org.example.functionality;

import org.example.exceptions.IncorrectProgramModeError;
import org.example.io.Input;
import org.example.io.Output;

import java.util.Arrays;

public class EncryptionDecryptionFunctionality extends Input {

    private final String ALPHABET_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String ALPHABET_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private final String SPECIAL_CHARACTERS = ".,”:-!? ";
    private String ALPHABET = null;
    private char[] input;
    private int key;

    public void chooseScenario() {
        int attempt = 1;
        while (attempt <= 4) {
            try {
                setProgramMode(sc.nextLine());
            } catch (IncorrectProgramModeError ex) {
                System.out.println(new Messages().getIncorrectModeMessage() + new Messages().getAvailableModes());
                attempt++;
            }
            if (Arrays.stream(Modes.values()).anyMatch(mode -> mode.getProgramModeValue().equals(getProgramMode()))) {
                break;
            }
            if (attempt == 4) throw new IncorrectProgramModeError("Incorrect input value");
        }

        if (getProgramMode().equals(Modes.ENCRYPT_MODE.getProgramModeValue())) {
            setFilePath();
            setEncryptionKey();
            setFileText(readFile(getFilePath()));
            setNewFileText(encrypt(getFileText(), getKey()));
            setFileName();
            new Output().saveFile(getFilePath(), getNewFileText());
        } else if (getProgramMode().equals(Modes.DECRYPT_MODE.getProgramModeValue())) {
            setFilePath();
            setEncryptionKey();
            setFileText(readFile(getFilePath()));
            setNewFileText(decrypt(getFileText(), getKey()));
            setFileName();
            new Output().saveFile(getFilePath(), getNewFileText());
        } else if (getProgramMode().equals(Modes.BRUTE_FORCE_MODE.getProgramModeValue())) {
            setFilePath();
            setFileText(readFile(getFilePath()));
            setFileText(bruteForceDecrypt(getFilePath()));
            new Output().saveFile(getFilePath(), getFileText());
        } else if (getProgramMode().equals(Modes.CLOSE_PROGRAM_MODE.getProgramModeValue())) {
            System.out.println(new Messages().getCloseProgramMessage());
        }
    }

    public String encrypt(String message, int shiftKey) {
        String cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            isCharacterUpperOrLowerCase(message.charAt(i));
            int charPosition = ALPHABET.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % ALPHABET.length();
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public String decrypt(String cipherText, int shiftKey) {
        String message = "";
        for (int i = 0; i < cipherText.length(); i++) {
            isCharacterUpperOrLowerCase(cipherText.charAt(i));
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % ALPHABET.length();
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }

    public String isCharacterUpperOrLowerCase(char stringChar) {
        if (Character.isUpperCase(stringChar)) {
            return ALPHABET = ALPHABET_UPPER_CASE + SPECIAL_CHARACTERS;
        } else {
            return ALPHABET = ALPHABET_LOWER_CASE + SPECIAL_CHARACTERS;
        }
    }

    public String bruteforce(String string) {
        input = string.toCharArray();
        for (key = 1; key < 27; key++) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] == ' ')
                    continue;
                else {
                    if (input[i] >= 'A' && input[i] <= 'Z') {
                        input[i] = (char) (input[i] - key);
                        if (input[i] < 'A') {
                            input[i] = (char) (input[i] + 26);
                        }
                    } else {
                        input[i] = (char) (input[i] - key);
                        if (input[i] < 'a') {
                            input[i] = (char) (input[i] + 26);
                        }
                    }
                }
            }
            input = string.toCharArray();
        }
        return new String(input);
    }

    public String bruteForceDecrypt(String encryptedString) {
        // Ініціалізувати можливі символи, які можуть бути в розшифрованому рядку
        String possibleCharacters = new EncryptionDecryptionFunctionality().ALPHABET_UPPER_CASE +
                new EncryptionDecryptionFunctionality().ALPHABET_UPPER_CASE +
                new EncryptionDecryptionFunctionality().SPECIAL_CHARACTERS;

        // Перебрати всі можливі комбінації символів
        for (int keyLength = 1; keyLength <= possibleCharacters.length(); keyLength++) {
            StringBuilder decryptedString = new StringBuilder();
            decryptRecursive(encryptedString, decryptedString, possibleCharacters, keyLength);
            if (decryptedString.length() > 0) {
                return decryptedString.toString();
            }
        }
        // Якщо розшифрування не вдалося
        return "Unable to decrypt the string.";
    }

    private void decryptRecursive(String encryptedString, StringBuilder decryptedString, String possibleCharacters, int keyLength) {
        if (keyLength == 0) {
            // Перевірити, чи розшифрований рядок збігається з оригінальним
            if (encryptedString.equals(decryptedString.toString())) {
                decryptedString.append(" (Possible decryption)");
            }
            return;
        }

        for (int i = 0; i < possibleCharacters.length(); i++) {
            char currentChar = possibleCharacters.charAt(i);

            // Додати символ до поточного розшифрованого рядка
            decryptedString.append(currentChar);

            // Рекурсивно розшифрувати решту рядка
            decryptRecursive(encryptedString, decryptedString, possibleCharacters, keyLength - 1);

            // Видалити останній доданий символ перед переходом до наступного
            decryptedString.setLength(decryptedString.length() - 1);
        }
    }

    public String getAlphabetUpperCase() {
        return ALPHABET_UPPER_CASE;
    }

    public String getSpecialCharacters() {
        return SPECIAL_CHARACTERS;
    }
}
