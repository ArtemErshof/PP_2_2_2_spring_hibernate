package web.servise;

import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCars(int quantity) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Z4", 300));
        cars.add(new Car("AUDI", "TT", 250));
        cars.add(new Car("FIAT", "IDEA", 190));
        cars.add(new Car("LADA", "VESTA", 230));
        cars.add(new Car("RENAULT", "LOGAN", 210));
        List<Car> carsList = new ArrayList<>();
        Iterator<Car> carIterator = cars.listIterator();
        int carCount = (quantity >= 5 || quantity < 0) ? 5 : quantity;
        for (int i = 0; i < carCount; i++) {
            carsList.add(carIterator.next());
        }
        return carsList;
    }
}
