package kr.co.bitcamp.staticvariable2;

public class Member {
    int iv = 100;           //인스턴스 멤버변수
    static int cv = 300;    //static 멤버 변수
    
    // 인스턴스 메서드
    public void iMethod() {
        System.out.println("iv: "+this.iv);
        System.out.println("cv: "+Member.cv);  // static메서드 호출->클래스명.정적변수명
       }
    
    // static 메서드 
    public static void sMethod() {
        // System.out.println("iv: "+this.iv);  // 호출 안됨. 언제 인스턴스가 만들어질 지 모르기 때문.
        
        // cv는 static 변수이기 때문에 인스턴스 생성없이 접근 가능해야 한다.
        // static메서드 내에서는 얼마든지 접근 가능하다.
        System.out.println("cv: "+Member.cv);
        
        
        
        
    }

}
