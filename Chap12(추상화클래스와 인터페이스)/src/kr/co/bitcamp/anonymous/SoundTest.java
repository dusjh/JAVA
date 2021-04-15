package kr.co.bitcamp.anonymous;

// 익명 클래스
public class SoundTest {
    public static void main(String[] args) {
        
        // 익명 구현 객체(이름 없음)
        // UI 이벤트 처리, 스레드 객체 간편하게 생성 시 등 잠깐 사용할 목적으로 사용된다.
        
        // 원래의 타입이 Soundable 인터페이스임.
        // new Soundable()->익명 구현객체 안에 있는 생성자를 호출함.
        Soundable soundable = new Soundable() {   
            
            // 클래스이므로 블럭{} 내부적으로 멤버들을 선언할 수 있다.
            // 대신 외부에서는 접근이 불가하다.
            int a = 10;
            
            public void method() {
                System.out.println("익명 구현 객체의 메서드");
            }
            
            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("첫번째 익명 구현 객체: "+str);
                System.out.println(str+"에 물을 담습니다.");
                System.out.println(str+"에 숟가락으로 소리를 냅니다.");  
                
                // 내부에서 호출 가능
                this.method();
                System.out.println(this.a); 
            }
        };        
        soundable.sound();
        // soundable.a();       -> 외부에서 호출 불가 (부모타입 멤버가 아님)  
        // soundable.method();  -> 외부에서 호출 불가 (부모타입 멤버가 아님)  
    }
}
