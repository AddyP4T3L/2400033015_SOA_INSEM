package Book.Service;

import java.util.*;

import com.klu.microservices.Book;

public class Book_Service {
	private final BookRepository repository;
	public Book_Service(BookRepository repository) {
		this.repository=repository;
	}

	public Book add(Book book) {
		return repository.save(book);
	}





}
