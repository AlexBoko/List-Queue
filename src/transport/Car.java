package transport;

import java.text.DecimalFormat;
import java.util.List;

public abstract class Car extends Transport {
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType, Driver driver, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, mechanics, driver);
        this.setBodyType(bodyType);
    }

    @Override
    void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }
    @Override
    void finishTheMovement() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у легкового автомобиля " + getBrand() + " " + getModel());
    }
    @Override
    public void bestLapTime() {
        double min = 30.0;
        double max = 100.0;
        double bestLapTime = (min + (max - min) * Math.random());
        String formattedDouble = new DecimalFormat("#0.00").format(bestLapTime);
        System.out.println("Лучшее время круга у легкового автомобиля " + getBrand() + " " + getModel() + " в минутах: " + formattedDouble);
    }
    @Override
    public void maximumSpeed() {
        int min = 60;
        int max = 300;
        int bestLapTime = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость легкового автомобиля" + getBrand() + " " + getModel() + " состовляет: " + bestLapTime);
    }
    void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType() );
        }
    }
    public void print() {
        startMoving();
        bestLapTime();
        pitStop();
        maximumSpeed();
        finishTheMovement();
    }

    @Override
    void passDiagnostics() {
        System.out.println("Пройти диагностику!");
    }
}