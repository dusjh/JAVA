package kr.co.bitcamp.object4;

public class TimeTest {
   public static void main(String[] args) {
    
       Time time = new Time();
       // time.hour = 10;  private으로 설정했기 때문에 접근 불가
       System.out.println(time.getHour());
       System.out.println(time);
       
       // 시간 설정
       time.setHour(12);
       System.out.println(time);
       time.setMinute(16);
       System.out.println(time);
       time.setSecond(8);
       System.out.println(time);
       
       time.setHour(223);
       System.out.println(time);  // 시간을 잘못 입력했습니다.
       time.setMinute(99);
       System.out.println(time);  //분을 잘못 입력했습니다.
  
   } 

}
