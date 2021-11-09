package pl.jagiela.microservices.getservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GetServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetServiceApplication.class, args);
    }

}
