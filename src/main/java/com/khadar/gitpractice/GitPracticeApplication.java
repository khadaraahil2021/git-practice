package com.khadar.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

    public static void main(String[] args) {
        System.out.println("Add logger in main method");
        SpringApplication.run(GitPracticeApplication.class, args);
    }

}
