package kr.co.bitcamp.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamTest01 {

    public static void main(String[] args) throws Exception {
        
        // 파일로부터 출력스트림을 생성하여 대입한다. (다형성 적용)
        OutputStream oStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write.txt");
        
        // 문자열 "ABC"에서 getBytes()를 호출함으로써 바이트 배열을 얻어내는 것이다. (인코딩) 
        byte[] data = "ABC".getBytes();
        System.out.println(Arrays.toString(data));  // 아스키 코드가 출력됨.
        
        for(int i=0; i<data.length; i++) {
            oStream.write(data[i]);
        }
        // write()를 사용하면 무조건 flush() 호출해서, 반드시 메모리 버퍼를 비우도록 해야 한다. 습관화하도록 한다.
        oStream.flush();
        System.out.println("저장이 완료되었습니다.");
        
        oStream.close();    
    }
}
