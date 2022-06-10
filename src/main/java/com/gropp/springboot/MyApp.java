package com.gropp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired //injeta o componente Calculadora dentro do contexto sem usar new para componentes do app
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2,4));
    }
}
