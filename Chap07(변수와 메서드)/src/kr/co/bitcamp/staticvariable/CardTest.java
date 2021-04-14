package kr.co.bitcamp.staticvariable;

public class CardTest {
    public static void main(String[] args) {
        
        // 객체 생성
        Card card = new Card();
        card.setColor("노랑");
        card.setCompany("국민은행");
        System.out.println(card);   // card의 색상: 노랑, card의 회사: 국민은행, 크기: (50, 100)

        // 이렇게 쓰는 걸 지양하고
//        card.width = 80;
//        card.height = 150;
        
        // static 변수는 반드시 클래스명.static변수명으로 접근해야 함.
        // 공유변수는 분석하는 단계에서는 바꾸지 않는 게 바람직함.
        
        Card.width = 80;
        Card.height = 150;
        
        Card card2 = new Card();
        card2.setColor("파랑");
        card2.setCompany("농협");
        System.out.println(card2);  // card의 색상: 파랑, card의 회사: 농협, 크기: (150, 80)
    }

}
