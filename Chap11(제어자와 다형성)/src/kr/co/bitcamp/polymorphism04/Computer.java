package kr.co.bitcamp.polymorphism04;

// 자손클래스 2 
public class Computer extends Product {
    public Computer() {
        super(200);
    }
    
    @Override
    public String toString() {
        return "Computer";
    }
}
