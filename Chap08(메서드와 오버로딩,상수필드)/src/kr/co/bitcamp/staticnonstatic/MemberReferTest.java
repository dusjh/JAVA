package kr.co.bitcamp.staticnonstatic;
// 멤버들 간의 참조여부 확인


public class MemberReferTest {
    
    int iv;         // 인스턴스 멤버변수(객체)
    static int cv;  // static(정적) 멤버변수
    
    // 인스턴스 메서드
    // static 변수와 메서드 호출 가능 이유: 인스턴스 메서드가 호출 될 때는 이미 인스턴스가 생성되어 있을 것임.
    public void instanceMethod() {
        System.out.println(this.iv);    // 인스턴스 변수 사용 가능
        System.out.println(cv);         // 정적 변수 사용 가능  
        staticMethod();                 // 정적 메서드 사용 가능
       
    }//instanceMethod

    
    
    // static 메서드
    // 인스턴스 변수와 메서드 호출 불가능 이유: 인스턴스가 언제 생성될지 아무도 모르기 때문에 
    // static메서드 내에서는 인스턴스 멤버들을 절대 사용할 수 없다.
    public static void staticMethod() {
       // System.out.println(this.iv);   // 인스턴스 변수 사용 불가능
        System.out.println(cv);          // 정적 변수 사용 가능 
       // this.instanceMethod();         // 인스턴스 메서드 사용 불가능
        
    }//staticMethod
    
}
