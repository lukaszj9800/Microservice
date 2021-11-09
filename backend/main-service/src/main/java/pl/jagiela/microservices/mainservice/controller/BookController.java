package pl.jagiela.microservices.mainservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jagiela.microservices.mainservice.entity.Book;
import pl.jagiela.microservices.mainservice.service.BookService;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/saveNewBook")
    public Book saveNewBook(@RequestBody Book book){
        return bookService.saveNewBook(book);
    }

}
