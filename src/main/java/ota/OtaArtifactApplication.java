package ota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class OtaArtifactApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtaArtifactApplication.class, args);
    }
}
