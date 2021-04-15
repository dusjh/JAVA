package kr.co.bitcamp.interfacee;

// 인터페이스의 본질은 추상메서드이다.
public interface Creature {

    // static final 생략 가능. 컴파일 시 add 해준다. 부수적 멤버개념.
    int MAX = 10;
    
    // abstract 생략가능. 컴파일 시 컴파일러가 add 해준다.
    public void method();     
}
