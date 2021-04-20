package kr.co.bitcamp.multitype;

// 일반클래스 2
public class Tv {

    private int year;
    private int month;
    
    // 기본 생성자
    public Tv() {
    }
    
    // 매개변수가 있는 생성자
    public Tv(int year, int month) {
        super();
        this.year = year;
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
  
}
