package kr.co.bitcamp.object2;

public class StudentTest {
    
    int test;
    
    public void getTest() {
        
    }

    public static void main(String[] args) {
        
        //  this => static에서 사용할 수 없음
        
        // 아래는 각각 독립된 저장 공간을 가지는 인스턴스가 힙에 할당됨.
        Student stu1 = new Student();
        Student stu2 = new Student();
        
        stu1.age = 20;
        stu1.name = "이순신";
        
        System.out.println(stu1);  //이름: 이순신, 나이: 20
        System.out.println(stu2);  //이름: null, 나이: 0
        
        // stu1의 주소를 stu2에 대입
        // 원래 stu2가 가리키고 있던 인스턴스는 쓰레기 객체가 된다.
        // gc(garbage collector)가 쓰레기 객체를 수집하여 소멸시킴.
       stu2 = stu1;
       System.out.println(stu1);  //이름: 이순신, 나이: 20
       System.out.println(stu2);  //이름: 이순신, 나이: 20
        
       stu2.age = 10;
       System.out.println(stu1);  //이름: 이순신, 나이: 10
       System.out.println(stu2);  //이름: 이순신, 나이: 10

    }

}
