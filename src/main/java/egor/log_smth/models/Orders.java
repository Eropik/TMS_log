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
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long order_id;


    private long customer_id;

    private String license_plate;

    private long route_id;

    private long cargo_id;


    private LocalDateTime order_date;


    @PrePersist
    private void init(){order_date=LocalDateTime.now();}


    private String status;

    private LocalDateTime dateOfCreation;




}
