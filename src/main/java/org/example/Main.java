package com.exemplo.javateste;   // use o mesmo package do projeto

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication          // ← habilita o auto-config do Spring
public class Main {             // pode manter o nome Main

    public static void main(String[] args) {
        // inicializa o Spring Boot
        SpringApplication.run(Main.class, args);
    }
}
