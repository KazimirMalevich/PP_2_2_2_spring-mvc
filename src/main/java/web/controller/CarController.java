package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;


import java.util.List;
@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        CarService carDaoImp= new CarServiceImp(new CarDaoImp());
        List<Car> list = carDaoImp.getCars(allCars);
        model.addAttribute("list", list);
        return "cars";

    }
}
