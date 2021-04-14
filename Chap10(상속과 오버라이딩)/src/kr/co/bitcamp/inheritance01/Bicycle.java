package kr.co.bitcamp.inheritance01;
/*
 * 1. 상속(inheritance)이란?
 * 부모 클래스가 가지고 있는 속성(변수)들과 기능(메서드)들을 그대로 물려받아서 새로운 클래스를 만드는 것.
 * 이 때 물려받게 되는 원본 클래스를 부모클래스(Parent class), 슈퍼클래스(Super class), 기초/기반클래스(Base class)라고 부른다.
 * 상속받아 새롭게 만들어진 클래스를 자식클래스(Child class), 서브/하위클래스(Sub class), 파생클래스(Derived class)라고 부른다.
 * 
 * 2. 상속의 장점
 * -가장 큰 장점: 재활용성. 
 * 부모에 정의되어져 있는 멤버필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.
 * 상속 받은 메서드라고 해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능하다.
 * 
 * 3. 상속의 사용
 * 생성자, 초기화 블럭은 상속이 안 된다.
 * 부모 클래스의 접근제한자가 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능하다. 
 */

// 조상클래스
public class Bicycle {
    
    int id;
    String brand;
    String owner;
    
//    자식 클래스에서 추가된 것은 부모 클래스에 영향을 미치지 않는다.
//    public void method() {
//        this.secotr
//    }

}
