package kr.co.bitcamp.equals;

import javax.security.auth.Subject;

public class StudentTest {

    public static void main(String[] args) {
        
        
//        Student student1 = new Student(20);
//        Student student2 = new Student(20);
//        
//        System.out.println(student1.equals(student2));
//        System.out.println();
        
        Student student3 = new Student(30, "박");
        Student student4 = new Student(30, "박");
        
        System.out.println(student3.equals(student4));
        
        Student student5 = new Student(30, "박");
        Student student6 = new Student(30, "최");
        
        System.out.println(student5.equals(student6));
        
        Student student7 = new Student(30, "박", new int[] {100,90});
        Student student8 = new Student(30, "박", new int[] {100,0});   
        System.out.println("오버라이드 된 equals() 결과: "+student7.equals(student8));  
    }
}
