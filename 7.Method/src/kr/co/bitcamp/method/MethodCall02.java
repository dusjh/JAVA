package kr.co.bitcamp.method;
/*
 * 메인 메서드에서 100을 보냈을 때, 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.
 * 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소번지를 method로 보낸다.
 * 참조형 데이터타입은 주소값이 출력되고, 기본형 데이터타입은 값이 출력된다.
 */
public class MethodCall02 {
    public static void main(String[] args) {
        
        MethodCall02 a = new MethodCall02(); // 클래스 타입으로 변수 a 선언 후, new로 객체 생성
        sum(a);  
        System.out.println("main() 메서드에서 a값 출력: "+a);
        
        int[] b = new int[5]; // 배열타입으로 변수 b 선언 후, new로 객체 생성
        sum2(b); 
        System.out.println("main() 메서드에서 b값 출력: "+b);
        
        double[] c = new double[5];
        sum3(c);
        System.out.println("main() 메서드에서 c값 출력: "+c);
        
        
        Integer d = new Integer(100); //deprecated
                                      // Wrapper 클래스의 Integer 클래스 타입으로 변수 d 선언 후, new로 객체 생성 
        sum4(d);
        System.out.println("main() 메서드에서 d값 출력: "+d); // 주소값이 출력되는 것이 아니라 100이라는 값이 출력됨.
      
        
    }
    public static void sum(MethodCall02 a) {
        System.out.println("sum() 메서드에서 a값 출력: "+a);
    }
    public static void sum2(int[] b) {
        System.out.println("sum2() 메서드에서 b값 출력: "+b);
    }
    public static void sum3(double[] c) {
        System.out.println("sum3() 메서드에서 c값 출력: "+c);
    }
    public static void sum4(Integer d) {
        System.out.println("sum4() 메서드에서 d값 출력: "+d);
        // 주소값 출력x 값 출력O
    }

}



