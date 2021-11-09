package pl.jagiela.microservices.postservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jagiela.microservices.postservice.model.BookToAdd;
import pl.jagiela.microservices.postservice.proxy.BookProxy;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/post")
public class BookToAddController {

    @Autowired
    private BookProxy bookProxy;

    @PostMapping("/addNewBook")
    public BookToAdd saveNewBook(@RequestBody BookToAdd book){
        return bookProxy.addNewBook(book);
    }
}
