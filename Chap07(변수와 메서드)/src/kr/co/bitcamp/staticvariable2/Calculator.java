package kr.co.bitcamp.staticvariable2;

public class Calculator {
    
    // 인스턴스 메서드
    // static 없음, new연산자로 인스턴스(객체) 생성해야지만, 참조변수명.인스턴스메서드() 접근가능
    public int add(int x, int y) {
        double dresult = Calculator.divide(10.5, 11.7);    //인스턴스 메서드에서 정적 메서드 호출 가능
        System.out.println("인스턴스 메서드 내에서 static 메서드 호출: "+dresult); 
        return x + y;
    }//add 끝
    
    public int substract(int x, int y) {
        return x - y;
    }//substract 끝
    
    
    // 정적 메서드(=static, 클래스, 공유 메서드)
    // static 있음, 인스턴스 생성없이 클래스명.정적메서드명으로 바로 접근가능. 
    // 정적 메서드는 이미 메모리 상단에 올라가 있고, 인스턴스 생성없이 접근이 가능한데,
    // 아래 코드는 인스턴스가 생성되어야지만 사용가능한 add()를 호출하기 때문에 예외가 발생한 것이다.
    // 즉, 인스턴스가 언제 생성될 지 아무도 모르기 때문에 static 메서드 안에는 인스턴스 메서드가 절대 오면 안된다.
    public static long multiply(long x, long y) {
      // this.add(10, 5); 
        return x * y;
    }//multply 끝
    
    public static double divide(double x, double y) {
        return x / y;
    }//divide 끝

}
