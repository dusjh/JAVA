package kr.co.bitcamp.operator;
/*
 * 수치연산자에 대해 설명해보시오.
 * 수치연산자를 연산에서 소수점 결과가 예상과 다른게 나오는 것에 대해서 설명해보시오.
 */

public class ArithmeticOperators {
    public static void main(String[] args) {
        // 수치연산자: +, -, *, /(몫), %(나머지)
        // 연산의 결과: 정수끼리라도 나누기의 경우 소수점 형태가 나올 수 있다.
        int a = 60, b = 8;
        int result1;
        double result2, result3, result4;
        
        result1 = a / b;
        System.out.println(result1); // 7.5가 아닌 7이 출력됨: 타입이 정수형이므로 실수형으로 변환하면 될 것이다.
        System.out.println((double)result1); // 7.0이 출력됨: 리턴 받는 변수를 실수형으로 하더라도 원하는 결과를 얻지 못했다.
        
        result2 = (double)a / b;
        System.out.println(result2); // 7.5가 출력됨. 어느 한 쪽의 값을 double 타입으로 변환-> 더 큰 타입으로 변환된다.
        
        result3 = 100 / (double)3;
        System.out.println(result3);
        
        result4 = 250 / 3.0;
        System.out.println(result4);
        System.out.printf("세 과목의 평균은 %.1f입니다.%n",result4);
        
        
    }

}
