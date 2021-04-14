package kr.co.bitcamp.object3;

public class Monitor {
    
    // 멤버변수(필드)
    String color;   // 모니터의 색상
    int channel;    // 채널
    int volume;     // 볼륨
    boolean power;  // 전원(on/off) boolean기본값은 false
    
    // 멤버 메서드
    // 1. Monitor를 켜거나 끄는 기능을 하는 메서드
    public void power() {
        if(!this.power) {
            System.out.println("모니터가 켜졌습니다.");
            this.power = !power;
        }
        else {
            System.out.println("모니터가 꺼졌습니다.");
            this.power = !power;
        }      
    }
    
    // 2. channelUP
    public void channelUP() {
        this.channel++;
            System.out.println("현재 채널: "+this.channel);
        }
    
    // 3. channelDown
    public void channelDown() {
        this.channel--;
        System.out.println("현재 채널: "+this.channel);
   
    }

    //4. volumeUp
    public void volumeUp() {
        System.out.println("현재 음량: "+(this.volume++));
    }
    
    //5. volumeDown
    public void volumeDown() {
        System.out.println("현재 음량: "+(this.volume--));
    }
    
    //6. toString
    public String toString() {
        return "현재 채널: "+this.channel+
                ", 현재 볼륨: "+this.volume;
    }    
}
