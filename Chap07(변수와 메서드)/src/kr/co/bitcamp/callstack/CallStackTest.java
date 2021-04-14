package kr.co.bitcamp.callstack;
/*
 * 콜 스택(Stack, LIFO): 후입선출(복사기 a4용지)
 * 큐(Queue, FIFO): 선입선출(수도호스, 파이프)
 */
public class CallStackTest {
    public static void main(String[] args) {
        
        System.out.println("main() 실행됨");
        CallStackTest.first();
        System.out.println("main() 종료됨");
    }

    public static void first() {
        System.out.println("first() 실행됨");
        second();        // 같은 클래스 내에 있는 메서드라면 클래스명을 생략해도 된다.
        System.out.println("first() 종료됨");
    }
    public static void second() {
        System.out.println("second() 실행됨");
        CallStackTest.third();  // 이렇게 해도 가능
        System.out.println("second() 종료됨");
    }
    public static void third() {
        System.out.println("third() 실행됨");
        System.out.println("third() 종료됨");
    }
    
}

//결과-후입선출

//main() 실행됨
//first() 실행됨
//second() 실행됨
//third() 실행됨

//third() 종료됨
//second() 종료됨
//first() 종료됨
//main() 종료됨
