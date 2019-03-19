//package SpringJavaNewer.controller;
//
//import java.util.function.Predicate;
//
//import SpringJavaNewer.model.Book;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//@Component
//public class BookHandler {
//    public Mono<ServerResponse> getBookById(ServerRequest request) {
//        int id = Integer.parseInt(request.pathVariable("id"));
//        Predicate<Book> predicate = b -> b.getId() == id;
//        Book book = Book.getAllBooks().stream().filter(predicate).findFirst().get();
//
//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromObject(book));
//    }
//    public Mono<ServerResponse> getAllBooks(ServerRequest request) {
//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromObject(Book.getAllBooks()));
//    }
//}
