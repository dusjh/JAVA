package kr.co.bitcamp.object5;

public class IpadTest {
    public static void main(String[] args) {
        
        // 객체 생성
        Ipad ipad = new Ipad();
        
        ipad.setCompany("애플");
        ipad.setModel("ipadPro4세대");
        ipad.setRelease(2020);
        ipad.setColor("로즈골드");
        System.out.println(ipad);
        
        
        // 객체 생성2
        Ipad ipad2 = new Ipad();
        ipad2.setCompany("삼성");  // 애플제조사가 아닙니다.
        ipad2.setModel("S패드");   // 애플 제조사 모델이 아닙니다.
        ipad2.setRelease(2021);
        ipad2.setColor("골드");
        System.out.println(ipad2);
        //null회사의 null모델이며, 출시일은 2021년입니다. 색상은 골드입니다.
   
    }

}
