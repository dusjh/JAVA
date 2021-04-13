package kr.co.bitcamp.overloading;

class A {
    int data1 = 10;
    int data2 = 20;
}

public class AccumulatorTest {

    public static void main(String[] args) {
        
        Accumulator accm = new Accumulator();
        int iResult = accm.add(10, 50);
        System.out.println("iResult: "+ iResult);               
        
        long lResult = accm.add(100, 7500L);   // 데이터타입 접미사를 반드시 붙이도록 해야 한다.
        System.out.println("lResult: "+ lResult); 
        
        lResult = accm.add(1000L, 10);
        System.out.println("lResult: "+ lResult); 
        
        double dResult = accm.add(107.88, 11.55);
        System.out.println("dResult: "+dResult);
        
        
        // 참조형 변수를 받아서 오버로딩하는 케이스
        long arrResult = accm.add(new int[] {1,2,3,4,5});
        System.out.println("arrResult: "+arrResult);
        
        iResult = accm.add(new A());
        System.out.println("iResult: "+iResult);

        }
    }
