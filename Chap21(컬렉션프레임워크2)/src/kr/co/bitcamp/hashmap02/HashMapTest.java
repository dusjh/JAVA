package kr.co.bitcamp.hashmap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        
        Map<Student, Integer> map = new HashMap<>();
        
        // 키 객체가 동등객체라면 중복 저장하지 않는다.
        map.put(new Student(1001, "최지만"), 95);     // 1001, 최지만-> key값
        map.put(new Student(1001, "최지만"), 90);
        map.put(new Student(2001, "류현진"), 100);
        map.put(new Student(3001, "추신수"), 80);
        
        System.out.println("총 Entry 수: "+map.size());    // key 객체의 중복은 허용하지 않음.
        
        // 중복시 뒤에 저장된것으로 대체된다.
        System.out.println("최지만: "+map.get(new Student(1001, "최지만")));

        // map 컬렉션에 있는 key값만 Set계열로 바꾼다.
        Set<Student> keyset = map.keySet();
        Iterator<Student> keyIterator = keyset.iterator();
        while(keyIterator.hasNext()) {
            Student key = keyIterator.next();
            System.out.println("학번: "+key.getSno()+", "+"이름: "+key.getName()
            +"점수: "+map.get(new Student(key.getSno(), key.getName())));
                    
        }   
    }
}
