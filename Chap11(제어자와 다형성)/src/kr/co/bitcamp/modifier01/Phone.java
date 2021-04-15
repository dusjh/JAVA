package kr.co.bitcamp.modifier01;

public class Phone {
    /*
     * protected 접근 제어자
     * 같은 패키지에서 다 접근 가능(상속여부 상관없음): 상속받지 않은 클래스도 접근 가능.
     * 다른 패키지에서 다 접근 불가능(상속여부 상관없음)
     */
    protected String model;
    private String color;
    private String company;
   
    // 기본 생성자
    public Phone() {       
    }

    // 매개변수가 있는 생성자
    public Phone(String model, String color, String company) {
        this.model = model;
        this.color = color;
        this.company = company;
    }

    // getter()
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }
    
     @Override // 재정의
    public String toString() {
        String str = "모델: "+this.getModel()+
                        ", 색상: "+this.getColor()+
                        ", 제조회사: "+this.getCompany();
         return str;
    }
}
