package kr.co.bitcamp.classs;

public class Person {
    
    private String name;
    private int age;
    
    // 매개변수가 없는 기본 생성자
    public Person() {
    }

    // 매개변수가 있는 생성자
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // getter 생성
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
