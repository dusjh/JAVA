package kr.co.bitcamp.polymorphism05;

import java.util.Scanner;

public class ProductTest {
    
    static int productID = 0;
    static int numberOfProduct = 0;
    static Product[] product = new Product[10];
    static Scanner scan = new Scanner(System.in);

    
 public static void main(String[] args) {
        
     int choice = 0;
     
     while(choice != 3) {
         int type = 0;
         System.out.println("============상품 조회/추가 프로그램============");
         System.out.print("상품 추가(1), 상품 조회(2), 종료(3) >> ");   
         choice = scan.nextInt();       
         
         switch(choice) {
             // 1 상품 추가
             case 1:
                 // 추가 개수 예외처리
                 if(numberOfProduct >= product.length) {
                     System.out.println("더 이상 상품 추가 불가");
                     break;
                 }//if끝
                 
                 // 추가 개수 예외에 해당하지 않는다면
                 System.out.print("책(1), 음악CD(2), 회화책(3) >> ");
                 type = scan.nextInt();
                 
                 // type 선택 예외처리(1,2,3 외에 다른 숫자 눌렀을때)
                 if(type < 1 || type > 3) {
                     System.out.println("잘못 입력함");
                     break;
                 }//if끝
                 
                 // type 선택 예외에 해당하지 않는다면 상품추가
                 addProduct(type);
                 break;   
               
             // 2 상품 조회    
             case 2:
                 for(int i = 0; i < numberOfProduct; i++) {
                     product[i].showInfo();
                 }//for끝
                 break;
             
             // 3 종료
             case 3:
                 System.out.println("프로그램 종료");
                 break;                
         }//switch끝    
     }//while끝   
    }//main끝

     public static void addProduct(int type) {
         scan.nextLine();   // 버퍼 삭제 용도
         
         System.out.print("상품 설명: ");
         String desc = scan.nextLine();
         
         System.out.print("생산자: ");
         String maker = scan.nextLine();
         
         System.out.print("가격: ");
         int price = scan.nextInt();
                 
         scan.nextLine();   
         
         switch(type) {
             case 1:  // Book
                 System.out.print("일반 책 제목: ");
                 String title = scan.nextLine();
                 System.out.print("저자: ");
                 String author = scan.nextLine();
                 System.out.print("국제표준도서번호: ");
                 int ISBN = scan.nextInt();
                       
                 // 필드의 다형성 적용 (조상타입의 배열에 자손의 인스턴스를 담고 있음. 조상 <- 자손)                 
                 product[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
                 break;
                 
             case 2:  // CompactDisk
                 System.out.print("앨범 제목: ");
                 String albumTitle = scan.nextLine();
                 System.out.print("가수: ");
                 String artist = scan.nextLine();
                 
                 product[numberOfProduct] = new CompactDisk(productID++, desc, maker, price, albumTitle, artist);
                 break;
                 
             case 3:  // ConversionBook
                 System.out.print("회화 책 제목: ");
                 String title2 = scan.nextLine();
                 System.out.print("저자: ");
                 String author2 = scan.nextLine();
                 System.out.print("언어: ");
                 String language = scan.nextLine();
                 System.out.print("국제표준도서번호: ");
                 int ISBN2 = scan.nextInt();
                 
                 product[numberOfProduct] = new ConversionBook(productID++, desc, maker, price, ISBN2, title2, author2, language);
                 break;        
         }//switch끝
         numberOfProduct++;
     }
}
