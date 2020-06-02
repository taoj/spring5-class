package com.steven.demo1.repository;

import org.springframework.data.repository.CrudRepository;

import com.steven.demo1.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
