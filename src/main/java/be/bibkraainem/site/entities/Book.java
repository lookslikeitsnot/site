package be.bibkraainem.site.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@Entity
@Table(name = "books")
@NamedEntityGraph(name = "Book.withAuthor", attributeNodes = @NamedAttributeNode("author"))
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long isbn;

	private String title;

	@ManyToOne
	@JoinColumn(name = "authorId")
	private Author author;

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}
}
