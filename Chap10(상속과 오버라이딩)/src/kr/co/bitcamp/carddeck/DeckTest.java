package kr.co.bitcamp.carddeck;

public class DeckTest {

    public static void main(String[] args) {
       // Deck의 생성자 호출하면 포함된 클래스(Card)부터 생성을 먼저 한다.
        Deck deck = new Deck();
        
        deck.pick(0);
               
        Card card = deck.pick(0);
        System.out.print("카드 섞기 전, 제일 위에 있는 카드 > ");
        System.out.println(card);
     
        card = deck.pick(51);
        System.out.print("카드 섞기 전, 제일 아래에 있는 카드 > ");
        System.out.println(card);
            
        deck.shuffle();     // 랜덤으로 카드 섞는 메서드
        
        card = deck.pick(0);
        System.out.print("카드 섞은 후, 제일 위에 있는 카드 > ");
        System.out.println(card);
     
        card = deck.pick(51);
        System.out.print("카드 섞은 후, 제일 아래에 있는 카드 > ");
        System.out.println(card);
    
        card = deck.pick();
        System.out.println(card);       
    }    
}
