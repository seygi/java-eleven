//package SpringJavaNewer.controller;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//@Configuration
//public class BookRouter {
//    @Bean
//    public RouterFunction<ServerResponse> root(BookHandler bookHandler) {
//        return RouterFunctions.route()
//                .GET("/book/{id}", accept(MediaType.TEXT_PLAIN), bookHandler::getBookById)
//                .GET("/allbooks", accept(MediaType.TEXT_PLAIN), bookHandler::getAllBooks)
//                .build();
//    }
//}