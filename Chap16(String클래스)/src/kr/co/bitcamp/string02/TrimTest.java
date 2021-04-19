package kr.co.bitcamp.string02;

public class TrimTest {

    public static void main(String[] args) {
        
        String tel1 = "    02";
        String tel2 = "-4499    ";
        String tel3 = "   -3948   ";
        
        // trim()은 좌우공백만 제거
        System.out.println(tel1.trim());
        System.out.println(tel1.trim()+tel2.trim()+tel3.trim());
    }
}
