package kr.co.bitcamp.polymorphism03;

// 조상클래스
public class Parent {
    
    int x = 100;
    
    /*
     * 매개변수의 타입이 Object라는 것은 어떠한 클래스도 다 받아주겠다는 것이다.
     * = 매개변수의 다형성 적용됨.
     */
    public void type(Object obj) {
        if(obj instanceof Parent) {
            Parent parent = (Parent)obj;    // 강제 타입캐스팅(다운캐스팅)
            System.out.println("조상클래스의 멤버 x값: "+parent.x);
        }
        else {
            System.out.println("Parent 타입의 객체가 아닙니다. 상속관계에 있지 않은 클래스.");            
        }    
    }//type끝
    
    
    public void method() {
        System.out.println("조상메서드 호출");
    }
}
