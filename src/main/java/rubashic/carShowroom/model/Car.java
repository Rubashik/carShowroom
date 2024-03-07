package rubashic.carShowroom.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Car {
    @NonNull
    private String mark;
    @NonNull
    private String model;
    private String engine;
    private String yearProduction;
    private int mileage;

}
