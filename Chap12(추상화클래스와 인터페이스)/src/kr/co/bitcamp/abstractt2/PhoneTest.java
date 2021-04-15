package kr.co.bitcamp.abstractt2;

public class PhoneTest {

    public static void main(String[] args) {
       
        // 추상클래스는 인스턴스 생성 불가
        // Phone phone = new Phone(111, "홍길동", "갤럭시21");

        SmartPhone smartPhone = new SmartPhone(202103, "SAMSUNG", "홍길동");
        smartPhone.showInfo();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
        System.out.println("----------------------------------------");
        
        TripleCameraPhone tCameraPhone = new TripleCameraPhone(202012, "Apple", "김철수");
        tCameraPhone.showInfo();
        tCameraPhone.turnOn();
        tCameraPhone.turnOff();
        tCameraPhone.camerOn();
        tCameraPhone.cameraOff();
        System.out.println("----------------------------------------");
        
        Phone[] phone = new Phone[10];
        phone[0] = new SmartPhone(201106, "Xiaomi", "이성계");
        phone[1] = new TripleCameraPhone(201112, "LG", "박지성");
        
        phone[0].turnOn();
        phone[0].turnOff();
        phone[1].turnOn();
        phone[1].showInfo();
    }
}
