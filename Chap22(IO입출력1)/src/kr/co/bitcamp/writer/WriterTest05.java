package kr.co.bitcamp.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest05 {

    public static void main(String[] args) throws Exception {
        
        Writer writer = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\test10.txt");
        String str = "안녕하세요. 지금 자바 IO 기반의 입출력을 공부하고 있어요.";
        
        // write(String str, int off, int len) 사용
        writer.write(str, 2, 10);  // 문자열 2번째 인덱스부터 10개의 문자를 파일로 저장한다.
        writer.flush();
        System.out.println("파일이 생성되었습니다.");
        writer.close();
    }
}
