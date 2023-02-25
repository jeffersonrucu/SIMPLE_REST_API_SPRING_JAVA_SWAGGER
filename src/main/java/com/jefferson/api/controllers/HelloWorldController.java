package com.jefferson.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public String Welcome() {
        return "Be very welcome";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/about", produces="application/json")
    public String About() {
        return "Este projeto foi desenvolvido utilizando a tecnologia Spring Boot, que é uma das mais populares " +
                "para a criação de aplicações web em Java. Estamos construindo uma API REST, que permitirá a " +
                "comunicação com outros sistemas e dispositivos, e para documentar esta API estamos utilizando o " +
                "Swagger, uma ferramenta que ajuda a criar e visualizar a documentação da API de forma clara e " +
                "organizada. Com isso, buscamos tornar a utilização da nossa API mais fácil e intuitiva para os " +
                "desenvolvedores que irão interagir com ela.";
    }
}
