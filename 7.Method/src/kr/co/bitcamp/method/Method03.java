package kr.co.bitcamp.method;
// 3) 반환값O, 받는 인자값X

public class Method03 {
    public static void main(String[] args) {
       
        int result;
        result = returnMethod(); // 반환값이 있다는 것은 메서드 호출에 따른 리턴값이 있는 것.
        
         System.out.println("메서드 호출에 따른 리턴된 값: "+result);
      
    }
   public static int returnMethod() { // 매개변수X
       int rValue = 100;  // 지역변수
       rValue *= 100; // 리턴값
       return rValue;
   }

}
