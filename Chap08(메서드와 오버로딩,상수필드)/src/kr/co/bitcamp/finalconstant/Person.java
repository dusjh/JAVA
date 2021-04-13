package kr.co.bitcamp.finalconstant;
/*
 * final 초기화 방법
 * 1. 선언과 동시에 초기화
 * 2. 생성자에서 단 한 번 초기화
 */
public class Person {
    // 선언과 동시에 초기화
    final String nation = "KOREA";          // 상수선언
    
    // 불변의 정적 상수
    // 무조건 선언과 동시에 초기화가 반드시 되어야 한다.
    // 공용데이터로써 사용되어진다.
    // 클래스별로 관리되어진다.(인스턴스별X)
    static final int MAX_NUMBER = 1000;    
    
    //생성자에서 초기화
    final int age;
    public Person(int age) {
        this.age = age;
  
    }

//    @Override
//    public String toString() {
//        return "nation: "+this.nation
//                +", age: "+this.age;
//      }
    
}
