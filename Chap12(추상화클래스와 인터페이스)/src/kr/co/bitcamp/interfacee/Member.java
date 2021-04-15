package kr.co.bitcamp.interfacee;

// Creature 인터페이스를 구현한 클래스
public class Member implements Creature {

    @Override
    public void method() {
        System.out.println("인터페이스 Creature를 구현한 Member의 method() 호출됨.");       
    }
    
    public void method1() {
        System.out.println("Member클래스에 있는 멤버 메서드입니다.");
    }
}
