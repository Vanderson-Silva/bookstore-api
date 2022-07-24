package com.vssystem.bookstore;

import com.vssystem.bookstore.model.Categoria;
import com.vssystem.bookstore.model.Livro;
import com.vssystem.bookstore.repository.CategoriaRepository;
import com.vssystem.bookstore.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informatica", "Livro de Ti");
        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);

        cat1.getLivros().addAll(Arrays.asList(l1));
        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));

    }
}
