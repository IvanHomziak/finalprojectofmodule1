package org.example;

import org.example.functionality.*;

/**
 * Hello world!
 */
public class App {
    
    public static void main(String[] args) {
        startProgram();
    }

    private static void startProgram() {
        new Greetings();
        new Messages().printMessage(new Messages().getChooseOptionMessage());
        new Messages().printMessage(new Messages().getAvailableModes());
        new EncryptionDecryptionFunctionality().chooseScenario();
    }
}
