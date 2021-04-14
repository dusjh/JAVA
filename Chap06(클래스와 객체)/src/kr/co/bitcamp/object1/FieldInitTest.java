package kr.co.bitcamp.object1;
// 붕어빵을 찍고, 제품을 생산한다.

public class FieldInitTest {
    public static void main(String[] args) {
        
        /*
         * new 연산자: 클래스에 있는 멤버들의 바이트 크기 만큼
         *      heap(힙)에다가 메모리를 할당하며 동시에 초기화를 시켜주는 역할을 한다.
         *      
         * this: 객체 자기 자신의 주소
         * super: 조상객체의 주소
         */
        FieldInit fInit = new FieldInit();
        System.out.println(fInit.byteField);        // 0
        System.out.println(fInit.intField);         //0
        System.out.println(fInit.floatField);       //0.0
        System.out.println(fInit.arrField);         //null
        System.out.println(fInit.booleanField);     //false
        
        System.out.println(fInit); // 주소값 리턴
        System.out.println(fInit.toString());  //object의 toString()호출함.
        
    }

}
