package kr.co.bitcamp.exception01;

public class NullPointerTest {

    public static void main(String[] args) {
       
        String str = null;
        
        // 객체(인스턴스)가 없는데 인스턴스에 있는 toString()을 어떻게 호출하냐 
        // -> NullPointerException 예외발생
        // System.out.println(str.toString());

        try {
            System.out.println(str.toString());
        } catch(Exception e) {
           System.out.println(e.getMessage());     // getMessage: 예외에 대한 메시지 출력
        }       
    }
}
