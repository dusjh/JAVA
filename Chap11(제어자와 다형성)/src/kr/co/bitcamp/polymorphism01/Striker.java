package kr.co.bitcamp.polymorphism01;

// 자식클래스 1
public class Striker extends Player {
    
    private int shoot;

    public Striker(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed);       // Player의 생성자  
        this.shoot = shoot;
    }
    
    public int getShoot() {
        return this.shoot;
    }
    
    @Override
    public void info() {
        super.info();     // Player의 info() 호출
        System.out.println("유효 슈팅: "+this.getShoot());
       } 
}
    
