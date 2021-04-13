package kr.co.bitcamp.finalconstant;

public class PersonTest {

    public static void main(String[] args) {
       
        Person person = new Person(25);
        //person.nation = "China";  // 불가함 확인
        // person.age = 60;         // 불가함 확인
        System.out.println(person);    
        
        System.out.println(Person.MAX_NUMBER);
        
        Person person2 = new Person(50);
        Person person3 = new Person(150);
        Person person4 = new Person(250);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        
        
        System.out.println();
        System.out.println(person2.age);
        System.out.println(person3.age);
        System.out.println(person4.age);   
    }

}
