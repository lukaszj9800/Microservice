package pl.jagiela.microservices.mainservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jagiela.microservices.mainservice.entity.Book;
import pl.jagiela.microservices.mainservice.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book saveNewBook(Book book){
        return bookRepository.save(book);
    }
}
