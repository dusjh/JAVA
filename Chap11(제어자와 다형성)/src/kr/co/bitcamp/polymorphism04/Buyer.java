package kr.co.bitcamp.polymorphism04;

public class Buyer {
    
    int money = 1000;    // 소유금액
    int bonusPoint = 0;  // 보너스 점수
    
//    public void buy(Tv tv) {
//        if(this.money < tv.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다.");
//            return;
//        }//if끝
//        this.money -= tv.price;
//        this.bonusPoint += tv.bonusPoint;       
//    }//buy끝
//    
//    public void buy(Audio audio) {
//        if(this.money < audio.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다.");
//            return;
//        }//if끝
//        this.money -= audio.price;
//        this.bonusPoint += audio.bonusPoint;       
//    }//buy끝
//    
//    
//    public void buy(Computer computer) {
//        if(this.money < computer.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다.");
//            return;
//        }//if끝
//        this.money -= computer.price;
//        this.bonusPoint += computer.bonusPoint;       
//    }//buy끝
    
    
    // Product이거나 Product의 자손들은 다 올 수 있다는 것을 의미.(매개변수의 다형성)
    public void buy(Product product) {
        if(this.money < product.price) {
            System.out.println("잔액이 부족하여 물건 구입이 안됩니다.");
            return;
        }//if끝
        this.money -= product.price;
        this.bonusPoint += product.bonusPoint;       
    }//buy끝    
}
