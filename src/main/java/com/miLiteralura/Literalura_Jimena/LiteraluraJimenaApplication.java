package com.miLiteralura.Literalura_Jimena;

import com.miLiteralura.Literalura_Jimena.principal.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraJimenaApplication implements CommandLineRunner{

	public static void main(String[] args) {SpringApplication.run(LiteraluraJimenaApplication.class, args);}



	@Override
	public void run(String... args) throws Exception {

		Menu menu = new Menu();
		menu.mostrarElMenu();



	}
}
