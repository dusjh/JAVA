package kr.co.bitcamp.stringbuilder;

public class StringBuilderTest {

    public static void main(String[] args) {
        
        /*
         * StringBuilder, StringBuffer 클래스는 버퍼(임시저장메모리)를 이용하기 때문에,
         * 새로운 인스턴스가 생성되는 것이 아니라, 하나의 인스턴스를 가지고 문자열을 조작할 수 있다.
         */
        StringBuilder sBuilder = new StringBuilder("JAVA");
        System.out.println(sBuilder.toString());   // 값 호출
        System.out.println(sBuilder.hashCode());   // 주소 호출
        System.out.println();
        
        sBuilder.append(" Program");
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode());  // 위의 주소와 같음.(새로운 인스턴스 생성이 아니라 하나의 인스턴스를 가지고 조작)
        System.out.println();
        
        sBuilder.insert(1, "나");
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode()); 
        System.out.println();
       
        sBuilder.insert(1, 100);
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode());  
        System.out.println();
        
        // CharAt: 문자열 대체
        sBuilder.setCharAt(0, 'R'); //char는 문자 하나만
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode()); 
        System.out.println();
        
        sBuilder.reverse();
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode());  
        System.out.println();
      
        sBuilder.delete(0, 3);  // 마지막껀 포함X
        System.out.println(sBuilder.toString());   
        System.out.println(sBuilder.hashCode());  
        System.out.println();
        
        int length = sBuilder.length();
        System.out.println("총 방문자 수: "+length);
        
      }
}
