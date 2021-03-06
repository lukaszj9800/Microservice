package pl.jagiela.microservices.mainservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jagiela.microservices.mainservice.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
