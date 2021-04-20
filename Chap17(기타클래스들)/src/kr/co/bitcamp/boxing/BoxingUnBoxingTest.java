package kr.co.bitcamp.boxing;

public class BoxingUnBoxingTest {

    public static void main(String[] args) {
                
        // boxing 코드: 값을 객체화 시킴
        Integer obj1 = new Integer(100);  // 특정버전에서 derprecated(?) 되어 취소선 뜸
        Integer obj2 = new Integer("100");
        Integer obj3 = Integer.valueOf(100);
        
        // 컴파일 시     new Integer(100)으로 auto-boxing 된다.
        Integer obj4 = 100;
        
        System.out.println("박싱 후");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4); 
        
        // unboxing(언박싱)코드: 기본 값으로 바꾼다.
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3;
        int value4 = obj4.intValue();
        
        System.out.println("언박싱 후");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);  
    }
}
