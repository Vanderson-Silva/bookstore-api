package com.vssystem.bookstore.service;

import com.vssystem.bookstore.model.Categoria;
import com.vssystem.bookstore.model.Livro;
import com.vssystem.bookstore.repository.CategoriaRepository;
import com.vssystem.bookstore.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBadeDados() {
        Categoria cat1 = new Categoria(null, "Informatica", "Livro de Ti");
        Categoria cat2 = new Categoria(null, "Ficcao", "Livro de Receitas");
        Categoria cat3 = new Categoria(null, "Biografia", "Livro de Piadas");


        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);
        Livro l2 = new Livro(null, "Java", "Robert Martin", "Lorem Ipsum", cat1);
        Livro l3 = new Livro(null, "Phyton", "Robert Martin", "Lorem Ipsum", cat2);
        Livro l4 = new Livro(null, "C#", "Robert Martin", "Lorem Ipsum", cat2);
        Livro l5 = new Livro(null, "Angular", "Robert Martin", "Lorem Ipsum", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }
}
