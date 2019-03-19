package SpringJavaNewer.service;

import java.util.List;
import java.util.function.Predicate;

import SpringJavaNewer.model.Book;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookService {
    public Mono<Book> getBookById(int id) {
        Predicate<Book> predicate = b -> b.getId() == id;
        Book book = Book.getAllBooks().stream().filter(predicate).findFirst().get();
        return Mono.just(book);
    }
    public Mono<List<Book>> getAllBooks() {
        return Mono.just(Book.getAllBooks());
    }
}
