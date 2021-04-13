package kr.co.bitcamp.forWhile;
//while사용하여 홀수 짝수 구하기

public class whileprac {
    public static void main(String[] args) {
        
        int number = 1;
        while(number <= 30) {
            if(number % 2 == 0) { // 홀수 출력-> number % 2 != 0
                System.out.println("짝수: "+number);
            }//if
            number++; //반복적으로 +1하면서 30까지 가면 종료.
        }//while
        
    }

}
