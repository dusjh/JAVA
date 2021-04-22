package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

// eclipse-workspace에 test.text 파일 생성
public class InputStreamReadTest01 {

    // 일반 예외가 발생하는 경우 그 예외를 JVM에게 던진다.
    public static void main(String[] args) throws Exception {
        
        // 다형성이 적용된 코드
        InputStream iStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test.txt");
        
        int readByte;       // 읽은 바이트 수를 리턴받는 변수.
        
        // 방법 1 - 이 방법 추천
        // InputStream의 read()는 더이상 읽을 것이 없다면, -1 값을 리턴.
        while((readByte = iStream.read()) != -1) {
            System.out.println("읽은 데이터(1바이트):"+readByte); // 아스키 코드값을 출력
            System.out.println("읽은 문자: "+(char)readByte);   // 강제 타입 캐스팅 후 문자로 출력
        }

       // 방법2
//        while(true) {
//            readByte = iStream.read();
//            if(readByte == -1)
//                break;
//            System.out.println("읽은 문자: "+(char)readByte);
//        }           
        
        // 이클립스의 디폴트 캐릭터셋
        System.out.println(Charset.defaultCharset());
        // 리소스 반납
        iStream.close();        
    }
}
