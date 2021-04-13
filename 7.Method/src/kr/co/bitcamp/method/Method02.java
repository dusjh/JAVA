package kr.co.bitcamp.method;
// 2) 반환값X, 받는 인자값O

public class Method02 {
    public static void main(String[] args) {
        
        int a = 100, b = 200;
        
        //메서드 호출
        plusMethod(a, b); // 2) 반환값X, 받는 인자값O
    }
    
    // 메서드 정의
    public static void plusMethod(int a, int b) {
        System.out.printf("인자로 넘겨 받은 2개의 값은 %d과 %d입니다.%n", a, b); // 단순 출력
        
        int result = a + b;
        System.out.println("두 수를 더한 값: "+result); // 연산 출력
        
    }
}
