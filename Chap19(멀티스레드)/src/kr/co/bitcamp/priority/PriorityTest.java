package kr.co.bitcamp.priority;

// 우선순위는 10으로 갈수록 높고, 1로 갈수록 낮음 (5는 중간)
public class PriorityTest {

    public static void main(String[] args) {
        // 메인 스레드의 우선순위
        Thread thread = Thread.currentThread();   //main 스레드 출력
        System.out.println(thread.getName()+": "+thread.getPriority());  
        
        for(int i=1; i<=10; i++) {
         Thread thread2 = new CalcThread("Thread: "+i);
         
         // Thread 1~9는 우선순위가 가장 낮다.
         if(i != 10) {
             thread2.setPriority(Thread.MIN_PRIORITY);  // =thread.setPriority(1). 상수 MIN_PRIORITY: 1         
         } 
         // Thread 10은 우선순위가 10으로 가장 높다.
         else {
             thread2.setPriority(Thread.MAX_PRIORITY);  // =thread.setPriority(10). 상수 MAX_PRIORITY: 10
         }
         
         thread2.start();     
       }
        /*
         * 아무리 우선순위를 10으로 주었다고 해도 작업을 마치는 빈도가 높을 뿐이지, 무조건 100% 먼저 끝낸다는 보장이 없다.
         * 
         * 소결론: 자바는 순환할당(Round-Robin)방식을 사용하고 있기 때문에, CPU 스케줄러의 상태에 따라 달라진다.
         */
    }
}
