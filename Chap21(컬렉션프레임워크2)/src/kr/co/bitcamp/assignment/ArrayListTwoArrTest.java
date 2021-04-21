package kr.co.bitcamp.assignment;
/*
 * 컬렉션 프레임워크의 ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보시오.
 */
import java.util.ArrayList;

public class ArrayListTwoArrTest {
    public static void main(String[] args) {
        
        ArrayList<Integer[]> arr = new ArrayList<>();
                
        // 요소 추가
        arr.add(new Integer[] {11,12,13,14});
        arr.add(new Integer[] {21,22,23,24});
        arr.add(new Integer[] {31,32,33,34});
       
        // 요소 출력
        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i)[0]);           
        }        
        
        // 전체 요소 출력
        System.out.println("----------------------[전체 요소 출력]");
        
        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.get(i).length; j++) 
                System.out.print(arr.get(i)[j]+" ");
            System.out.println();           
        }
        System.out.println("----------------------[전체 요소 출력]");
    }
}
