package kr.co.bitcamp.staticvariable2;

public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        
        // 인스턴스 메서드 호출
        int addResult = cal.add(100, 200);
        System.out.println("인스턴스 메서드 add() 호출 결과: "+addResult);
        
        // static 메서드 호출
        long mulResult = Calculator.multiply(3, 4);
        System.out.println("정적 메서드 multiply() 호출 결과: "+mulResult);
        
        double divResult = Calculator.divide(12.2, 6.2);
        System.out.println("정적 메서드 divide() 호출 결과: "+divResult);
        
        // 일반적인 static 메서드 호출 
        Integer.parseInt("100");
        Math.random();

    }

}
