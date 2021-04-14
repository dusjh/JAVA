package kr.co.bitcamp.inheritance01;

public class MountainBicycle extends Bicycle {
    
    // 멤버 개수: 총 5개(부모 클래스의 멤버 2개 포함)
    String frame;
    int gear;
    int price;
    String sector;
    
    public void print() {
        System.out.println("id: "+this.id);
        System.out.println("brand: "+this.brand);
        System.out.println("frame: "+this.frame);
        System.out.println("gear: "+this.gear);
        System.out.println("price: "+this.price);
    }//print끝
    
    public static void main(String[] args) {
        MountainBicycle mBicycle = new MountainBicycle();
        mBicycle.id = 1111;
        mBicycle.brand = "LESPO";
        mBicycle.frame = "알루미늄";
        mBicycle.gear = 33;
        mBicycle.price = 300000;
        mBicycle.owner = "홍길동";
        
        mBicycle.print();
        
    }//main끝
    
}
