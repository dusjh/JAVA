package kr.co.bitcamp.constructor;

public class Student {
    
    // 인스턴스 멤버변수 선언
    private String name;
    private int age;
    
    // 기본 생성자
    // 클래스명과 생성자명이 반드시 같아야 한다.
    // 생성자는 리턴타입이 존재하지 않는다.(void 쓰지 않는다)
    // 생성자가 하나도 없는 클래스는 기본적으로 컴파일 시에 컴파일러가 자동으로 기본생성자를 추가해 준다.
    public Student() {
        System.out.println("기본 생성자 호출");
        // return;  return 써도 되고 안 써도 됨.        
    }
    
    // 매개변수가 있는 생성자
    public Student(String name, int age) {
        System.out.println("매개변수가 있는 생성자 호출");
        this.name = name;
        this.age = age;
    }
    
    public Student(String name) {
        System.out.println("매개변수가 String만 있는 생성자 호출");
        this.name = name;
    }
    
    public Student(int age) {
        System.out.println("매개변수가 int만 있는 생성자 호출");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.getName()+", "+this.getAge();
    }
  
}
