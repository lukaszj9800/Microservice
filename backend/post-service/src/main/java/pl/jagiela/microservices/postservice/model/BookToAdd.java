package pl.jagiela.microservices.postservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookToAdd {

    private Long id;

    private String title;

    private String author;

    private  double price;
}
