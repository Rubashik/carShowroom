package rubashic.carShowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rubashic.carShowroom.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    void deleteByMark(String mark);
    Car findCarByMark(String mark);
}
