package kr.co.bitcamp.mutithread02;

public class BeepTest {

    public static void main(String[] args) {
        
        Thread thread = new Beep();      // 필드의 다형성 적용
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("따당");
            
            try {
                Thread.sleep(900);
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
