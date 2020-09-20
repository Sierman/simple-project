package pl.sdacademy.simple.service;

import pl.sdacademy.simple.model.CarDto;
import pl.sdacademy.simple.model.CarParameter;
import pl.sdacademy.simple.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDto> getCars(CarParameter carParameter) {
        return new ArrayList<>();
    }
}
