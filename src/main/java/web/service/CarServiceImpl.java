package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarList(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ABC", "black", 111));
        cars.add(new Car("BCD", "blue", 222));
        cars.add(new Car("CDE", "white", 333));
        cars.add(new Car("DEF", "pink", 444));
        cars.add(new Car("EFG", "orange", 555));
        return cars;
    }
}
