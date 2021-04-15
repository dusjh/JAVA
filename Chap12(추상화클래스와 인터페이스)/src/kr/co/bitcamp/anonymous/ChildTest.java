package kr.co.bitcamp.anonymous;

public class ChildTest {

    public static void main(String[] args) {
        // 익명 자손 객체(이름 없음)
        // UI 이벤트 처리, 스레드 객체 간편하게 생성 시 등 잠깐 사용할 목적으로 사용된다.
        
        // 원래의 타입이 Parent 클래스임.
        Parent parent = new Parent() {
            
            int b = 20;
            
            public void method1() {
                System.out.println("익명 자손 객체의 메서드");
            }
            
            @Override
            public void method() {                
                int a = 10;
                System.out.println("a: "+a);
                
                System.out.println(this.b);
                this.method1();              
            }  
        };
        
        parent.method();
//        parent.b();           -> 외부에서 호출 불가 (부모타입 멤버가 아님)  
//        parent.method1();     -> 외부에서 호출 불가 (부모타입 멤버가 아님)
    }
}
