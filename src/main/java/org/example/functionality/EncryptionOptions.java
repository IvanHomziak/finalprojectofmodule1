package org.example.functionality;

public enum EncryptionOptions {

    ENCRYPTED("Encrypted"),
    DECRYPTED("Decrypted"),
    BRUTE_FORCE("Brute_force");
    private String option;

    private EncryptionOptions(String option) {
        this.option = option;
    }

    public String getOption() {
        return this.option;
    }
}
