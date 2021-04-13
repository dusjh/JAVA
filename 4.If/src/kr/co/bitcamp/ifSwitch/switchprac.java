package kr.co.bitcamp.ifSwitch;

import java.util.Scanner;
public class switchprac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //사용자를 위한 객체 생성
        System.out.print("연령대: ");
        int age = scanner.nextInt();
        
        //사용자 입력 예외처리
        //11살~19살
        if(age > 10 && age < 20) {
            System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램 종료");
            System.exit(0);
        }//if
        //21살~29살
        else if(age > 20 && age < 30) {
            System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램 종료");
            System.exit(0);
        }//else if
        //31살~39살
        else if(age > 30 && age < 40) {
            System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램 종료");
            System.exit(0);
        }//else if
        //40살~49살
        else if(age > 40 && age < 50) {
            System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램 종료");
            System.exit(0);
        }//else if
        //50살~59살
        else if(age > 50 && age <60) {
            System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램 종료");
            System.exit(0);
        }//else if
        else {
            if(age < 10) {
                System.out.println("최소 10이상만 입력해주세요. 프로그램 종료");
                System.exit(0);
            }//if
        }//else
            
        //switch 조건문
        // 변수조건: 정수형(byte, short, int)
        // long 타입X, char타입O
        
        switch(age) {
        case 10: 
            System.out.println(age + "대입니다. 참고서 코너는 A구역입니다.");
            break;
        case 20: 
            System.out.println(age + "대입니다. 취업서적 코너는 B구역입니다.");
            break;
        case 30: 
            System.out.println(age + "대입니다. 자기개발 코너는 C구역입니다.");
            break;
        case 40: 
            System.out.println(age + "대입니다. 재테크 코너는 D구역입니다.");
            break;
        case 50: 
            System.out.println(age + "대입니다. 재취업 코너는 E구역입니다.");
            break;
        default:
            System.out.println("60대 이상입니다. 건강/장수 코너는 F구역입니다.");
            break;
        }//switch
        
        scanner.close();   
    }//main

}
