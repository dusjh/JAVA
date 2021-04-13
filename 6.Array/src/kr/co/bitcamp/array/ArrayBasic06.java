package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 다중 배열의 선언
 */
public class ArrayBasic06 {
    public static void main(String[] args) {
        int[] a, b, c;
        int d[], e[], f[];
        int g[], h, i;
        
        // 배열 사용이 가능한지 체크
        a = new int[3];
        b = new int[3];
        c = new int[3];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        
        d = new int[6];
        e = new int[6];
        f = new int[6];    
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        
        g = new int[9];
//        h = new int[9];
//        i = new int[9]; 에러
        h = 100;
        i = 200; // 그냥 int변수임.
        System.out.println(Arrays.toString(g));
    }

}
