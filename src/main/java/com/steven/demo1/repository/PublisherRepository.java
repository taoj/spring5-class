package com.steven.demo1.repository;

import org.springframework.data.repository.CrudRepository;

import com.steven.demo1.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
