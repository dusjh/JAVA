package kr.co.bitcamp.clone2;
// 깊은 복제

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면 java.lang.Cloneable 인터페이스를 구현해야 한다.
public class Product implements Cloneable {
    
   private String id;
   private String name;
   private int price;
   private int[] arr;
   private Apple apple;
   
   // 오버로드 된 생성자
   public Product(String id, String name, int price, int[] arr, Apple apple) {
    super();
    this.id = id;
    this.name = name;
    this.price = price;
    this.arr = arr;
    this.apple = apple;
   }

   // getter 생성
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int[] getArr() {
        return arr;
    }
    
    public Apple getApple() {
        return this.apple;
    }
       
   @Override
    public String toString() {
        return "상품 ID: "+this.getId()+"\n"+
                "상품 이름: "+this.getName()+"\n"+
                "상품 가격: "+this.getPrice()+"\n"+
                "배열값: "+Arrays.toString(this.arr)+"\n"+
                "Apple 값: "+this.apple.price;        
     }
   
   public Product getProduc() {
       Product cloned = null;
       
       try {
           // 여기서 얕은 복제(참조변수의 값들은 번지 공유)가 일어남
        cloned = (Product)this.clone();   // 여기서의 clone()은 Objcet 클래스의 얕은 복제.
    } catch (CloneNotSupportedException e) {        
       // e.printStackTrace();
    }        
    return cloned;
   }
   
   @Override
    protected Object clone() throws CloneNotSupportedException {
       // 먼저 얕은 복제를 호출(기본형 타입)
       Product cloned = (Product) super.clone();            // Object클래스의 clone()호출
       
       // 참조타입들을 복제하는 코드(참조형 타입)
       cloned.arr = Arrays.copyOf(this.arr, this.arr.length);   // 배열 복제
       cloned.apple = new Apple(this.apple.price);              // 클래스 복제
       
       return cloned;
    }
}
