package kr.co.bitcamp.polymorphism04;

// 조상클래스
public class Product {
    
    int price;          // 제품 가격
    int bonusPoint;     // 제품 구매시 제공하는 보너스 점수
   
    // 생성자
    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);  // 보너스 점수는 제품 가격의 10% 적립        
    }
}
