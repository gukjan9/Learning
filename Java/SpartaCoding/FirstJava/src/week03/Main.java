package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        double speed = car.gasPedal(100, 'D');
        System.out.println("speed : "+speed);

        boolean lights = car.onOffLights();
        System.out.println("Lights : "+lights);

        car.carSpeeds(100, 80);
        car.carSpeeds(110, 120, 150);
    }
}
