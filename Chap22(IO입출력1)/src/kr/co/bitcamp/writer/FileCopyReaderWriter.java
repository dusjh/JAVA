package kr.co.bitcamp.writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopyReaderWriter {

    public static void main(String[] args) throws Exception {
        
        Reader reader = new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\FileCopyTest.java");
        Writer wirter = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\FileCopyTest_복사본.java");
        
        String str = "";
        int readBytes; 
        //char[] cArr = new char[2];  // 사이즈 변경 시 루핑 수가 줄어듦.(사이즈가 작은 만큼 루핑을 많이 함)
        char[] cArr = new char[1000];
        int i = 0;
        
        while((readBytes = reader.read(cArr)) != -1) {
            i++;  // 루핑 수 파악
            String str1 = new String(cArr);
            str += str1; 
            System.out.println("루핑 수: "+i);
        }
        wirter.write(str);
        wirter.flush();
        System.out.println("FileCopyTest_복사본.java 파일이 생성되었습니다.");
        
        wirter.close();
        reader.close();            
    }
}
