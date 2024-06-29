package com.miLiteralura.Literalura_Jimena.principal;

import com.miLiteralura.Literalura_Jimena.model.DatosGenerales;
import com.miLiteralura.Literalura_Jimena.model.DatosLibros;
import com.miLiteralura.Literalura_Jimena.serviceAPI.ConsumoApi;
import com.miLiteralura.Literalura_Jimena.serviceAPI.ConvierteDatos;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Menu {
    //variables
    public final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoApi consumoApi = new ConsumoApi();
    public ConvierteDatos convierteDatos = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);




    //médoto
    public void mostrarElMenu(){
        var opcion = -1;
        while (opcion != 0){

            System.out.println("\nElija una de las opciones del menú.");
            var menu = """
                1~ Buscar libro por título.
                2~ Quiero listar los libros por idioma.
                3~ Quiero listar los libros registrados.
                4~ Quiero listar los autores registrados.
                5~ Quiero listar los autores vivos en un determinado año.
                0~ _Salir de la aplicación_
                """;
            System.out.println(menu);
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1: mostrarLibroPorTitulo();
                    break;
//                case 2: mostrarLibrosPorIdioma();
//                break;
//                case 3: mostrarLibrosRegistrados();
//                break;
//                case 4: mostrarLosAutoresRegistrados();
//                break;
//                case 5: mostrarAutoresVivosPorAnio();
//                break;
                case 0:
                    System.out.println("Cerrando la aplicación de la Biblioteca...");
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        }

        //Consumiendo la API
//        var json = consumoApi.obtenerDatos(URL_BASE);
//        var datos = convierteDatos.obtenerDatos(json, Libro.class);
//        System.out.println(json);


    }

    //Traer libros por título
    public void mostrarLibroPorTitulo(){
        System.out.println("Ingresa el nombre del libro que deseas encontrar: ");
        var nombreTitulo = teclado.nextLine();

        //API
        var json = consumoApi.obtenerDatos(URL_BASE+"?search=" + nombreTitulo.replace(" ","+"));
        var datosBusqueda = convierteDatos.obtenerDatos(json, DatosGenerales.class);

        //Hace la búsqueda | crea lista y los filtra
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(nombreTitulo.toUpperCase()))
                .findFirst();

        if(libroBuscado.isPresent()){
            System.out.println("Libro Encontrado! ");
            System.out.println(libroBuscado.get());
        }else {
            System.out.println("Libro no encontrado :(");
        }


    }

    //Traer libros por idioma

    //Traer libros registrados

    //Traer Autores registrados

    //Traer autores vivos por año
}
