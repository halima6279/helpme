package web.service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    public CarServiceImpl(){}

    private List <Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Mercedes", 20, 2003));
        cars.add(new Car("Toyota", 30, 2004));
        cars.add(new Car("Vesta", 40, 2005));
        cars.add(new Car("BMW", 50, 2006));
        cars.add(new Car("Nissan", 60, 2007));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> carsNeeded(List<Car> cars, int number) {
        List<Car> carsNeeded = cars.subList(0, Math.min(number, cars.size()));
        return carsNeeded;
    }
}
