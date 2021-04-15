package kr.co.bitcamp.interfacee2;

public class Television implements RemoteControl {
    
    private int volume; 

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        // voulme이 0~10 사이에서만 움직일 것으로 프로그래밍 함.
        if(volume > RemoteControl.MAX_VOLUME) {  // 타클래스의 상수 선언은 -> 클래스이름.상수
            System.out.println("TV 볼륨의 최대치 값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
        }//if끝
        else if(volume < RemoteControl.MIN_VOLUME) {
            System.out.println("TV 볼륨의 최소치 값은 0입니다.");
        }//else if끝
        else {
         this.volume = volume;
        }//else끝
        System.out.println("현재 TV 볼륨: "+this.volume);
    }
}
