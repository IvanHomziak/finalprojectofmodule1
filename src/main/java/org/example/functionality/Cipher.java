package org.example.functionality;

public interface Cipher {

    void getScenario();

    String encrypt(String message, int shiftKey);

    String decrypt(String message, int shiftKey);

    String isCharacterUpperOrLowerCase(char stringChar);

    String bruteforce(String text);

    String getAlphabetUpperCase();

    String getSpecialCharacters();
}
