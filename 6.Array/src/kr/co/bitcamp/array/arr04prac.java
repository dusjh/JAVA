package kr.co.bitcamp.array;

public class arr04prac {
    public static void main(String[] args) {
        
       //정수형 배열 선언
        int[] arr = {1,2,3,4};
        int[] arr2;
        arr2 = new int[] {5,6,7,8};
        
       //실수형 배열 선언
        double[] arr3 = {3.4, 24.3, 23.4, 15.3};
       
        //주소값 출력
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
        
        //마지막 배열요소값 출력
        System.out.println(arr[arr.length-1]);
        System.out.println(arr2[arr2.length-1]);
        System.out.println(arr3[arr3.length-1]);
    }

}
