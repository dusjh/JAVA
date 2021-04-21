package kr.co.bitcamp.stackqueue;
// Queue 
public class Message {
    
    private String commend;
    private String to;
    
    public Message(String commend, String to) {
        super();
        this.commend = commend;
        this.to = to;
    }

    public String getCommend() {
        return commend;
    }

    public String getTo() {
        return to;
    }

}
