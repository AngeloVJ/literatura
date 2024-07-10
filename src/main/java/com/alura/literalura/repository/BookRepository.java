package com.alura.literalura.repository;

import com.alura.literalura.model.Book;
import com.alura.literalura.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    List<Book> findAll();
    Optional<Book> findByTitleContainsIgnoreCase(String title);
    List<Book> findByLanguage(Language language);
}

