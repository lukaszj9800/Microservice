package pl.jagiela.microservices.getservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jagiela.microservices.getservice.model.ReceivedBook;

import java.util.List;

@FeignClient(name = "main-service")
public interface BookProxy {

    @GetMapping("/getAllBooks")
    public List<ReceivedBook> retrieveBook();
}
