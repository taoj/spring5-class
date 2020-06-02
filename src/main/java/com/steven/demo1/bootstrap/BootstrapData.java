package com.steven.demo1.bootstrap;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.steven.demo1.models.Author;
import com.steven.demo1.models.Book;
import com.steven.demo1.models.Publisher;
import com.steven.demo1.repository.AuthorRepository;
import com.steven.demo1.repository.BookRepository;
import com.steven.demo1.repository.PublisherRepository;

//Spring is looking for this instance for initialization.
@Component
public class BootstrapData implements CommandLineRunner {

	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author author1 = new Author("author1", "a");
		Author author2 = new Author("author2", "b");
//		Author author3 = new Author("author3", "c");
		
		Book book1 = new Book("book 1", "book1 isbn");
		Book book2 = new Book("book 2", "book2 isbn");
		

		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);
		
//		author2.getBooks().add(book2);
//		book2.getAuthors().add(author2);
		Set<Book> books = new HashSet();
		books.add(book2);
		Set<Author> authors = new HashSet();
		authors.add(author2);
		book2.setAuthors(authors);
		author2.setBooks(books);
		
		
		authorRepository.save(author1);
		bookRepository.save(book1);
		
		
		authorRepository.save(author2);
		bookRepository.save(book2);
		
		Publisher publisher = new Publisher();
		publisher.setAddressLine1("address 1");
		publisher.setCity("Pittsburgh");
		publisher.setName("xi hua she");
		publisher.setState("pa");
		publisher.setZip("15232");
		
		publisher.getBooks().add(book1);
		book1.setPublisher(publisher);
		
		publisher.getBooks().add(book2);
		book2.setPublisher(publisher);
		
		publisherRepository.save(publisher);
		
		System.out.println(publisher.getId());
		
		
		System.out.println("bootstrap");
		System.out.println("number of publisher "+ publisherRepository.count());
		
		
//		Optional<Publisher> pub = publisherRepository.findById((long) 5);
//		if(pub != null) {
//			System.out.println("publisher pushlish books "+ pub.get().getBooks().size());
//		}
//		
	}

}
