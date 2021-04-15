package kr.co.bitcamp.polymorphism03;

// 자식클래스
public class Child extends Parent {
    
    int x = 200;
    
    @Override
    public void method() {
        System.out.println("자손메서드 호출");
    }

}
