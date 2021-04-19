package kr.co.bitcamp.string02;

public class IndexOfTest {

    public static void main(String[] args) {
        String str = "오늘은 자바 하기가 좋네요";
        int index = str.indexOf("공부");           // indexOf() 메서드는 찾기 기능을 할 때 자주 사용. 공백도 카운트함
        System.out.println("공부 번호: "+index);

        // 주어진 문자열이 존재하지 않으면 -1을 리턴한다.
        // 공부라는 문자열이 포함되어 있다면  
        if(str.indexOf("공부") != -1) {
            System.out.println("공부와 관련된 내용이군요");            
        }
        else {
            System.out.println("공부와 관련없는 내용이군요");
        }
    }
}
