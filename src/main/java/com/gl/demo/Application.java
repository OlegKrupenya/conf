package com.gl.demo;

import com.gl.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
        (scanBasePackages = {
                "com.gl.demo.repository"})
public class Application implements CommandLineRunner {

    @Autowired
    private AccountRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        repository.findAll().forEach(System.out::println);
    }

}


