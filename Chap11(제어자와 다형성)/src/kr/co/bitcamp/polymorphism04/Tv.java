package kr.co.bitcamp.polymorphism04;

// 자손클래스 1
public class Tv extends Product {
    
   public Tv() {
       // 조상 클래스의 매개변수가 있는 생성자 Product(int price){}를 호출
       super(300);
   }
   
   @Override
    public String toString() {
        return "Tv";
    }
    
}
