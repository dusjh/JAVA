package kr.co.bitcamp.nongeneric;

public class PersonTest {

    public static void main(String[] args) {
        
        Person person = new Person();
        person.setObject("이순신");                 // String -> Object 부모타입으로 바뀜 (자동 형변환. 업캐스팅)
        String str = (String)person.getObject();  // Object -> String 다운캐스팅 됨
        System.out.println(str);
    }
}
