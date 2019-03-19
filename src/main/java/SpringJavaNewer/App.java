package SpringJavaNewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);


        BookWebClient bwc = new BookWebClient();
        System.out.println(bwc.fetchBookById());
        System.out.println("---------------------");
        System.out.println(bwc.fetchAllBooks());
    }

}
