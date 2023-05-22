package org.example.functionality;

public class Messages {

    private final String WELCOME_MESSAGE = "Welcome to Cryptographer";
    private final String ENCRYPT_PROGRAM = "[e] encrypt mode";
    private final String DECRYPT_PROGRAM = "[d] decrypt mode";
    private final String BRUTE_FORCE_PROGRAM = "[b] brute force mode";
    private final String AVAILABLE_OPTIONS = ENCRYPT_PROGRAM + "\t" + DECRYPT_PROGRAM + "\t" + BRUTE_FORCE_PROGRAM;
    private final String CHOOSE_OPTION_MESSAGE = "Choose program mode:";
    private final String FILE_PATH = "Input file path...";
    private final String ENCRYPTION_KEY = "Input encryption key...";
    private final String FILE_NAME = "Input file name...";
    private final String TEXT_SAVED_DESC = "Text saved successfully.";
    private final String INCORRECT_MODE_MESSAGE = "Incorrect mode was chosen. Please choose one of available modes:\n";

    public void printMessage(String string) {
        System.out.println(string);
    }

    public String getAvailableModes() {
        return this.AVAILABLE_OPTIONS;
    }

    public String getWelcomeMessage() {
        return this.WELCOME_MESSAGE;
    }

    public String getChooseOptionMessage() {
        return this.CHOOSE_OPTION_MESSAGE;
    }

    public String getFilePath() {
        return this.FILE_PATH;
    }

    public String getEncryptionKey() {
        return this.ENCRYPTION_KEY;
    }

    public String getFileName() {
        return this.FILE_NAME;
    }

    public String getTextSavedDesc() {
        return this.TEXT_SAVED_DESC;
    }

    public String getIncorrectModeMessage() {
        return INCORRECT_MODE_MESSAGE;
    }
}
