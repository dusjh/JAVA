package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 파일 복사하기
public class FileCopyTest {

    public static void main(String[] args) throws Exception {
        
        // write3.txt -> write3_복사본.txt로 만들기
        
     FileInputStream fInputStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3.txt");
     FileOutputStream fOutputStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3_복사본2.txt");
     
     byte[] readBytes = new byte[1000];  //  배열 이용 write3_복사본2.txt
     int data = 0;    // write3_복사본.txt
     while((data = fInputStream.read())!= -1) {
         fOutputStream.write(data);
     }

     fOutputStream.flush();
     System.out.println("C 드라이브에 write3_복사본2.txt 파일이 생성되었습니다.");
     
     fOutputStream.close();
     fInputStream.close();
    }

}
