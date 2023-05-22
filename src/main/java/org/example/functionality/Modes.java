package org.example.functionality;

public enum Modes {
    ENCRYPT_MODE("e"),
    DECRYPT_MODE("d"),
    BRUTE_FORCE_MODE("b"),
    CLOSE_PROGRAM_MODE("c");

    private String mode;

    private Modes(String mode) {
        this.mode = mode;
    }

    public String getProgramModeValue() {
        return this.mode;
    }
}
