package be.bibkraainem.site.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import be.bibkraainem.site.entities.Author;
import be.bibkraainem.site.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	@EntityGraph("Book.withAuthor")
	List<Book> findAll();

	List<Book> findByAuthor(Author author);
}
