package com.innovatechsupport.registroproductos;

import com.innovatechsupport.registroproductos.model.entitys.Cliente;
import com.innovatechsupport.registroproductos.repositorio.ClienteRepositorio;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RegistroproductosApplication {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(RegistroproductosApplication.class, args);
    }
    

    @Bean
    public CommandLineRunner runner() {
        return (String... args) -> {
            Stream.of(
//                    new Cliente(1115866620, "Neyris", "Bohorquez", "neyris99@gmail.com", 301346, "CLL 31 A 29 39"),
//                    new Cliente(15684364, "Luz", "Ibica", "neyris99@hotmail.com", 314416, "CR 11 11 56")
                    new Cliente("1115866620", "Neyris", "Bohorquez", "neyris99@gmail.com", 30134634, "CLL 31 A 29 39"),
                    new Cliente("15684364", "Luz", "Ibica", "neyris99@hotmail.com", 314416, "CR 11 11 56")
            )
                    .map(clienteRepositorio::save)
                    .forEach(System.out::println);
        };
    }
}
