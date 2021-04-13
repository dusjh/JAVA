package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 * 2개의 정수형 값을 리턴하는 메서드를 구현하시오.
 * 배열 사용
 */
public class TwoReturn01 {
    public static void main(String[] args) {
        
       int[] result = testMethod();  // 배열 변수 선언
       System.out.println(result);   // 주소 값 출력됨.
       System.out.println("result[0]: "+result[0]);     // 100
       System.out.println("result[1]: "+result[1]);     // 200
       System.out.println("result[2]: "+result[2]);     // 300
       System.out.println(result[0]+result[1]);         // 300
    
       // 반복문 사용없이 모든 요소를 출력함.
       System.out.println(Arrays.toString(result));    // [100, 200, 300]
                                                       
    }
    public static int[] testMethod() {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        
        return new int[] {num1, num2, num3};
    }
}
