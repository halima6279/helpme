package web.service;

import model.Car;

import java.util.List;


public interface CarService {

    List<Car> carsNeeded(List<Car> cars, int number);
}
