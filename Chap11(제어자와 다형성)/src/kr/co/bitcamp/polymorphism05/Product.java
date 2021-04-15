package kr.co.bitcamp.polymorphism05;

// 상품관리 프로그램
// 조상클래스
public class Product {
    
    // 멤버
    private int productID;
    private String description;
    private String maker;
    private int price;
    
    // 생성자
    public Product(int productID, String description, String maker, int price) {
        super();  // object클래스 기본생성자 상속
       
        // 초기화
        this.productID = productID;
        this.description = description;
        this.maker = maker;
        this.price = price;
    }

    // getter() 제공
    public int getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }
    
    // 값 출력
    public void showInfo() {
        System.out.println("상품ID: "+(this.getProductID()+1));  // 0부터 시작하니까 +1 해줘야 함
        System.out.println("상품 설명: "+this.getDescription());
        System.out.println("생산자: "+this.getMaker());
        System.out.println("가격: "+this.getPrice());       
    }    
}
