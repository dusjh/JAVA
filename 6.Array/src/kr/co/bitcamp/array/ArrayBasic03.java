package kr.co.bitcamp.array;
/*
 * 2가지 방식으로 배열 초기화를 할 수 있다.
 */
public class ArrayBasic03 {
    public static void main(String[] args) {
        
        // 1. 
        int[] salesTable = new int[] {55, 99, 32, 42, 16};
        System.out.println(salesTable[2]); //32
        
        // 2. 배열 선언과 동시에 특정 값으로 초기화
        int[] salesTable2 = {55, 99, 32, 42, 16};
        System.out.println(salesTable2[1]); //99
        
        // 3. 
        int[] salesTable3;
        // salesTable3 = {55, 99, 32, 42, 16} 이렇게는 안 됨
        salesTable3 = new int[] {55, 99, 32, 42, 16};
        System.out.println(salesTable3[3]); //42
    }

}
