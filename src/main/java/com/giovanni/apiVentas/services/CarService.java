package com.giovanni.apiVentas.services;

import com.giovanni.apiVentas.models.Car;
import com.giovanni.apiVentas.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    //Metodo para crear auto
    public void createCar(Car car){
        carRepository.save(car);
    }

    //Metodo para listar todos los autos en nuestra base de datos
    public List<Car> toListCar(){
        return carRepository.findAll();
    }

    //Metodo para buscar por Id
    public Optional<Car> findById(Long id){
        return carRepository.findById(id);
    }

    //Metodo para actualizar un auto
    public void updateCar(Car car){
        carRepository.save(car);
    }

    //Metodo para eliminar un auto
        public void deleteById(Long id){
        carRepository.deleteById(id);
    }

    //Metodos para buscar segun atributos propios de la clase

     public List<Car> findByBrand(String brand){
        return carRepository.findByBrand(brand);
    }

     public List<Car> findByColor(String color){
        return carRepository.findByColor(color);
    }

    public List<Car> findByModel(String model){
        return  carRepository.findByModel(model);
    }

    public List<Car> findByAnio(Long anio){
        return carRepository.findByAnio(anio);
    }


}
