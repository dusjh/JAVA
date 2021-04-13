package kr.co.bitcamp.array;

public class arr08prac {
    public static void main(String[] args) {
        
        //String 1차원 배열
        String[] province = new String[3];
        System.out.println(province[0]);
        
        //String 배열 초기화
        //배열 선언 및 생성 시 {}로 동시에 초기화
        String[] nation = new String[] {"한국", "중국", "일본"};
        System.out.println(nation[1]);
        
        for(int i = 0; i < nation.length; i++) {
            System.out.print(nation[i]);
        }//for
            
        //향상된 for문
            for(String iNation : nation) {
                System.out.print(iNation);
            }//for
        
      //String 2차원 배열
          String[][]asiaNations = {{"한","중","일"},{"태국","베트남","필리핀"}};
          
          System.out.println(asiaNations[0]);
          
          System.out.println(asiaNations[1][2]);
         
              

       
    }//main

}
