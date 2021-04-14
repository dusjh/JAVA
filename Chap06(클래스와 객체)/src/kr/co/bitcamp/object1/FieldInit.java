package kr.co.bitcamp.object1;

// 클래스 = 설계도, 붕어빵틀
public class FieldInit {
    
    // 기본형 변수
    byte byteField;     // 1byte
    short shortField;   // 2byte
    int intField;       // 4byte (default Type)
    long longField;     // 8byte
    
    boolean booleanField; // 1byte
    char charField;       // 2byte (유니코드)
    
    float floatField;       // 4byte
    double doubleField;     // 8byte
    
    // 참조형 변수
    int[] arrField;         // 4byte
    String[] strField;      // 4byte
    
    
    /*
     * toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
     * 원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용한다.
     */
    public String toString() {  // 초기값 확인
        String str = "byteField: "+byteField+
                    ", shortField: "+shortField+
                    ", intField: "+intField+
                    ", booleanField: "+booleanField+
                    ", strField: "+strField;
        
        return str;
    }

}
