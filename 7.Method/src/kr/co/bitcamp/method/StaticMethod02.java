package kr.co.bitcamp.method;
/*
 * static 선언이 안 되어있는 메서드사용하는 방법에 대해서 코드로 구현해보시오.
 */
public class StaticMethod02 {
    public static void main(String[] args) {
        
      // helloWorld();    //메인 메서드는 static 메서드만 호출할 수 있기 때문에 non static 메서드는 호출할 수 없다.
        
        StaticMethod02 sMethod = new StaticMethod02(); // 객체 생성
        sMethod.helloWorld(); // 객체 생성 후 메서드 호출
                
    }//static 메서드
    
    public void helloWorld() {
        System.out.println("Hello World~");
    }//non static 메서드
    
    //public static void main에서 호출할 수 없음
}
