package capstone.tdhostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TdhostelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TdhostelApplication.class, args);
    }

}
