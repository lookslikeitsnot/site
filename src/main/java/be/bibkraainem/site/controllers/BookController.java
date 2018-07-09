package be.bibkraainem.site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.bibkraainem.site.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	private final String VIEW = "books/books";
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	ModelAndView books() {
		return new ModelAndView(VIEW).addObject("books", bookService.findAll());
	}
}
