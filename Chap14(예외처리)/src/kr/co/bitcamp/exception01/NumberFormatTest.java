package kr.co.bitcamp.exception01;

public class NumberFormatTest {

    public static void main(String[] args) {
        
        String str1 = "100";         // 문자열을 숫자로 바꿀 수 있다.
        String str2 = "100가";       // 문자도 포함되어 있기 때문에 숫자로 바꿀 수 없다.
        System.out.println(str1 + ", "+ str2);
        
        int value1 = Integer.parseInt(str1);
        System.out.println(value1);
        
        int value2 = Integer.parseInt(str2);
        System.out.println(value2);   // -> NumberFormatException 발생
                
        int result = value1 + value2;
        System.out.println(result);
    }
}
