package kr.co.bitcamp.generic;

public class PersonTest {

    public static void main(String[] args) {
        
       // Person이라는 제네릭클래스에 T를 String으로 표기했기 때문에 무조건 String만 들어오게끔 생성. 
       Person<String> person = new Person<>();  
       
       person.setT("이성계");
       String str = person.getT();
       System.out.println(str);
       
       // 데이터의 통일화, 타입 변환 제거, 다른 타입을 넣으면 컴파일 시 예외를 발생시킨다.(=타입 체크함)
       Person<Integer> person2 = new Person<>();
       
       person2.setT(100);           // 자동 박싱
       int value = person2.getT();  // 자동 언박싱
       System.out.println(value);     
       
       
       // 사용자 정의 제네릭
       Person<Apple> person3 = new Person<>();
       person3.setT(new Apple());     // 자동 박싱
       Apple apple = person3.getT();  // 자동 언박싱
       System.out.println(apple);     
    }
}
