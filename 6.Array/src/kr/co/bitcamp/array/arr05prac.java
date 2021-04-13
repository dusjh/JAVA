package kr.co.bitcamp.array;
//반복문 사용하지 않고 한꺼번에 출력. Arrays.toString()메서드 사용

import java.util.Arrays;

public class arr05prac {
    public static void main(String[] args) {
        
        //배열선언
        int[] arr = {1,2,3,4,5};
        
        //기존의 for문 사용
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //.toString()사용
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }

}
