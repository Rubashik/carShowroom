package rubashic.carShowroom.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rubashic.carShowroom.model.Car;
import rubashic.carShowroom.repository.InMemoryCarDAO;
import rubashic.carShowroom.service.CarService;

import java.util.List;
@Service
@AllArgsConstructor
public class inMemoryCarServiceImpl implements CarService {
    private final InMemoryCarDAO REPOSITORY;
    @Override
    public List<Car> findAllCars() {
        return REPOSITORY.findAllCars();
    }

    @Override
    public Car saveCar(Car car) {
        return REPOSITORY.saveCar(car);
    }

    @Override
    public Car findByMark(String mark) {
        return REPOSITORY.findByMark(mark);
    }

    @Override
    public Car updateCar(Car car) {
        return REPOSITORY.updateCar(car);
    }

    @Override
    public void deleteCar(String mark) {
        REPOSITORY.deleteCar(mark);
    }
}
