package transport;

import java.util.HashMap;
import java.util.List;

public class CarMechanicsMap {
    private HashMap<Car, List<Mechanic>> carMechanicsMap;

    public CarMechanicsMap() {
        carMechanicsMap = new HashMap<>();
    }

    public void addCarMechanicsPair(Car car, List<Mechanic> mechanics) {
        carMechanicsMap.put(car, mechanics);
    }

    public void printAllPairs() {
        for (Car car : carMechanicsMap.keySet()) {
            List<Mechanic> mechanics = carMechanicsMap.get(car);
            System.out.println("Автомобиль: " + car + ", список механиков: " + mechanics);
        }
    }
}
