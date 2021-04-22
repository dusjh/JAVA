package kr.co.bitcamp.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest02 {

    public static void main(String[] args) throws Exception {
        
        Writer writer = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\test7.txt");
        char[] str = "신사임당".toCharArray();
        
        // WriterTest01에서는 write(int b); 사용-> 매개변수 타입이 문자 배열인 wirte(char[] c) 사용하므로 훨씬 효율적.
        writer.write(str);
        writer.flush();
        System.out.println("파일이 생성되었습니다.");
        writer.close();
    }
}
