package kr.co.bitcamp.nongeneric;

// 제네릭 미사용

public class Person {
    
    private Object object;
    
    // 기본생성자
    public Person() {       
    }

    // getter/setter 생성
    // getter의 리턴 타입: Object
    public Object getObject() {
        return object;
    }

    // setter의 매개변수: Object
    // ->모든 클래스를 다 매개변수, 리턴타입으로 하겠다.(= 다형성 적용)
    public void setObject(Object object) {
        this.object = object;
    }
}
