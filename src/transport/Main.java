package transport;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> mechanicsByCar = new HashMap<>();

        // Добавляем автомобили и механиков в HashMap
        List<String> mechanicsForCar1 = new ArrayList<>();
        mechanicsForCar1.add("Механик Андрей");
        mechanicsForCar1.add("Механик Сергей");
        mechanicsByCar.put("Аudi R8", mechanicsForCar1);

        List<String> mechanicsForCar2 = new ArrayList<>();
        mechanicsForCar2.add("Механик Александр");
        mechanicsForCar2.add("Механик Антон");
        mechanicsByCar.put("BMW X5", mechanicsForCar2);

        List<String> mechanicsForCar3 = new ArrayList<>();
        mechanicsForCar3.add("Механик Андрей");
        mechanicsForCar3.add("Механик Александр");
        mechanicsByCar.put("Nisan Tiana", mechanicsForCar3);

        List<String> mechanicsForCar4 = new ArrayList<>();
        mechanicsForCar4.add("Механик Антон");
        mechanicsForCar4.add("Механик Сергей");
        mechanicsByCar.put("Mersedes CLA", mechanicsForCar4);

        // Выводим все пары ключ-значение через цикл for each
        for (Map.Entry<String, List<String>> entry : mechanicsByCar.entrySet()) {
            String car = entry.getKey();
            List<String> mechanics = entry.getValue();
            System.out.println(car + " обслуживают механики: " + mechanics);
        }

        ArrayList<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanicAndrei = new Mechanic("Андрей", "Смертин", "«Рога и копыта»");
        Mechanic mechanicAnton = new Mechanic("Антон", "Бессмертных", "«Рога и копыта»");
        Mechanic mechanicAlexandr = new Mechanic("Александр", "Смирнов", "«Очумелые ручки»");
        Mechanic mechanicSergei = new Mechanic("Сергей", "Невизучий", "«Прямые руки»");

        DriverB<Car> driverB = new DriverB<>("Петров Петр Петрович", true, 5);
        DriverB<Car> driverB2 = new DriverB<>("Петров2 Петр2 Петрович2", true, 2);
        DriverB<Car> driverB3 = new DriverB<>("Петров3 Петр3 Петрович3", true, 6);
        DriverB<Car> driverB4 = new DriverB<>("Петров4 Петр4 Петрович4", true, 8);
        Car car = new Car("Audi", "R8", 4.0, BodyType.TYPE3, driverB, List.of(mechanicAnton , mechanicSergei)) {
            @Override
            public void tmeBestCircleTime() {
            }

            @Override
            public void maxSpeed() {
            }
        };
        Car car2 = new Car("BMW", "X5", 4.0, BodyType.TYPE1, driverB2, List.of(mechanicSergei)) {
            @Override
            public void tmeBestCircleTime() {
            }

            @Override
            public void maxSpeed() {

            }
        };
        Car car3 = new Car("Nissan", "Tiana", 3.0, BodyType.TYPE3, driverB3, List.of(mechanicAlexandr)) {

            @Override
            public void tmeBestCircleTime() {

            }

            @Override
            public void maxSpeed() {
            }
        };
        Car car4 = new Car("Mersedes", "CLA", 4.0, null, driverB4, List.of(mechanicAndrei)) {
            @Override
            public void tmeBestCircleTime() {
            }

            @Override
            public void maxSpeed() {

            }
        };
        System.out.println(car);
        car.printType();
        car.passDiagnostics();
        System.out.println(car2);
        car2.printType();
        System.out.println(car3);
        car3.printType();
        System.out.println(car4);
        car4.printType();
        System.out.println("==================");
        car.print();
        System.out.println("==================");
        DriverD<Bus> driverD = new DriverD<>("Сергеев Сергей Сергеевич", true, 8);
        DriverD<Bus> driverD2 = new DriverD<>("Сергеев2 Сергей2 Сергеевич2", true, 5);
        DriverD<Bus> driverD3 = new DriverD<>("Сергеев3 Сергей3 Сергеевич3", true, 7);
        DriverD<Bus> driverD4 = new DriverD<>("Сергеев4 Сергей4 Сергеевич4", true, 10);
        Bus bus = new Bus("Volvo", "7700", 10.00, Capacity.L, driverD, List.of(mechanicSergei)) {

            @Override
            public void tmeBestCircleTime() {

            }

            @Override
            public void maxSpeed() {

            }
        };
        Bus bus2 = new Bus("Mercedes", "5600", 7.00, Capacity.S, driverD2, List.of(mechanicSergei)) {

            @Override
            public void tmeBestCircleTime() {
            }

            @Override
            public void maxSpeed() {
            }
        };
        Bus bus3 = new Bus("Volvo", "7600", 11.00, Capacity.EL, driverD3, List.of(mechanicSergei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        Bus bus4 = new Bus("Mercedes", "3300", 9.0, Capacity.ES, driverD4, List.of(mechanicSergei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        System.out.println(bus);
        bus.printType();
        try {
            bus.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы диагностику проходить не должны!");
        }

        System.out.println(bus2);
        bus2.printType();
        try {
            bus2.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы диагностику проходить не должны!");
        }

        System.out.println(bus3);
        bus3.printType();
        try {
            bus3.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы диагностику проходить не должны!");
        }

        System.out.println(bus4);
        bus4.printType();
        try {
            bus4.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы диагностику проходить не должны!");
        }

        System.out.println("==================");
        bus.print();
        System.out.println("==================");
        DriverC<Truck> driverC = new DriverC<>("Иванов Иван Иванович", true, 8);
        DriverC<Truck> driverC2 = new DriverC<>("Иванов2 Иван2 Иванович2", true, 7);
        DriverC<Truck> driverC3 = new DriverC<>("Иванов3 Иван3 Иванович3", true, 3);
        DriverC<Truck> driverC4 = new DriverC<>("Иванов4 Иван4 Иванович4", true, 14);
        Truck trucks = new Truck("Volvo", "8600", 9.3, LoadCapacity.N1, driverC, List.of(mechanicAndrei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        Truck trucks2 = new Truck("Volvo", "9500", 10.4, LoadCapacity.N2, driverC2, List.of(mechanicAndrei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        Truck trucks3 = new Truck("Volvo", "9600", 9.3, LoadCapacity.N3, driverC3, List.of(mechanicAndrei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        Truck trucks4 = new Truck("КамАЗ", "4308", 6.7, null, driverC4, List.of(mechanicAndrei)) {

            @Override
            public void tmeBestCircleTime() {

            }
            @Override
            public void maxSpeed() {

            }
        };
        System.out.println(trucks);
        trucks.printType();
        trucks.passDiagnostics();
        System.out.println(trucks2);
        trucks2.printType();
        System.out.println(trucks3);
        trucks3.printType();
        System.out.println(trucks4);
        trucks4.printType();
        System.out.println("==================");
        trucks.print();
        System.out.println("==================");
        System.out.println(driverB.receiveAndPrintInformation(car2));
        System.out.println(driverB2.receiveAndPrintInformation(car));
        System.out.println(driverB3.receiveAndPrintInformation(car3));
        System.out.println(driverB4.receiveAndPrintInformation(car4));
        System.out.println("==================");
        System.out.println(driverC.receiveAndPrintInformation(trucks));
        System.out.println(driverC2.receiveAndPrintInformation(trucks2));
        System.out.println(driverC3.receiveAndPrintInformation(trucks3));
        System.out.println(driverC4.receiveAndPrintInformation(trucks4));
        System.out.println("==================");
        System.out.println(driverD.receiveAndPrintInformation(bus));
        System.out.println(driverD2.receiveAndPrintInformation(bus2));
        System.out.println(driverD3.receiveAndPrintInformation(bus3));
        System.out.println(driverD4.receiveAndPrintInformation(bus4));
        System.out.println("==================");
        List<Transport> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(trucks);
        cars.add(trucks2);
        cars.add(trucks3);
        cars.add(trucks4);
        cars.add(bus);
        cars.add(bus2);
        cars.add(bus3);
        cars.add(bus4);

        for (Transport j : cars) {
            System.out.println(j + ", " + j.getDriver() + ", " + j.getMechanics());
        }
        System.out.println("==================");
        Queue<Transport> transportSS = new ArrayDeque<>();
        ServiceStation serviceStation = new ServiceStation(transportSS);

        for (Transport transport : cars) {
            serviceStation.addACarToTheQueue(transport);
        }
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        serviceStation.addACarToTheQueue(car);
        serviceStation.addACarToTheQueue(car2);
        serviceStation.addACarToTheQueue(car3);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        serviceStation.addACarToTheQueue(car4);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
    }
}


