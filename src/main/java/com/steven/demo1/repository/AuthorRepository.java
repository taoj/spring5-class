package com.steven.demo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.demo1.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
