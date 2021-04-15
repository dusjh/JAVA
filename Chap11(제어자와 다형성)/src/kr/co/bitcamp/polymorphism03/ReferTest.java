package kr.co.bitcamp.polymorphism03;

public class ReferTest {

    public static void main(String[] args) {
        
        Parent parent = new Child();
        Child child = new Child();
        
        // 멤버변수는 원래 타입을 벗어나지 못한다.
        System.out.println(parent.x);
        System.out.println(child.x);
                
        // 멤버 메서드는 현재 참조하고 있는 인스턴스에 영향을 받음(오버라이드)
        parent.method();
        child.method();
        System.out.println();
        
        parent.type(child);
        parent.type(parent);
        parent.type(new Car());       
    }
}
