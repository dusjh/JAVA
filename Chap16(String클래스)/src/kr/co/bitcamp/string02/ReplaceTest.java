package kr.co.bitcamp.string02;

public class ReplaceTest {

    public static void main(String[] args) {
        
        // replace(): 문자열을 대체하는 메서드이다.
        String oldstr = "자바는 객체지향언어이다.";
        String newstr = oldstr.replace("자바", "JAVA");
        System.out.println(newstr.toString());
        
        // hashCode(): 주소값 출력
        System.out.println(oldstr.hashCode());
        System.out.println(newstr.hashCode());
    }
}
