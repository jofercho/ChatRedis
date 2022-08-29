package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApp{
    public static void main(String[] args) {
        new SpringApplication(ChatApp.class).run(args);
        System.out.println("Hello world!");
    }
}