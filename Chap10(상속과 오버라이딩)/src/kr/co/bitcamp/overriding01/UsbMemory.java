package kr.co.bitcamp.overriding01;

public class UsbMemory extends HddDisk {
    
    // 멤버 변수
    int capacity;   // 용량
    int rpm;        // 속도
    
    // 기본생성자
    public UsbMemory() {
        
    }
    
    // 매개변수가 있는 생성자
    public UsbMemory(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }
    
    // 조상클래스의 메서드를 오버라이딩 함.
    @Override
    public String status() {
        String str = "USB메모리 용량: "+this.capacity+"\n"+
                "USB메모리 속도: "+this.rpm+"(rpm)";
        return str;
    }
    
    //오버로딩
    public String status(int i) {
        String str = "USB메모리 용량2: "+i+"\n"+
                "USB메모리 속도2: "+this.rpm+"(rpm)";
        return str;
    }      
}
