package com.miLiteralura.Literalura_Jimena.principal;

import com.miLiteralura.Literalura_Jimena.model.Libro;
import com.miLiteralura.Literalura_Jimena.serviceAPI.ConsumoApi;
import com.miLiteralura.Literalura_Jimena.serviceAPI.ConvierteDatos;

public class Menu {
    //variables
    //public String url = "https://gutendex.com/books";
    public ConsumoApi consumoApi = new ConsumoApi();
    public ConvierteDatos convierteDatos = new ConvierteDatos();


    //médoto
    public void mostrarElMenu(){
//        System.out.println("\nBienvenido/a a la biblioteca de Alejandría.");
//        System.out.println("\nElija una de las opciones del menú.");
//        System.out.println("""
//                1~ Buscar libro por título.
//                2~ Quiero listar los libros por idioma.
//                3~ Quiero listar los libros registrados.
//                4~ Quiero listar los autores registrados.
//                5~ Quiero listar los autores vivos en un determinado año.
//                0~ _Salir de la aplicación_
//                """);

//        Libro libros = consumoApi.obtenerDatos(url);
        var json = consumoApi.obtenerDatos("https://gutendex.com/books");
//        var datos = convierteDatos.obtenerDatos(json, Libro.class);
        System.out.println(json);

    }
}
