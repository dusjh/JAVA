package kr.co.bitcamp.overriding02;

// 부모 클래스
public class Car {
    int speed;
    
    // 기본생성자
    public Car() {
        
    }
    
    public Car(int speed) {
        this.speed = speed;        
    }
    
    // 메서드 앞에 final이 붙으면 자손 클래스에서 오버라이딩 불가능.
    // 메서드 앞에 final이 오면 마지막 메서드라는 의미(상속 불가)
    public final void speedUp() {
        this.speed += 10;
        System.out.println("차가 "+this.speed+"속도로 달립니다.");
    }//speedUp끝
    
    public void speedDown() {
        this.speed -= 10;
        System.out.println("차가 "+this.speed+"속도로 달립니다.");
    }//speedDown끝
    
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }//stop끝
    

}
