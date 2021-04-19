package kr.co.bitcamp.string02;

 class LengthTest {

    public static void main(String[] args) {
        
        String phoneNum = "01045671234";
        // length(): 문자열의 길이 리턴
        System.out.println("문자열의 길이: "+phoneNum.length());
        
        int length = phoneNum.length();
        if(length == 11) {
            System.out.println("폰 번호 자리수가 맞습니다.");            
        }
        else {
            System.out.println("다시 입력해 주세요.");
        }                
    }
}
