package kr.co.bitcamp.singleton;

import java.util.Calendar;
import java.util.Date;

public class UserTest {

    public static void main(String[] args) {
        
       // User user = new User();       private은 호출할 수 없음
        User user1 = User.getInstance();
        User user2 = User.getInstance();
        
        // 동일한 주소값 출력
        System.out.println("user1의 주소: "+user1);
        System.out.println("user2의 주소: "+user2);
        
        //Object 클래스의 equals(): 주소 비교
        if(user1.equals(user2)) {
            System.out.println("같은 객체입니다.");
        }else {
            System.out.println("다른 객체입니다.");
        }
           
        // 객체의 == 연산자: 주소 비교 연산
        if(user1 == user2) {
            System.out.println("같은 객체입니다.");         
        }else {
            System.out.println("다른 객체입니다.");
        }
        
        /*
         * 싱글톤 패턴 사용하는 이유:
         * 단 하나의 인스턴스를 생성해서 서로 공유를 원하고자 할 때 사용한다.
         * ex) 커넥션풀, 스레드풀, OS(운영체제)의 시간/날짜 등.
         */
        
        // 싱글톤 패턴을 사용하는 예시 Calendar
        //Calendar calendar = new Calendar();
        Calendar calendar =  Calendar.getInstance(); 
        Date date = calendar.getTime();
        System.out.println(date);
    }

}
