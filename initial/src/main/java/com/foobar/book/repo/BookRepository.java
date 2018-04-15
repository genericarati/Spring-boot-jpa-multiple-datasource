package com.foobar.book.repo;

import com.foobar.book.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Integer> {
    Book findById(Long id);
}
