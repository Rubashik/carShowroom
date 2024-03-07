package rubashic.carShowroom.service;

import org.springframework.stereotype.Service;
import rubashic.carShowroom.model.Car;

import java.util.List;

@Service
public interface CarService {
    public List<Car> findAllCars();

    Car saveCar(Car car);
    Car findByMark(String mark);
    Car updateCar(Car car);
    void deleteCar(String mark);

}
