package kr.co.bitcamp.system;

public class SystemTest01 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 5) {
                //프로그램을 종료시킨다.
                System.exit(0);    // 정상적으로 종료시키려면 값을 0으로 준다.                
            }
        }
    }
}
