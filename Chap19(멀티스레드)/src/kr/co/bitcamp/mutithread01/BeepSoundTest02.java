package kr.co.bitcamp.mutithread01;

public class BeepSoundTest02 {
    public static void main(String[] args) {
        // 직접 스레드를 생성하는 방법
       // 방법 2 ==>  익명구현객체 
        
       Thread thread = new Thread(new Runnable() {
        
        @Override
        public void run() {
            System.out.println("비프음 실행하는 스레드명 : " + 
                    Thread.currentThread().getName());
        }
    });
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
