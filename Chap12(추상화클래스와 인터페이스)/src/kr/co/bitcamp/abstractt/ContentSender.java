package kr.co.bitcamp.abstractt;
/*
 * 추상클래스: 1개 이상의 추상메서드를 포함하는 클래스, 인스턴스를 절대로 생성할 수 없다.
 * 추상메서드: 선언부만 존재하고 구현부가 없는 메서드
 */
public abstract class ContentSender {
    
    private String title;
    private String name;
    
    // 생성자
    public ContentSender(String title, String name) {
        // super();
        this.title = title;
        this.name = name;
    }

    // getter() 
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }
    
    // 추상메서드: 상속을 통해서 반드시 재정의(오버라이딩)되어야 비로소 인스턴스를 생성할 수 있다. 
    public abstract void sendMessage(String content);   
    public abstract void sendMessage2(String content);
}
