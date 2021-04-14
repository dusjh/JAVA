package kr.co.bitcamp.bankApp;

import java.util.Scanner;

public class BankApp {
    
    // 배열 100개 정적멤버->(메모리가 낭비될 수도 있음)
    private static Account[] accountArray = new Account[100];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean run = true;
        
        while(run) {
            System.out.println("=======================================================");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금하기 | 4. 출금하기 | 5. 종료");
            System.out.println("=======================================================");
            System.out.print("선택> ");
            
            int choice = scan.nextInt();
            
            if(choice == 1) {
                createAccount();                 
            }//if끝
            else if(choice == 2) {
                accountList();
            }//else if2끝
            else if(choice == 3) {
                deposite();
            }//else if3끝
            else if(choice == 4) {
                withdraw();
            }//else if4끝
            else if(choice == 5) {
                System.out.println("계좌관리 프로그램을 종료합니다.");
                run = false;
            }//else if5끝
            else {
                System.out.println("잘못 입력했습니다.");
            }//else끝 
        }//while끝
    }//main끝
    
    
// 1. 계좌 생성 
    public static void createAccount() {  
        System.out.println("---------------");
        System.out.println("계좌를 생성합니다.");
        System.out.println("---------------");
        
        System.out.print("계좌 번호: ");
        String ano = scan.next();        // 한 단어를 입력받을 때 용이한 메서드 (공백 발견 시 그 앞까지만 String으로 리턴)
        // scan.nextLine();    한 문장이나 한 줄을 입력받을 때 용이한 메서드
        
        System.out.print("계좌주: ");
        String owner = scan.next();
        
        System.out.print("초기 입금액: ");
        int balance = scan.nextInt();
        
        Account newAccount = new Account(ano, owner, balance);  // array 개수만큼 만들어짐?
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("계좌 생성이 완료되었습니다.");
//                System.out.println(accountArray[i].getAno()+", "
//                                    +accountArray[i].getOwner()+", "
//                                    +accountArray[i].getBalance());
                break;
            }//if끝
        }//for끝    
    }//cA끝
    
    
//2. 계좌 목록
    public static void accountList() {
        System.out.println("------------------");
        System.out.println("계좌 목록을 출력합니다.");
        System.out.println("------------------");
        
        for(int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            
            // 계좌에 대한 내용이 존재한다면 
            if(account != null) {
                System.out.print(account.getAno());
                System.out.print("\t");
                System.out.print(account.getOwner());
                System.out.print("\t");
                System.out.print(account.getBalance());
                System.out.println();
            }//if끝        
        }//for끝       
    }//aL끝
    
    
// 3. 예금하기
    public static void deposite() {
        System.out.println("------------------");
        System.out.println("예금을 합니다.");
        System.out.println("------------------");
        
        System.out.print("계좌번호 입력: ");
        String ano = scan.next();
        System.out.print("예금액: ");
        int money = scan.nextInt();
        
        // 계좌찾기 메서드 호출
        Account account = findAccount(ano);
        
        if(account == null) {
            System.out.println("계좌가 없습니다. 확인 바랍니다.");
            return;
        }//if끝
        
        account.setBalance(account.getBalance()+money);
        System.out.println("예금이 성공했습니다. 현재 잔액: "+account.getBalance());      
    }//deposite끝
    
// 3-1. 계좌 찾기
    public static Account findAccount(String ano) {
        Account account = null;
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                // 매개변수로 넘어온 계좌번호와 동일하다면 
                if(accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                    break;
                }//if끝
            }//if끝
        }//for끝
        return account;
    }//fA끝
    
    
// 4. 출금하기
    public static void withdraw() {
        System.out.println("------------------");
        System.out.println("출금을 합니다.");
        System.out.println("------------------");
        
        System.out.print("계좌번호 입력: ");
        String ano = scan.next();
        System.out.print("출금액: ");
        int money = scan.nextInt();
        
        // 계좌찾기 메서드 호출
        Account account = findAccount(ano);
        
        if(account == null) {
            System.out.println("계좌가 없습니다. 확인 바랍니다.");
            return;
        }//if끝
        
        account.setBalance(account.getBalance()-money);
        System.out.println("출금이 성공했습니다. 현재 잔액: "+account.getBalance());      
    }//withdraw끝
    
    

}
