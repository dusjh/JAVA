package kr.co.bitcamp.constructor;

public class StudentTest {
    public static void main(String[] args) {
        
        // 기본 생성자 호출
        Student student = new Student();
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student);
        
        
        // 매개변수가 있는 생성자 호출
        Student student2 = new Student("이순신", 50);
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
        System.out.println(student2);
        
        
        // 매개변수가 있는 생성자 호출
        Student student3 = new Student("이순신");
        System.out.println(student3);
        
        Student student4 = new Student(50);
        System.out.println(student4);
       
    }
}
