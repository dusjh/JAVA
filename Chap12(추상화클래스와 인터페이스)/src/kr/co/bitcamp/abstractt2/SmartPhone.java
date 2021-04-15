package kr.co.bitcamp.abstractt2;

public class SmartPhone extends Phone {

    // 생성자
    public SmartPhone(int serialNo, String company, String owner) {
        super(serialNo, company, owner);        
    }

    @Override
    public void turnOn() {       
        System.out.println("스마트폰이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰이 꺼졌습니다.");
    }

    // 스마트폰클래스의 자체 메서드
    public void internetSearch() {
        System.out.println("구글 검색을 합니다.");
    }
}
