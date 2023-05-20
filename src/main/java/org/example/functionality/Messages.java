package org.example.functionality;

public class Messages {

    private final String WELCOME_MESSAGE = "Welcome to Cryptographer";
    private String ENCRYPT_PROGRAM = "[e] encrypt mode";
    private String DECRYPT_PROGRAM = "[d] decrypt mode";
    private String BRUTE_FORCE_PROGRAM = "[b] brute force mode";

    private String AVAILABLE_OPTIONS = ENCRYPT_PROGRAM + "\t" + DECRYPT_PROGRAM + "\t" + BRUTE_FORCE_PROGRAM;

    private String CHOOSE_OPTION_MESSAGE = "Choose program mode:";

    private String FILE_PATH = "Input file path...";
    private String ENCRYPTION_KEY = "Input encryption key...";
    private String FILE_NAME = "Input file name...";
    private String TEXT_SAVED_DESC = "Text saved successfully.";

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
}
