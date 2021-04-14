package kr.co.bitcamp.staticvariable;

public class Card {
    
    // 인스턴스 변수: static 정의X, 반드시 인스턴스를 생성해야 접근 가능. 
    private String color;       // 카드 색상
    private String company;     // 카드 회사명
    
    // static 변수(=클래스 변수, 정적 변수, 공유 변수): static 정의O,
    // 인스턴스 생성 없이도 클래스명.static변수명으로 접근 가능.
    static int width = 100;     // 카드의 폭
    static int height = 50;     // 카드의 높이
    
    
    // 인스턴스 메서드
    // getter, setter()
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    
    public String toString() {
        
       /*
        * 정적변수(static)는 접근 방법이 반드시 클래스명.static 변수명으로 접근해야 올바른 방법이다.
        */
        return "card의 색상: "+this.getColor()+
                ", card의 회사: "+this.getCompany()+
                ", 크기: ("+Card.height+
                ", "+Card.width+")";
    }
}
