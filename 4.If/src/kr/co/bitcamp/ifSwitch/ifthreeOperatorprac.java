package kr.co.bitcamp.ifSwitch;
// 삼항연산자
// 12시보다 작으면 오전, 크면 오후
public class ifthreeOperatorprac {
    public static void main(String[] args) {
        
        int hour = 10;
        
        // 삼항연산자 ?:
        String ampm = hour < 12 ?"오전" :"오후";
        System.out.println(ampm);
        
        // 10보다 작거나 같으면 100을 곱하시오
        int result = hour <= 10 ? hour*100 : hour;
        System.out.println(result);
    }

}
