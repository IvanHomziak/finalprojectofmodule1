package org.example.functionality;

public class Messages {

    private final String WELCOME_MESSAGE = "Welcome to Cryptographer";
    private final String ENCRYPT_PROGRAM_OPTION = "[e] encrypt mode";
    private final String DECRYPT_PROGRAM_OPTION = "[d] decrypt mode";
    private final String BRUTE_FORCE_PROGRAM_OPTION = "[b] brute force mode";
    private final String CLOSE_PROGRAM_OPTION = "[c] close program";
    private final String AVAILABLE_OPTIONS = ENCRYPT_PROGRAM_OPTION + "\t" + DECRYPT_PROGRAM_OPTION + "\t" + BRUTE_FORCE_PROGRAM_OPTION + "\t" + CLOSE_PROGRAM_OPTION;
    private final String CHOOSE_OPTION_MESSAGE = "Choose program mode:";
    private final String FILE_PATH_MESSAGE = "Input file path...";
    private final String ENCRYPTION_KEY_MESSAGE = "Input encryption key...";
    private final String FILE_NAME_MESSAGE = "Input file name...";
    private final String TEXT_SAVED_DESC = "Text saved successfully.";
    private final String INCORRECT_MODE_MESSAGE = "Incorrect mode was chosen. Please choose one of available modes:\n";

    private final String CLOSE_PROGRAM_MESSAGE = "Program is closed";


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
        return this.FILE_PATH_MESSAGE;
    }

    public String getEncryptionKey() {
        return this.ENCRYPTION_KEY_MESSAGE;
    }

    public String getFileName() {
        return this.FILE_NAME_MESSAGE;
    }

    public String getTextSavedDesc() {
        return this.TEXT_SAVED_DESC;
    }

    public String getIncorrectModeMessage() {
        return INCORRECT_MODE_MESSAGE;
    }

    public String getCloseProgramOption() {
        return CLOSE_PROGRAM_OPTION;
    }
    public String getCloseProgramMessage() {
        return CLOSE_PROGRAM_MESSAGE;
    }

}
