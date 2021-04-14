package kr.co.bitcamp.object2;

public class Student {
    // 멤버 필드(멤버 변수)
    String name;
    int age;
    
    // Object 클래스의 toString() 오버라이딩(재정의)
    @Override
    public String toString() {
        String str = "이름: " + this.name+   // this: 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 활성화 된다.) 
                    ", 나이: "+ this.age;    
        return str;
    }
    
// this는 static 메서드나 클래스 앞에 사용할 수 없다.
//    public static String getName() {
//        return this.name;
//    }

}
