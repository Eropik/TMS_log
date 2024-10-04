package egor.log_smth.models;


import egor.log_smth.models.enums.Available;
import egor.log_smth.models.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue()
    private String license_plate;

    private float capacity;

    private float volume_capacity;

    private String current_location;

    private boolean availability_status;

    @ElementCollection(targetClass = Available.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Available> roles = new HashSet<>();

    public boolean isAvailable(){return roles.contains(Available.AVAILABLE_VEHICLE);}




}
