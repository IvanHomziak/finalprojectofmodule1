package org.example.functionality;

public class Greetings extends Messages{

    public Greetings(){
        System.out.println(new Messages().getWelcomeMessage());
    }
}
