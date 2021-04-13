package kr.co.bitcamp.method;
/*
 * Call by value 메서드 호출을 Call by reference 방식으로 바꿔서 코드를 구현하시오.
 * a 값이 같은 결과가 나오도록 코드를 수정해보시오.
 * 
 * Call by value는 값 복사, Call by reference는 번지?
 */

class CallbyReference {
    int num;
    
    public CallbyReference(int num) {
        this.num = num;
    }
}

public class MethodCall03 {
    public static void main(String[] args) {
      
        CallbyReference a = new CallbyReference(100); // 객체 변수 선언
        sum(a);
        // a 값을 출력해보면 주소가 들어있다.
        System.out.println("main() 메서드 안에서의 a 값: "+a);
        System.out.println(a.num); // 500
  
    }
    public static void sum(CallbyReference a) {
       a.num += 400;
       // a 값을 출력해보면 주소가 들어있다.
       System.out.println("sum() 메서드 안에서의 a 값: "+a);  
       System.out.println(a.num); // 500
    }
}
