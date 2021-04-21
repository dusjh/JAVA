package kr.co.bitcamp.assignment;

public class Member {
    
    private int memberId;   // 회원 아이디
    private String memberName;
    
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getmemberId() {
        return memberId;
    }

    public String getmemberName() {
        return memberName;
    }
    
    @Override
    public String toString() {
        return this.memberName+" 회원 아이디는 "+memberId+"입니다.";
    }
}
