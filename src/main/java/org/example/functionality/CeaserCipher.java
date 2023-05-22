package org.example.functionality;

public class CeaserCipher extends CeaserFunctionality {

    class basic {
        String allChar = new CeaserFunctionality().getAlphabetUpperCase() + new CeaserFunctionality().getSpecialCharacters();

        int indexOfChar(char c) {
            for (int i = 0; i < allChar.length(); i++) {
                if (allChar.charAt(i) == c)
                    return i;
            }
            return -1;
        }

        char charAtIndex(int pos) {
            return allChar.charAt(pos);
        }
    }

    class Ceaser {
        basic b = new basic();

        public String bruteForce(String cipherText) {
            cipherText = cipherText.toUpperCase();
            String decryptedText = "";
            for (int k = 0; k < 34; k++) {
                int key = k;
                for (int i = 0; i < cipherText.length(); i++) {
                    int index = b.indexOfChar(cipherText.charAt(i));

                    if (index == -1) {
                        decryptedText += cipherText.charAt(i);
                        continue;
                    }
                    if ((index - key) >= 0) {
                        decryptedText += b.charAtIndex(index - key);
                    } else {
                        decryptedText += b.charAtIndex((index - key) + 34);
                    }
                }

                System.out.println("Decrypted Text Using key" + key + ":" + decryptedText);
            }
            return decryptedText;
        }
    }
}
