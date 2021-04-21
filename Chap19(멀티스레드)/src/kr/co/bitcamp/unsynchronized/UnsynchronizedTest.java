package kr.co.bitcamp.unsynchronized;

public class UnsynchronizedTest {

    public static void main(String[] args) {
        
        // 공유객체 생성
        Calculator calculator = new Calculator();
        
        /*
         * UserB 스레드가 설정한 값으로 UserA 스레드도 출력한다. -> 데이터 신뢰성 붕괴
         * 동기화 처리를 함으로써 객체의 잠금이 일어나면서 데이터의 신뢰성을 확보해 준다.
         */
        UserA userA = new UserA();
        userA.setCalculator(calculator);
  
        UserB userB = new UserB();
        userB.setCalculator(calculator);
        
        userA.start();
        userB.start();

    }
}
