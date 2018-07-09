package be.bibkraainem.site.services;

import java.util.List;

import be.bibkraainem.site.entities.Author;
import be.bibkraainem.site.entities.Book;

public interface BookService {
	List<Book> findByAuthor(Author author);

	List<Book> findAll();
}
