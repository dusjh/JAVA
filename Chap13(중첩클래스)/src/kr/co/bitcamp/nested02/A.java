package kr.co.bitcamp.nested02;

public class A {
    
    // 기본 생성자
    public A() {
        System.out.println("------------------------");
        System.out.println("외부클래스 A의 생성자 호출");
        
        B b = new B();     // 인스턴스 멤버 클래스 B는 외부클래스 A의 멤버이기 때문에 객체 생성 가능
        System.out.println(b.a);
        b.method1();
        
        C c = new C();
        System.out.println(c.a);
        System.out.println(c.c);
        c.method1();
        c.method2();
        
//      D d = new D();   -> 메서드 내부에 선언되어 있기 때문에 안 보임(객체 생성불가)
        this.method();
        System.out.println("------------------------");
    }
    
    // 인스턴스 멤버클래스 B
    class B {
        int a = 10;
        // static int cv = 20;  -> static 멤버 호출 불가
        
        // 생성자
        public B() {
            System.out.println("중첩클래스 B의 생성자 호출");
        }
        
        // 메서드
        public void method1() {
            System.out.println("B 클래스의 멤버 메서드 호출");
        }
        
       //  static void method2() {} -> static 메서드 호출 불가
     
    }
    
    // 정적 멤버클래스 C
    static class C {
        
        int a = 10;
        static int c = 20;
        
        public C() {
            System.out.println("정적 멤버클래스 C의 생성자 호출");
     }
        
        public void method1() {
            System.out.println("정적 멤버클래스 C의 method1 호출");
        }
        
        public static void method2() {
            System.out.println("정적 멤버클래스 C의 정적메서드 method2 호출");
        }     
    }
   
    // 로컬클래스
    public void method() {
        class D {
            int a = 1000;
            
            // 생성자
            public D() {
                System.out.println("로컬클래스 D의 생성자 호출");
            }
            
            // 메서드
            public void lmethod() {
                System.out.println("로컬클래스 D의 멤버 메서드 lmethod 호출");
            } 
        }
        
        // 로컬클래스는 메서드 내부에서만 생성 및 사용가능하다.
        D d = new D();
        d.lmethod();
    }   
}
