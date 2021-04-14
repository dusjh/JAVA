package kr.co.bitcamp.call;

class A{
    int data;
}

public class PrimitiveParamTest {

    public static void main(String[] args) {
        
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출 전 main()내의 값: "+a.data);
        
        // Call by value(값에 의한 복사 호출)
        PrimitiveParamTest.dataChange(a.data);
        System.out.println("====dataChange() 호출====");
        System.out.println("메서드 호출 후 main()내의 값: "+a.data);
    }
        
    // 지역변수
    // data값은 값 복사가 이루어진다. -> 호출한 곳으로부터 아무런 영향을 받지 않는다.
    public static void dataChange(int data) {          
        data = 44;
        System.out.println("dataChange() 내의 값: "+data);
        return;
    }
}
