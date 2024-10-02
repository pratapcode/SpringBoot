package com.pratap;

import jdk.jfr.Timespan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PasswordGenerator {



    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(PasswordGenerator.class, args);
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
