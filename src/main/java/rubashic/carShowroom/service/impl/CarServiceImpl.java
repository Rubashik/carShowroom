package rubashic.carShowroom.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import rubashic.carShowroom.model.Car;
import rubashic.carShowroom.repository.CarRepository;
import rubashic.carShowroom.service.CarService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class CarServiceImpl implements CarService {
    private final CarRepository REPOSITORY;
    @Override
    public List<Car> findAllCars() {
        return REPOSITORY.findAll();
    }

    @Override
    public Car saveCar(Car car) {
        return REPOSITORY.save(car);
    }

    @Override
    public Car findByMark(String mark) {
        return REPOSITORY.findCarByMark(mark);
    }

    @Override
    public Car updateCar(Car car) {
        return REPOSITORY.save(car);
    }

    @Override
    public void deleteCar(String mark) {
        REPOSITORY.deleteByMark(mark);
    }
}
