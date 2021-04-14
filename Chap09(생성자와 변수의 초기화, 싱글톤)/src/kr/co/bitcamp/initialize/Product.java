package kr.co.bitcamp.initialize;

public class Product {
    
    // 공유되는 값
    static int number = 0;
    
    // 인스턴스별 개별 생성
    int countNo;
    int[] arr = new int[10];
    
    // 인스턴스 초기화 블럭(정적 멤버 사용가능)
    {
        System.out.println("인스턴스 초기화 블럭 호출됨");
        ++number;
        this.countNo = Product.number;
        
        // 복잡한 초기화 같은 경우는 초기화 블럭 실행문에서 작성하면 가독성이 좋아진다.
        for(int i = 0; i < arr.length; i++) {
            this.arr[i] = (int)(Math.random()*10)+1;
        }
    }
    
    // 정적 초기화 블럭(단 한 번만 실행됨)
    static {
        System.out.println("정적 초기화 블럭 호출됨");
    }
    
    
    // 기본 생성자 추가
    public Product() {
        System.out.println("기본 생성자 호출됨");
    };

}
