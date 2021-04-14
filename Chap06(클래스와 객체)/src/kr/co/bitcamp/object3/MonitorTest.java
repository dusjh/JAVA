package kr.co.bitcamp.object3;

public class MonitorTest {
    public static void main(String[]args) {
        
        // monitor 참조변수는 리모컨과 같은 것
        Monitor monitor = new Monitor();
        System.out.println(monitor);  // 주소값 출력
        
        monitor.power();    //on
        monitor.power();    //off
        monitor.power();    //on
        
        monitor.channel = 5;
        monitor.channelUP(); //6
        monitor.channelUP(); //7
        
        monitor.channelDown(); //6
        monitor.channelDown(); //5
    
        monitor.volumeUp(); //0 (default)
        monitor.volumeUp(); //1
        
        System.out.println(monitor);
        
        monitor.power();      
    }
}
