package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarService;
import web.servise.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCarsTable(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImp();
        List<Car> carList = count == null ? carService.getCars(5) : carService.getCars(count);
        model.addAttribute("massage", "Table from" + " " + carList.size() + " " + "cars");
        model.addAttribute("cars", carList);
        return "cars";
    }
}
