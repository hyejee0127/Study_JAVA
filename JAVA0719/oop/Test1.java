package oop;

/*
 * 은행계좌 (Account) 클래스 정의
 * - 멤버변수
 * 		1) 계좌번호(accountNo, "xxx-xxxx-xxx" = 문자열)
 * 		2) 예금주명(ownerName, "xxx" = 문자열)
 * 		3) 현재잔고(balance, XXXXX = 정수)
 * */ 
class Account {
//	String accountNo;
//	String ownerName;
//	int balance;
	
	String accountNo = "222-2222-222";
	String ownerName = "소지섭";
	int balance = 9999999;
}

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 은행계좌 Account 클래스의 인스턴스 생성
		 * 다음과 같이 출력되도록 초기화 및 출력
		 * < 출력예시 >
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 100000원
		 * */
		Account acc = new Account();
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 100000;
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance + "원");
		System.out.println("------------------");
		Account acc2 = new Account();
		System.out.println("계좌번호 : " + acc2.accountNo);
		System.out.println("예금주명 : " + acc2.ownerName);
		System.out.println("현재잔고 : " + acc2.balance + "원");
	}

}





