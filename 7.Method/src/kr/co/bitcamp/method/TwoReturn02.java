package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 * 반환값이 2개 있는 메서드를 구현해보시오.
 * 4) 반환값O, 받는 인자값O
 * 메서드는 {"software", "HARDWARE"} 입력 시 소문자는 대문자로, 대문자는 소문자로 출력되도록 구현한다.
 */
public class TwoReturn02 {
    public static void main(String[] args) {
        
        String[] result = capitalMethod("software","HARDWARE");
        System.out.println(Arrays.toString(result));
        
    }
    public static String[] capitalMethod(String str1, String str2) {
        String a = str1.toUpperCase();
        String b = str2.toLowerCase();
        
        String[] rValue = {a,b};
        return rValue;                
    }
}
