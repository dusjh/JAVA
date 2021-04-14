package kr.co.bitcamp.singleton;
//싱글톤

public class User {
    
    //1. 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성.
    private static User signleton = new User();
    
    //2.private-> 해당 클래스를 외부에서 new연산자로 인스턴스를 생성하지 못하게 막는다.
    private User() {
        
    }
    //3. 해당 클래스 멤버의 주소를 넘겨주기(공유하기) 위해 외부에서 호출할 수 있는 getter()메서드를 제공. 
    public static User getInstance() {
        return User.signleton;    // 주소값 리턴
    }
 
}
