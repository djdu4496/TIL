package com.kh.example.chap01_encapsulation;

public class Run {

	public static void main(String[] args) {
		// Account 사용하기 위해서 객체 생성
		Account a = new Account();
		
		// 현재 잔액 조회
		a.displayBalance();
		
		a.deposit(1000000);	// open declaration : ctrl+hover 
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 2000000;
		// The field Account.balance is not visible
		// private은 나 자신(Account)에서만 볼 수 있게끔 제한해주기 때문에
		// 외부 클래스인 Run에서는 볼 수 없음.
		
		a.withdraw(500000);
		a.displayBalance();
		// 이런 일이 일어난 이유 : 변수에 private을 안 걸어 놓았기 때문
		
		
	}

}
