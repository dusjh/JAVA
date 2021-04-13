package kr.co.bitcamp.forWhile;
/*
 * 홀수, 짝수 구하기 문제를 while 반복문을 사용하여 구현하시오.
 * 1~30까지의 수에서 짝수만 출력하시오.
 */
public class WhileWhithIf {
    public static void main(String[] args) {
        
        // 변수 선언
        int number = 1;
        
        // 반복문을 실행하면서 홀수, 짝수체크
        // 범위는 1~30
        while(number <= 30) {
            // 짝수만 출력. 홀수는 !=으로
            if(number % 2 == 0) {
                System.out.print(number + " ");
            }
          // 반복문을 빠져나오기 위해서는 number 값을 반복할 때마다 증가
          number++;
        }  
    }
}
