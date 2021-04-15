package kr.co.bitcamp.polymorphism02;

public class CarTest {

    public static void main(String[] args) {
        
        Car car = null;
        SportCar sportCar = new SportCar();
        PoliceCar policeCar = new PoliceCar();
        
        sportCar.SpeedUp();    
        
        car = sportCar;     // 업캐스팅(자손타입 sportCar -> 조상타입 car): 조작할 수 있는 멤버가 줄어듦.
        // car.speedUp();      호출 불가
        
        SportCar sportCar2  = null;
        sportCar2 = (SportCar)car;   // 다운캐스팅(조상 car -> 자손 sportCar): 조작할 수 있는 멤버가 늘어남.
                                        // 다운캐스팅을 할 때, 반드시 명시적으로 형변환 코드를 작성해야 함.
        sportCar2.SpeedUp();       
    }
}
