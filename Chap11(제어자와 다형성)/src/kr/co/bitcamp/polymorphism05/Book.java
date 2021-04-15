package kr.co.bitcamp.polymorphism05;

// 자손클래스 1
public class Book extends Product{
    
    private int ISBN;
    private String title;
    private String author;
    
    // 생성자 오버로딩
    public Book(int productID, String description, String maker, int price, int iSBN, String title, String author) {
        super(productID, description, maker, price);   // 조상클래스 생성자 호출
       
        // 초기화
        ISBN = iSBN;
        this.title = title;
        this.author = author;    
    }

    // getter() 제공
    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    @Override 
    public void showInfo() {  
        super.showInfo();     // 조상클래스의 메서드를 명시적으로 호출 (showInfo 호출)
        
        // Book클래스의 메서드 호출
        System.out.println("국제표준도서번호: "+this.getISBN());
        System.out.println("책 제목: "+this.getTitle());
        System.out.println("저자: "+this.getAuthor());
    }
}
