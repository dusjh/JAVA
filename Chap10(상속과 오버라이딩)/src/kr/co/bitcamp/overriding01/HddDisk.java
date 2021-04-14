package kr.co.bitcamp.overriding01;

// 조상클래스
public class HddDisk extends Object {  //extends Object는 생략 가능
    
    // 멤버 변수
    int capacity;       // 용량
    int rpm;            // 속도
    
    // 기본 생성자 (source->generate constructor using fields)
    public HddDisk() {
        // super();   생략 가능
    }

    // 매개변수가 있는 생성자
    public HddDisk(int capacity, int rpm) {
        // super();
        this.capacity = capacity;
        this.rpm = rpm;
    }

    public HddDisk(int capacity) {
        this.capacity = capacity;
    }
    
    // 사용자 정의 메서드
    public String status() {
        String str = "하드디스크 용량: "+this.capacity+"\n"+
                        "하드디스크 속도: "+this.rpm+"(rpm)";
        return str;
    }
}
