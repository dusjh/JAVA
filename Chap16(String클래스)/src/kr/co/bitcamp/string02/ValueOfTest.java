package kr.co.bitcamp.string02;

// valueOf(): 기본타입의 값을 문자열로 변환시켜준다.
public class ValueOfTest {

    public static void main(String[] args) {
        
        String str1 = String.valueOf(true);
        System.out.println(str1);    // boolean형이 아닌 문자열로 출력됨.
                
        String str2 = String.valueOf(777.999);
        System.out.println(str2);     // double형이 아닌 문자열로 출력됨.       
    }
}
