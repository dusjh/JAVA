package kr.co.bitcamp.call;

import java.util.Arrays;

public class ReferenceReturnTest {
    public static void main(String[] args) {
        
        int[] origin = new int[] {10,20,30,40,50}; // 원본배열
        int[] cloned = null; // 타겟 배열
        
        System.out.println("===copy() 호출 전: "+Arrays.toString(cloned));
        cloned = copy(origin);
        System.out.println("===copy() 호출 후 origin[] 값: "+Arrays.toString(origin));
        System.out.println("===copy() 호출 후 cloned[] 값: "+Arrays.toString(cloned));
    }
    
    // 리턴 타입이 참조 타입이 온 경우
    public static int[] copy(int[] arr) {
        int[] temp = new int[5];
       System.arraycopy(arr, 0, temp, 0, arr.length);
//        for(int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
               
        return temp;
    }
    
}

