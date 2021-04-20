package kr.co.bitcamp.boxing;

public class StringToPrimitive {

    public static void main(String[] args) {
        
        // parse(): 해당타입으로 바꿔주는 메서드
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}