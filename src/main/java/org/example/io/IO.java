package org.example.io;

import org.example.functionality.Messages;

import java.util.Scanner;

public class IO {

    protected Scanner sc = new Scanner(System.in);
    private String programMode;
    private String fileText;
    private String newFileText;
    private String filePath;
    private String getFileName;
    private int key;


    public int getKey() {
        return this.key;
    }

    public void setEncryptionKey(int key){
        System.out.println(new Messages().getEncryptionKey());
        this.key = key;
    }

    public void setEncryptionKey(){
        System.out.println(new Messages().getEncryptionKey());
        this.key = sc.nextInt();
    }

    public String getProgramMode() {
        return programMode;
    }

    public void setProgramMode(String programMode) {
        this.programMode = sc.nextLine();
    }
    public void setProgramMode() {
        this.programMode = sc.nextLine();
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        System.out.println(new Messages().getFileName());
        this.filePath = filePath;
    }

    public void setFilePath() {
        System.out.println(new Messages().getFilePath());
        this.filePath = sc.nextLine();
    }

    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public void setFileName(String fileName){
        System.out.println(new Messages().getFileName() + "saved");
        this.getFileName = fileName;
    }

    public void setFileName(){
        System.out.println(new Messages().getFileName() + "saved");
        this.getFileName = sc.nextLine();
    }

    public String getFileName(){
        return this.getFileName;
    }

    public String getNewFileText() {
        return newFileText;
    }

    public void setNewFileText(String newFileText) {
        this.newFileText = newFileText;
    }
}
