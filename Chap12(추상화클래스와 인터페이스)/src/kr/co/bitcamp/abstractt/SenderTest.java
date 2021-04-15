package kr.co.bitcamp.abstractt;

public class SenderTest {

    public static void main(String[] args) {
        
        // 추상클래스는 인스턴스(객체) 생성 불가 
        // ContentSender contentSender = new ContentSender("안녕","안녕하세요");
                
        // 추상클래스도 조상클래스이기때문에 필드의 다형성이 적용됨.
        ContentSender contentSender = new KakaoSender("카카오톡", "서준", "우식아");
        contentSender.sendMessage("최우식");
        System.out.println();
        
        ContentSender contentSender2 = new SmsSender("SMS", "박서준", "누나");
        contentSender2.sendMessage("정유미");
    }
}
