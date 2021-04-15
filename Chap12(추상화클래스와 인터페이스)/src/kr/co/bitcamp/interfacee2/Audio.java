package kr.co.bitcamp.interfacee2;

public class Audio implements RemoteControl {
    
    private int volume;     // this.volume
    
    @Override
    public void turnOn() {  
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {    
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int voulme) {     // 로컬 volume
        
         // voulme이 0~10 사이에서만 움직일 것으로 프로그래밍 함.
        if(voulme > RemoteControl.MAX_VOLUME) {  // 타클래스의 상수 선언은 -> 클래스이름.상수
            System.out.println("Audio 볼륨의 최대치 값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
        }//if끝
        else if(voulme < RemoteControl.MIN_VOLUME) {
            System.out.println("Audio 볼륨의 최소치 값은 0입니다.");
        }//else if끝
        else {
         this.volume = voulme;
        }//else끝
        System.out.println("현재 Audio 볼륨: "+this.volume);
    }//setvol끝
}
