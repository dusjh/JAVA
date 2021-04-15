package kr.co.bitcamp.modifier01;

public class AccessClass {
    public static void main(String[] args) {
        
        Phone phone = new Phone("iPhone12", "PBlue", "Apple");
        //phone.model   -> protected 접근확인 (같은 패키지에서는 사용가능)
    }

}
