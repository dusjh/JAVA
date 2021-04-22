package kr.co.bitcamp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest01 {

    public static void main(String[] args) throws Exception {
      
      //Reader 클래스는 문자특화 클래스로서, 이를 상속받은 하위클래스인 FileReader를 생성하여 대입.(다형성 적용)
      Reader reader = new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\test5.txt");
      
      int readData;
      
      // redaData는 int 값으로 끝 2바이트에 저장된다.
      while((readData = reader.read()) != -1) {
          System.out.println("읽은 문자: "+(char)readData);
          // 기본적으로 영문자는 아스키 코드가 출력되고, 한글은 유니코드가 출력된다.
          // 문자출력을 위해서는 강제 형변환.(바이트 정보를 강제 캐스팅)
      }
      reader.close();
        
    }

}
