package kr.co.bitcamp.array;

import java.util.Arrays;

//배열 복사
//arraycopy()
//System.arraycopy(원본배열명, srcPos, 복사배열명, desPos, 길이);
public class arr07prac {
    public static void main(String[] args) {
        
        //배열선언
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        
        //배열복사
        System.arraycopy(arr1, 2, arr2, 1, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
       
                
        
        
        
        
        
        
    }

}
