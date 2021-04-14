package kr.co.bitcamp.object4;
/*
 * 접근 제어자(Access Modifier)
 * 1. private: 같은 클래스 내에서만 접근 가능하다.
 * 2. protected: 같은 패키지, 자손 클래스에서만 접근 가능하다.
 * 3. default: 같은 패키지에서만 접근 가능하다.(생략 가능)
 * 4. public: 누구나 다 접근 가능하다.
 */
public class Time {
    
    private int hour;
    private int minute;
    private int second;
    
    
     // 시
    //getter(): 멤버변수의 값을 읽어가는 메서드
    public int getHour() {
        return this.hour;
    }
    
    // setter(): 멤버변수의 값을 수정하는 메서드
    public void setHour(int hour) {
        // 시간에 대한 예외처리 코드를 작성
        if(hour < 0 || hour > 23) {
            System.out.println("시간을 잘못 입력했습니다.");
            return;
        }        
        this.hour = hour;
    }
    
    //분
    public int getMinute() {
        return this.minute;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) {
            System.out.println("분을 잘못 입력했습니다.");
            return;
        }
        this.minute = minute;
    }

    
    // 초
    public int getSecond() {
        return this.second;
  }
    public void setSecond(int sencond) {
        if(minute < 0 || minute > 59) {
            System.out.println("초를 잘못 입력했습니다.");
            return;
        }
        this.second = second;
    }
    
    
    public String toString() {
        return this.getHour()+"시"+
                    getMinute()+"분"+
                    getSecond()+"초";
    }
 
}
