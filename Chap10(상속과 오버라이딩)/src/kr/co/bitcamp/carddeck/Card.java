package kr.co.bitcamp.carddeck;

public class Card {
    /*
     * JVM 메모리 상 클래스 영역에 클래스 로딩됨과 동시에 올라간다.
     * 공용 데이터로 활용된다.
     */
    static final int KIND_MAX = 4;    // 무늬 개수(스페이드, 다이아몬드, 하트, 클로버)
    static final int NUM_MAX = 13;    // 무늬별 카드 장 수
   
    //무늬를 상수로 지정
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    
    int kind;
    int number;
    
    // 생성자
    public Card(int kind, int number) {
      //  super();    Object의 기본 생성자를 호출(생략가능)
      this.kind = kind;
      this.number = number;
    }
    
    // 오버라이딩
    @Override
    public String toString() {  // 블럭 내: 지역변수
        
        // 지역변수는 반드시 초기화가 필요
        String kind = "";
        String number = "";
        
        // 무늬 설정
        switch(this.kind) {
        case 4: 
            kind = "스페이드";
            break;
        case 3:
            kind = "다이아몬드";
            break;
        case 2:
            kind = "하트";
            break;
        case 1:
            kind = "클로버";
            break;
        }//무늬switch끝
        
        
        //숫자 설정
        switch(this.number) {
        case 13:
            number = "K";
            break;
        case 12:
            number = "Q";
            break;
        case 11:
            number = "J";
            break;
        default:
                number = this.number+"";   // 문자열(String)로 인식                   
        }//숫자switch끝

        return "무늬: "+kind+", 숫자: "+number;
    }//toString끝
   
}
