package kr.co.bitcamp.string02;

public class ToLowerUpper {

    public static void main(String[] args) {
        
        String str1 = "Java Programming";
        System.out.println("대문자: "+str1.toUpperCase());
        
        String str2 = "JAVA Programming";
        System.out.println("소문자: "+str2.toLowerCase());
       
        // equals()는 대소문자를 구분함.
        System.out.println(str1.equals(str2));
       
        // 대소문자 구별하지 않고 비교하고자 한다면 equalsIgnoreCase() 사용.       
        System.out.println(str1.equalsIgnoreCase(str2));       
    }
}
