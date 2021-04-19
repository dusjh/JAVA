package kr.co.bitcamp.equals;

public class ObjectEqualsTest {

    public static void main(String[] args) {
        
        // 아래 코드는 서로 주소가 다르다.
        Object object1 = new Object();
        Object object2 = new Object();
        
        boolean result1 = object1.equals(object2);
        boolean result2 = (object1 == object2);
        System.out.println("equals(): "+result1);
        System.out.println("== 연산자: "+result2);

        // 주소 번지 출력
        System.out.println(object1);
        System.out.println(object2);    
    }
}
