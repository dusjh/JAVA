package kr.co.bitcamp.superr;

public class SuperTest {
    public static void main(String[] args) {
        
        /*
         * 자손 클래스의 인스턴스를 생성하면, 조상 클래스의 인스턴스 생성이 제일 먼저 이루어지고나서
         * 자손 클래스의 인스턴스가 생성되어 합쳐진 상태로 heap에 할당된다.
         */
        Child child = new Child();
        child.show();
        System.out.println();
                
        Parent parent = new Parent(1000);
        parent.show();
        System.out.println();
        
        
        // 다형성
        Parent parent2 = new Child();
        parent2.show();
    }
}
