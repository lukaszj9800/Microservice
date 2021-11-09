package pl.jagiela.microservices.getservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jagiela.microservices.getservice.model.ReceivedBook;
import pl.jagiela.microservices.getservice.proxy.BookProxy;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/get")
public class ReceivedBookController {

    @Autowired
    private BookProxy bookProxy;

    @GetMapping("/getAllBooks")
    public List<ReceivedBook> getAllBooks(){

        return bookProxy.retrieveBook();
    }
}
