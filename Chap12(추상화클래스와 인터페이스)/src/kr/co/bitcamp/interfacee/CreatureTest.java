package kr.co.bitcamp.interfacee;

public class CreatureTest {

    public static void main(String[] args) {
        
        Member member = new Member();
        member.method();
        member.method1();
        System.out.println();
        
        // 인터페이스도 일종의 조상이다. 따라서 다형성 개념이 적용된다.
        Creature creature = new Member();   // 인터페이스 필드의 다형성
        creature.method();
        //creature.method1();   // 원래 타입을 벗어나지 못하므로 Member클래스의 멤버 메서드(method1)는 호출 불가.        
   
        Person person = new Person();
        person.method();
        person.method2();
                
        creature = new Person();
        creature.method();
        //creature.method2();   // 원래 타입을 벗어나지 못하므로 Person클래스의 멤버 메서드(method2)는 호출 불가.
        
        System.out.println(Creature.MAX);
    }
}
