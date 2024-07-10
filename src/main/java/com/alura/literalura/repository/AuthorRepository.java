package com.alura.literalura.repository;

import com.alura.literalura.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAll();
    Optional<Author> findByNameContainsIgnoreCase(String name);
//    @Query("SELECT a FROM Author a WHERE a.birthYear>=:initialYear AND a.deathYear<=:limitYear")
//    List<Author> getLivingAuthorsByYear(int initialYear, int limitYear);
    List<Author> findByBirthYearLessThanEqualAndDeathYearGreaterThanEqual(int initialYear, int limitYear);
}
