package com.giovanni.apiVentas.repositories;

import com.giovanni.apiVentas.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);
    List<Car> findByColor(String color);
    List<Car> findByModel(String model);
    List<Car> findByAnio(Long anio);





}
