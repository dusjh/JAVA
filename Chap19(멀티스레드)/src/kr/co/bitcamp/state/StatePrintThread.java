package kr.co.bitcamp.state;

public class StatePrintThread extends Thread {

   // 스레드의 상태를 알아보기 위해 멤버로 선언
   private TargetThread targetThread;
   
   public StatePrintThread(TargetThread targetThread) {
       this.targetThread = targetThread;
}
   @Override
    public void run() {
       while(true) {       
           // 스레드의 상태 정보를 알아낸다.
           // Thread.State는 Thread 클래스는 enum(열거형) 타입이다.
           Thread.State state = targetThread.getState();
           System.out.println("타켓스레드의 상태: "+state);
      
           // 스레드가 생성되었다면 실행.
           if(state == Thread.State.NEW) {
               targetThread.start();
           }
           
           // 무한루프를 빠져나가는 코드 (스레드가 종료된 경우)
           if(state == Thread.State.TERMINATED) {
               break;
           }
           
           try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
             
       }

    }   

}
