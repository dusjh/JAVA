package kr.co.bitcamp.hashset02;

import java.util.Objects;

public class Member {
    
    private String name;
    private int age;
    
    public Member(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    /*
     *  hashCode(): 객체의 hashCode를 리턴한다.
     *  hashCode는 일반적으로 각 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값이다.
     *  따라서 두 객체가 동일한 객체인지 비교할 때 사용할 수 있다.
     *  
     *  논리적 동등 객체의 조건
     *  1. hashCode가 같아야 한다. 동일한 객체는 동일한 hashCode를 가져야 한다.(hashCode() 재정의 필요)
     *  2. 두 개의 객체들의 멤버변수의 값들이 같아야 한다. (equal() 재정의 필요)
     */
    
    // hashCode() 재정의
    @Override
    public int hashCode() {
        System.out.println("해쉬코드 호출");
        return Objects.hash(this.name, this.age);
    }
    
    // equals() 재정의
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;      // 부모타입->자식타입 (다운캐스팅)
            return (member.name.equals(this.name) && (member.age == this.age));     
        } 
        else {
            return false;           
        }
    }

}
