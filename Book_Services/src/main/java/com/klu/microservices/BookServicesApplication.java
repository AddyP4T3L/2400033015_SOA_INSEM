package com.klu.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServicesApplication.class, args);
	}

}


@Entity
@Table(name="books")
public class Book{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotBlank(message="Title is required")
	private String title;
	@NotBlank(message="Author is required")
	private String Author;
	@NotBlank(message="ISBN is required")
	private String isbn;
	public Book() {
		
	}
	public Book(Long id,String title, String author, String isbn) {
		this.id=id;
		this.title=title;
		this.Author=author;
		this.isbn=isbn;
	}
	
}
