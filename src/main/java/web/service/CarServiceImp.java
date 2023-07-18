package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int number) {
        return carDao.getCars(number);

    }
}
