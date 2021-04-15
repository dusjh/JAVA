package kr.co.bitcamp.polymorphism01;

// 자식클래스 3
public class Defender extends Player {

    private int defence;

    public Defender(String name, int age, int backNumber, int speed, int defence) {
        super(name, age, backNumber, speed);    // Player의 생성자  
        this.defence = defence;
    }

    public int getDefence() {
        return this.defence;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("방어 횟수: "+this.getDefence());
    }    
}
