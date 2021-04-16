package kr.co.bitcamp.exception01;

class A {}
class B extends A {}
class C extends A {}

interface I {}
class D implements I {}
class E implements I {}

public class ClassCastTest {

    public static void main(String[] args) {
        
        A a = new B();    // 업캐스팅
        B b = (B) a;      // 다운캐스팅 -> 캐스팅 연산자 붙여줘야 함.
        System.out.println("실행완료");
        
//        A a1 = new B();   
//        C c = (C) a1;   -> B와 C는 관련이 없기 때문에 ClassCastException 예외 발생
        
        A a1 = new C();   // 업캐스팅
        C c = (C) a1;     // 다운캐스팅 -> 캐스팅 연산자 붙여줘야 함.
        System.out.println("실행완료");

        
        I i = new D();
        D d = (D) i;
        System.out.println("실행완료");
        
//        I i2 = new D();
//        E e = (E) i2;    -> D와 E는 관련이 없기 때문에 ClassCastException 예외 발생
        
        I i2 = new E();
        E e = (E) i2;
        System.out.println("실행완료"); 
    }
}
