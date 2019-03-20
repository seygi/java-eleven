package SpringJavaNewer.controller;

import java.util.List;

import SpringJavaNewer.model.Book;
import SpringJavaNewer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("/book/{id}")
    public Mono<Book> getBookById(@PathVariable("id") Integer id) {

        return service.getBookById(id);
    }

    @GetMapping("/allbooks")
    public Mono<List<Book>> getAllBooks() {

        return service.getAllBooks();
    }
}
