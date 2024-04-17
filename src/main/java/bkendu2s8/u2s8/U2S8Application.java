package bkendu2s8.u2s8;

import bkendu2s8.u2s8.Adapter.ClassAdapter;
import bkendu2s8.u2s8.Adapter.Info;
import bkendu2s8.u2s8.Adapter.UserData;
import bkendu2s8.u2s8.Composite.Libro;
import bkendu2s8.u2s8.Composite.Pagine;
import bkendu2s8.u2s8.Composite.Sezioni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U2S8Application {

	public static void main(String[] args) {
		SpringApplication.run(U2S8Application.class, args);

		// ESERCIZIO 1
//		UserData userData = new UserData();
//		Info info = new Info("Paolo", "Bonolis", LocalDate.of(1960,2,2));
//		userData.getData(new ClassAdapter(info));

		// ESERCIZIO 2
		List<String> autori = new ArrayList<>();
		autori.add("Autore1");
		autori.add("Autore2");

		Libro libro = new Libro("Titolo del Libro", autori, 29.99);

		Pagine pagina1 = new Pagine("Contenuto della pagina 1");
		Pagine pagina2 = new Pagine("Contenuto della pagina 2");

		Sezioni sezione1 = new Sezioni("Sezione 1");
		sezione1.aggiungiElemento(pagina1);
		sezione1.aggiungiElemento(pagina2);

		Pagine pagina3 = new Pagine("Contenuto della pagina 3");
		Pagine pagina4 = new Pagine("Contenuto della pagina 4");

		Sezioni sezione2 = new Sezioni("Sezione 2");
		sezione2.aggiungiElemento(pagina3);
		sezione2.aggiungiElemento(pagina4);

		libro.aggiungiContenuto(sezione1);
		libro.aggiungiContenuto(sezione2);

		System.out.println("Numero totale di pagine del libro: " + libro.numeroPagine());
		System.out.printf("Lista autori: " + autori);
		System.out.println("Sezione 1: " + sezione1);
		System.out.println("Sezione 2: " + sezione2);
	}

}
