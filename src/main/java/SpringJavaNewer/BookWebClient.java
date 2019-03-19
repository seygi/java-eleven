package SpringJavaNewer;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class BookWebClient {
    private WebClient client = WebClient.create("http://localhost:8080");

    public String fetchBookById() {
        Mono<ClientResponse> result = client.get()
                .uri("/book/200")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        return result.flatMap(res -> res.bodyToMono(String.class)).block();
    }
    public String fetchAllBooks() {
        Mono<ClientResponse> result = client.get()
                .uri("/allbooks")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        return result.flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
