package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao{
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Focus", 2012));
        cars.add(new Car("Ferrari", "FF", 2018));
        cars.add(new Car("Aston Martin", "DB9", 2010));
        cars.add(new Car("FIAT", "Panda", 2003));
        cars.add(new Car("BMW", "320d", 2019));
    }
    @Override
    public List<Car> getCars(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
