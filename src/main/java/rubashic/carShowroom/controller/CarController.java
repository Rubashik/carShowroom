package rubashic.carShowroom.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rubashic.carShowroom.model.Car;
import rubashic.carShowroom.service.CarService;


import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
@AllArgsConstructor
public class CarController {

    private final CarService SERVICE;

    @GetMapping
    public List<Car> findAllCars(){
        return SERVICE.findAllCars();
        //todo
    }
    @PostMapping("save_car")
    public String saveCar(@RequestBody Car car){
        SERVICE.saveCar(car);
        return "Car successfully saved!";
    }
    @GetMapping("/{mark}")
    public Car findCar(@PathVariable String mark){
        return SERVICE.findByMark(mark);
    }
    @PutMapping("update_car")
    public Car updateCar(@RequestBody Car car){
        return SERVICE.updateCar(car);
    }
    @DeleteMapping("delete_car/{mark}")
    public void deleteCar(@PathVariable String mark){
        SERVICE.deleteCar(mark);
    }
}
