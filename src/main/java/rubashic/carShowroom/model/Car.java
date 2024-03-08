package rubashic.carShowroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String mark;
    @NonNull
    private String model;
    private String engine;
    private String yearProduction;
    private int mileage;

}
