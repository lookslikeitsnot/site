package be.bibkraainem.site.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.bibkraainem.site.entities.Author;
import be.bibkraainem.site.entities.Book;
import be.bibkraainem.site.repositories.BookRepository;

@Service
@Transactional(readOnly = true)
public class DefaultBookService implements BookService{
	private final BookRepository bookRepository;

	public DefaultBookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> findByAuthor(Author author) {
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
}
