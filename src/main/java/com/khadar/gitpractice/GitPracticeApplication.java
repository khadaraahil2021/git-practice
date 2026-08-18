package com.khadar.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

    public static void main(String[] args) {
        System.out.println("Add logger in main method");
        System.out.println("Add 2 logger in main method");
        System.out.println("Add 3logger in main method");
        SpringApplication.run(GitPracticeApplication.class, args);
        System.out.println("Add logger in main method 4");
        System.out.println("Add logger in main method 5");
        System.out.println("Add logger in main method 6");
        System.out.println("Add logger in main method 7");
        System.out.println("Add logger in main method 8");
    }

}
