package br.com.meugrupo.meuapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {
    @GetMapping("/api")
    public String mensagem() {
        System.out.println("Resposta da API REST.");
        return "Resposta da API REST.";
    }
}