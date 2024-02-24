package com.giovanni.apiVentas.controllers;

import com.giovanni.apiVentas.models.Car;
import com.giovanni.apiVentas.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auto")
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(value = "/crear", headers = "Accept=application/json")
    public void createCar(@RequestBody Car car){
        carService.createCar(car);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Car> findCars(){
        return carService.toListCar();
    }

    @GetMapping(value = "listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Car> findById(@PathVariable Long id){
        return carService.findById(id);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void updatecar(@RequestBody Car car){
        carService.updateCar(car);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void deleteCar(@PathVariable Long id){
        carService.deleteById(id);
    }

    @GetMapping(value = "listarPorMarca/{brand}", headers = "Accept=application/json")
    public List<Car> findByBrand(@PathVariable String brand){
        return carService.findByBrand(brand);
    }

    @GetMapping(value = "listarPorColor/{color}", headers = "Accept=application/json")
    public List<Car> findByColor(@PathVariable String color){
        return carService.findByColor(color);
    }

    @GetMapping(value = "listarPorModel/{model}", headers = "Accept=application/json")
    public List<Car> findByModel(@PathVariable String model){
        return carService.findByModel(model);
    }

    @GetMapping(value = "listarPorAño/{anio}", headers = "Accept=application/json")
    public List<Car> findByAnio(@PathVariable Long anio){
        return carService.findByAnio(anio);
    }
}
