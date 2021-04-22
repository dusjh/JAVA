package kr.co.bitcamp.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest03 {

    public static void main(String[] args) throws Exception {
        
        Writer writer = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\test8.txt");
        char[] str = "신사임당이다".toCharArray();
        
        // write(char[] c, int off, int len) 사용
        writer.write(str, 1, 4);
        writer.flush();
        System.out.println("파일이 생성되었습니다.");
        writer.close();
    }

}
