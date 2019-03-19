package SpringJavaNewer;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookAppTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void getBookByIdTest() {
        webTestClient
                .get().uri("/book/200")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class);
    }
    @Test
    public void getAllBooksTest() {
        webTestClient
                .get().uri("/allbooks")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(List.class);
    }
}