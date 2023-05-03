package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", 15, "blue"));
        carList.add(new Car("Mazda", 6, "red"));
        carList.add(new Car("Audi", 6, "white"));
        carList.add(new Car("Infinity", 56, "white"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}

