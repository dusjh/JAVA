package kr.co.bitcamp.call;

public class PrimitiveParamTest2 {

    public static void main(String[] args) {
        
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출 전 main()내의 값: "+a.data);
        
        // Call by Reference(주소에 의한 호출)
        // 참조형(값을 읽고 수정도 가능)
        PrimitiveParamTest2.dataChange(a);
        System.out.println("====dataChange() 호출====");
        System.out.println("메서드 호출 후 main()내의 값: "+a.data);
    }
    
    //int[], double[], String 등 -> 참조 변수 형태
    public static void dataChange(A a) {
        a.data = 44;
        /*
         * a라는 주소값이 매개변수로 넘어옴. -> 주소를 공유하게 된다.
         * 호출한 곳에서 영향을 무조건 받는다.
         */
        System.out.println("dataChange()내의 값: "+a.data);
        return;
    }

}
