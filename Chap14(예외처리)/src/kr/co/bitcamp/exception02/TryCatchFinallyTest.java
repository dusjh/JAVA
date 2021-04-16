package kr.co.bitcamp.exception02;

// finally는 예외가 발생하든 안하든 실행시킴
public class TryCatchFinallyTest {

    public static void main(String[] args) {
        /*
         * Class 클래스: 문자열을 가지고 클래스로 만들어서 변환해줌.(동적객체)
         * 인스턴스의 정보만 리턴하고, 멤버를 사용하는 것은 안 된다.         
         */
        
        try {  //특정 데이터베이스를 로드할 때 forname 사용
            Class class1 = Class.forName("kr.co.bitcamp.exception02.TryCatchFinallyTest");
            System.out.println("클래스를 찾았습니다.");
            System.out.println(class1.getName());   // 패키지명+클래스명 출력
            System.out.println(class1.getSimpleName()); // 클래스명만 출력
            
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다.");
            e.printStackTrace();      // 예외가 발생하는 부분 추적
        } finally { // finally는 반드시 실행함
            System.out.println("프로그램을 안전하게 종료합니다.");
        }

    }
}
