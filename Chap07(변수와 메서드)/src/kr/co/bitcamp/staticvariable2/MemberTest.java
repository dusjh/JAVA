package kr.co.bitcamp.staticvariable2;

public class MemberTest {
    
    public static void study() {
        System.out.println("자바 개발자가 필요합니다.");
    }
    
    public void memberMethod() {
        System.out.println("인스턴스 메서드");
    }
    
    
    
    public static void main(String[] args) {
        
        // static 멤버들이므로 인스턴스 생성없이 얼마든지 클래스명.정적멤버명으로 접근이 가능하다.
        // static은 static만 호출이 가능하다.
        Member.sMethod();
        Member.cv = 500;
        Member.sMethod();
        
       // 인스턴스 멤버들을 사용하기 위해서는 반드시 new 연산자가 힙에 인스턴스를 만들어야 사용이 가능하다.
       Member member = new Member();
       member.iMethod();
       member.iv = 999;
       member.iMethod();
        
       
        // static 메서드 호출
        MemberTest.study();
        
        // 인스턴스 메서드 호출
        MemberTest mtest = new MemberTest();
        mtest.memberMethod();
    }

}
