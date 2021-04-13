package kr.co.bitcamp.forWhile;
/*
 * 자바의 반복문 종류: 크게 봤을 때 4가지.
 * 1. for문
 *      for(변수초기식; 조건식; 증감식) { 
 *          // 조건식 참인 동안 실행
 *       }
 * 2. while문
 * 3. do ~ while문
 * 4. 향상된 for문
 */
/*
 * 알파벳 26개 문자를 대문자로 출력하는 반복문을 구현하시오.
 * (아스키 코드)
 */
public class ForAlphabetPrint {
    public static void main(String[] args) {
        System.out.println((int)'A'); //65
        System.out.println((int)'Z'); //90
        
        // A(65) ~ Z(90)
        for(int i = 65; i <= 90; i++) {
            System.out.print((char)i+" ");
        }

    }

}
