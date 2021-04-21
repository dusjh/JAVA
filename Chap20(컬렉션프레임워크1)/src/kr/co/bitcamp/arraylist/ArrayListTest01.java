package kr.co.bitcamp.arraylist;

import java.util.ArrayList;

/*
 * 자바 배열은 크기를 미리 지정하고 사용하기 때문에 넉넉하게 크기를 지정해놓고 사용한다.
 * 
 * ArrayList는 필요시 언제든지 추가, 삭제가 가능하다.
 *  List 인터페이스를 상속하므로 인덱스가 있고, 저장순서가 유지되고, 데이터 중복이 가능하다.
 *  또한, 제네릭 문법을 사용할 수 있다. 만약 제네릭을 사용하지 않는다면, 내부적으로 Object 타입으로 처리된다.
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        
        // ArrayList를 제네릭이 아닌 일반(Object) 타입으로 정의.
        ArrayList list = new ArrayList();           // 기본적으로 10개의 방을 생성함.
        System.out.println("총 크기: "+list.size());
        
        // 객체 추가 (Object 타입) 
        list.add("111");    // 순차적으로 추가
        list.add("222");    // String 타입
        list.add("333");
        list.add("222");
        list.add(333);      // =list.add(new Integer(333)) 
        System.out.println("총 크기: "+list.size());
        System.out.println("ArrayList의 주소: "+list.hashCode());      // hashCode(): 특정 주소값 출력
        System.out.println("ArrayList에 있는 값: "+list.toString());    // toString(): 값(내용) 확인
        
        // 0번째 인덱스에 "333" 추가
        list.add(0, "333");
        System.out.println("ArrayList에 있는 값: "+list.toString());
        System.out.println();
        
        // 객체 삭제하기 
        // 앞에서부터 검색하여 "333"을 삭제한다. (앞에서부터 가까운 것 한 개만 삭제)
        list.remove("333");
        System.out.println("ArrayList에 있는 값: "+list.toString());
               
        System.out.println(list.remove("333"));
        System.out.println("ArrayList에 있는 값: "+list.toString());
        
        // 지정된 객체의 인덱스를 찾아오기. 없으면 -1이 리턴됨.
        System.out.println("index = "+list.indexOf("333"));  // 문자열 "333"을 찾음        
        System.out.println("index = "+list.indexOf(333));   // 정수 333을 찾음
        
        // 객체 전부 삭제하기
//        list.clear();
//        System.out.println("ArrayList에 있는 값: "+list.toString());
        
        /*
         *  앞에서부터 삭제
         *  인덱스 0을 삭제할 때, i가 0이니까 당연히 0 인덱스에 있는 객체가 삭제 되지만,
         *  이후 i값이 증가하면서 제대로 삭제가 되지 않는 것임.
         */
//        for(int i=0; i<list.size(); i++) {
//            list.remove(i);
//            System.out.println("ArrayList에 있는 값: "+list.toString());
//        }
        
        /*
         *  뒤에서부터 삭제
         *  값을 전체 삭제하려면 항상 뒤에서부터 삭제를 해주는 것임.(또는 clear()사용)
         */
        for(int i=list.size()-1; i>=0; i--) {
            list.remove(i);
            System.out.println("ArrayList에 있는 값: "+list.toString());
        }       
    }
}
