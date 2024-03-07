package rubashic.carShowroom.repository;


import org.springframework.stereotype.Repository;
import rubashic.carShowroom.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryCarDAO {
    private final List<Car> CARS = new ArrayList<>();

    public List<Car> findAllCars() {
        return CARS;
    }


    public Car saveCar(Car car) {
        CARS.add(car);
        return car;
    }


    public Car findByMark(String mark) {
        return CARS.stream()
                .filter(element -> element.getMark().equals(mark))
                .findFirst()
                .orElse(null);
    }


    public Car updateCar(Car car) {
        var carIndex = IntStream.range(0, CARS.size())
                .filter(index -> CARS.get(index).getMark().equals(car.getMark()))
                .findFirst()
                .orElse(-1);
        if(carIndex > -1){
            CARS.set(carIndex, car);
            return car;
        }
        return null;
    }


    public void deleteCar(String mark) {
        var car = findByMark(mark);
        if(car != null){
            CARS.remove(car);
        }
    }
}
