package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "Focus", 2012));
        list.add(new Car("Ferrari", "FF", 2018));
        list.add(new Car("Aston Martin", "DB9", 2010));
        list.add(new Car("FIAT", "Panda", 2003));
        list.add(new Car("BMW", "320d", 2019));
        list = CarServiceImp.getCars(list, allCars);
        model.addAttribute("list", list);
        return "cars";

    }
}
