package kr.co.bitcamp.abstractt;

public abstract class KakaoSender02 extends ContentSender {
    
    private String content;

    // 생성자
    public KakaoSender02(String title, String name, String content) {
        super(title, name);
        this.content = content;
    }

    @Override
    public void sendMessage(String content) {     
    }
    
    // 모든 추상메서드(sendMessage2)를 오버라이드 하지 않으면 현재 클래스도 abstract 클래스임.
}
