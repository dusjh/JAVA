package kr.co.bitcamp.assignment;

import java.util.ArrayList;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
       MemberArrayList memberArrayList = new MemberArrayList();
       
       Member member1 = new Member(1001, "이순신");
       Member member2 = new Member(1002, "신사임당");
       Member member3 = new Member(1003, "이성계");
       Member member4 = new Member(1004, "이도");
       
       memberArrayList.addMember(member1);
       memberArrayList.addMember(member2);
       memberArrayList.addMember(member3);
       memberArrayList.addMember(member4);
       
       memberArrayList.showAllMember();
       System.out.println();
       memberArrayList.removeMember(member1.getmemberId());
       memberArrayList.showAllMember();
    }

}
