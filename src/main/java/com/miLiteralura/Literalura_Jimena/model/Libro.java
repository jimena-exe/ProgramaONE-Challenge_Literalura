package com.miLiteralura.Literalura_Jimena.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record Libro(String titulo,
                     String autores,
                    String idiomas) {
//    @JsonAlias("title")
//    @JsonAlias("authors")
//    @JsonAlias("languages")

}
