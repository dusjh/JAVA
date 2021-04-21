package kr.co.bitcamp.mutithread01;

public class BeepSoundTest01 {
    public static void main(String[] args) {
        
        // 직접 스레드를 생성하는 방법
        // 방법 1 ==> 구현객체(runnable) 대입
        
        Runnable runnable = new Beep();
        Thread thread = new Thread(runnable);  
        thread.start();

        /*
         * 스레드는 한 번 start() 실행하고 나면, 재실행이 안된다.
         * 재 실행을 하고자 한다면, 인스턴스를 한 개 더 만들어야 한다.
         */
          thread = new Thread(runnable);
          thread.start();
        
        for(int i =0; i <5; i++) {
            System.out.println("비프음 실행하는 스레드명 : " + 
                    Thread.currentThread().getName());
            
            System.out.println("삐용~~");
            
            try {
                Thread.sleep(500);
                
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
                
            }
        }
 
    }

}
