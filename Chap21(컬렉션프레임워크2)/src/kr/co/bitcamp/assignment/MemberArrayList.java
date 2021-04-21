package kr.co.bitcamp.assignment;

import java.util.ArrayList;

public class MemberArrayList {

        private ArrayList<Member> arrayList;    // arrayList 생성
        
       public MemberArrayList() {
           arrayList = new ArrayList<>();       // Member로 선언한 ArrayList 생성
       }
      
       // ArrayList에 멤버 추가
       public void addMember(Member member) {
           arrayList.add(member);
       }
       
       // 멤버 삭제 기능 (삭제가 되면 true, 안 되면 false)
       public boolean removeMember(int memberId) {     // 멤버아이디를 매개변수로 삭제 여부를 반환
           
           for(int i=0; i<arrayList.size(); i++) {     // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
               Member member = arrayList.get(i);
               int tempId = member.getmemberId();
               
               if(tempId == memberId) {        // 멤버아이디가 매개변수가 일치하면
                   arrayList.remove(i);        // 해당 멤버 삭제
                   return true;                // 삭제되면 true값 반환
               }
           }
           System.out.println(memberId+"가 존재하지 않습니다.");  // 일치하지 않으면 false값 반환
           return false;
       }
       
       // 모든 멤버 보여주기 기능
       public void showAllMember() {
           for(Member member : arrayList) {
               System.out.println(member);
           }
       }
   
}
