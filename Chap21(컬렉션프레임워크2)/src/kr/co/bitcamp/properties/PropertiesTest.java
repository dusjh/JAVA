package kr.co.bitcamp.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// properties 패키지에 만든 문서를 읽어오는 역할
// 프라퍼티(~.properties) 파일을 읽어들일 때 주로 사용한다.

public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        
        // Properties 객체는 키와 값을 String으로 제한한 Map 컬렉션이다.
        Properties properties = new Properties();
        
        // PropertiesTest와 동일한 곳에 프로퍼티 파일이 존재하므로 아래처럼 path를 알아오는 것이다.
        String path = PropertiesTest.class.getResource("database.properties").getPath();
        
        // 파일경로 출력
        System.out.println(path);
        System.out.println("--------------------------");
        
        // 디코딩       
        path = URLDecoder.decode(path, "UTF-8");
        System.out.println(path);
        System.out.println("--------------------------");
        
        // database.properties 파일을 읽어들임
        properties.load(new FileReader(path));
        
        // 키를 주고 값을 읽어옴
        String driver = properties.getProperty("driver");
        System.out.println("driver: "+driver);
        
        String url = properties.getProperty("url");
        System.out.println("url: "+url);
        
        String username = properties.getProperty("username");
        System.out.println("username: "+username);
        
        String password = properties.getProperty("password");
        System.out.println("password: "+password);
        
    }
}
