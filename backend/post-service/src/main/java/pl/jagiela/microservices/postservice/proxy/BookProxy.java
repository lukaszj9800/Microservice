package pl.jagiela.microservices.postservice.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.jagiela.microservices.postservice.model.BookToAdd;

@CrossOrigin(origins = "http://localhost:4200")
@FeignClient(name = "main-service")
public interface BookProxy {

    @PostMapping("/saveNewBook")
    BookToAdd addNewBook(@RequestBody BookToAdd book);
}
