package exam3;

public class Exam1 {
    public static void main(String[] args) {
        Car car = new SuperCar();
        car.putOnGas();
        car.run();
        car = new EcoCar();
        car.putOnGas();
        car.run();
    }
}
