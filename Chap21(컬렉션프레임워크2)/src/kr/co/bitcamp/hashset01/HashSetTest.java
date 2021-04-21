package kr.co.bitcamp.hashset01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        System.out.println("사이즈: "+set.size());
        
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        
        System.out.println("사이즈: "+set.size()); // 결과: 1 (중복 허용X)       
        System.out.println("-----------------------------");
        
        /*
         * Set 계열은 중복 저장이 안된다. 순서 유지를 하지 않는다.
         * Set 계열에는 null 값도 저장 가능하지만, 오직 1개만 저장된다.(중복이 안되기 때문)
         */
        set.add("JDBC");
        set.add("JSP");
        set.add("myBATIS");
        set.add("MySQL");
        set.add(null);
        set.add(null);
        
        System.out.println("사이즈: "+set.size());      
        System.out.println("-----------------------------");
        
        // 반복자를 통해서 set 객체를 얻는다.
        Iterator<String> iterator = set.iterator();
        
        while(iterator.hasNext()) {             // hasNext(): 가져올게 있는가? 있으면 true, 없으면 false를 리턴.
            String element = iterator.next();   // next(): 컬렉션 안에 있는 객체를 가져오는 역할.
            System.out.println(element);
            System.out.println("사이즈: "+set.size());
        }
        System.out.println("-----------------------------");
                
        // 삭제
        set.remove("JDBC");
        set.remove("myBATIS");
        
        System.out.println("사이즈: "+set.size());
        System.out.println("-----------------------------"); 
        
        // 향상된 for문
        for(String str: set) {
            System.out.println(str);    // 순서는 의미 없음.
        }
        System.out.println("-----------------------------"); 
        
        // 전체 삭제
        set.clear();
        if(set.isEmpty())
            System.out.println("객체가 없습니다.");
         else
            System.out.println("객체가 존재합니다.");
    }
}
