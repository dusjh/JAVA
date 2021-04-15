package kr.co.bitcamp.modifier02;

import kr.co.bitcamp.modifier01.Phone; //ctrl+shift+O
public class AccessClass2 extends Phone {

    // 포함관계
    Phone phone = new Phone("iPhone13", "PBlue", "Apple");
    
    public void mathod() {
        // System.out.println(phone.);   ->  protected 접근확인(다른 패키지에서는 사용 불가능)
    }

}
