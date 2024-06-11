package br.unifor.trabalhoarq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TrabalhoarqApplication {

    private static RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoarqApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        if (restTemplate == null) {
            synchronized (RestTemplate.class) {
                if (restTemplate == null) {
                    restTemplate = builder.build();
                }
            }
        }
        return restTemplate;
    }
}