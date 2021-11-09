package pl.jagiela.microservices.getservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReceivedBook {

    private Long id;

    private String title;

    private String author;

    private double price;
}
