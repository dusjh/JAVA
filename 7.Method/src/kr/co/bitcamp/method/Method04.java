package kr.co.bitcamp.method;
// 4) 반환값O, 받는 인자값O
// 반환값이 있고, 받는 인자값이 있는 대문자 출력 메서드를 구현해 보시오.
// 메서드는 ("welcom to bitcamp") 입력 시 대문자로 출력되도록 구현한다.
// 결과
// 입력한 소문자의 대문자: WELCOME TO BITCAMP

public class Method04 {
    public static void main(String[] args) {
        
        String result;
        result = capitalMethod("welcome to bitcamp");
        System.out.println("입력한 소문자의 대문자: " +result);
    }
    
    //  toUpperCase() 메서드 사용
    public static String capitalMethod(String str) {
        
        String rValue = str.toUpperCase();
        return rValue;
    }
}
