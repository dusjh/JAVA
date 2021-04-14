package kr.co.bitcamp.overriding02;

public class CarTest {

    public static void main(String[] args) {
        
        Car car = new Car(80);
        car.speedUp();
        car.speedDown();
        car.stop();
        
        SportCar sportCar = new SportCar(150);
        sportCar.speedUp();
        sportCar.speedDown();
        sportCar.stop();
    }
}
