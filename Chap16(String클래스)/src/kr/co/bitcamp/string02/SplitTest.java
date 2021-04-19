package kr.co.bitcamp.string02;

// split(): 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
public class SplitTest {
    public static void main(String[] args) {
        
        String str1 = "사랑해,너를,파닭치킨,양념치킨";
        String[] strArr = str1.split(",");
        
        for(String str: strArr) {
            System.out.println(str);
        }
        System.out.println();
        
        String str2 = "사랑해,너를/파닭치킨&양념치킨,후라이드";
        strArr = str2.split(",|/|&");      // | -> or연산자
         
        for(String str3: strArr) {
            System.out.println(str3);
        }                
    }
}
