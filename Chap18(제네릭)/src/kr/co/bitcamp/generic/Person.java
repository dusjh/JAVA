package kr.co.bitcamp.generic;

// 제네릭 사용

// Person이라는 클래스를 제네릭(generic) 타입으로 설계함.
public class Person<T> {
    /*
     *  T는 아직 타입이 정해지지 않았다는 의미.
     *  T는 개발코드에서 객체 생성시 정해진다.
     *  static은 올 수 없다.(어떤 것이 올지 모르기 때문에 미리 클래스 영역에 메모리할당을 할 수 없다) 
     */
    
    private T t;
    
    // 생성자
    public Person() {
        
    }

    // getter/setter
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
