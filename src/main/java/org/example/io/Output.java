package org.example.io;

import org.example.functionality.Messages;
import org.example.functionality.Modes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.example.functionality.EncryptionOptions.*;

public class Output extends IO {

    public void saveFile(String filePath, String text, String mode) {
        Path path = Paths.get(filePath);
        String fileName = path.getFileName().toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getOption(mode) + "_" + fileName))) {
            writer.write(text);
            System.out.println(fileName + getProgramMode());
            System.out.println(new Messages().getTextSavedDesc());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getOption(String input) {
        String op = null;
        if (input.equals(Modes.ENCRYPT_MODE.getModeValue())) {
            op = ENCRYPTED.getOption();
        } else if (input.equals(Modes.DECRYPT_MODE.getModeValue())) {
            op = DECRYPTED.getOption();
        } else if (input.equals(Modes.BRUTE_FORCE_MODE.getModeValue())) {
            op = BRUTE_FORCE.getOption();
        }
        return op;
    }
}
