package kr.co.bitcamp.forWhile;
//알파벳 26개 문자를 대문자로 출력하는 반복문을 구현하시오. (아스키 코드)
public class forprac {
    public static void main(String[] args) {
        
       System.out.println((int)'A');
       System.out.println((int)'Z');
       
       //65~90
       for(int i = 65; i <= 90; i++) {
           System.out.print((char)i+" ");
       }//for
       
    }

}
