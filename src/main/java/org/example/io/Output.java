package org.example.io;

import org.example.functionality.Messages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Output extends IO {

    public void saveFile(String filePath, String text) {
        Path path = Paths.get(filePath);
        String fileName = path.getFileName().toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "ENCRYPTED"))) {
            writer.write(text);
            System.out.println(fileName + "ENCRYPTED");
            System.out.println(new Messages().getTextSavedDesc());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
