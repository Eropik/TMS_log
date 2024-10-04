package egor.log_smth.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orders_id;


    private long customer_id;

    private String license_plate;

    private String order_date;

    private String status;

    private LocalDateTime dateOfCreation;

    @PrePersist
    private void init(){dateOfCreation=LocalDateTime.now();}


}
