package org.example.io;

import org.example.functionality.Messages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input extends IO {

    public String readFile(String filePath) {
        String fileContent = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n"); // Optionally, add a newline between lines
            }
            fileContent = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
