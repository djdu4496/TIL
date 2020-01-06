package com.kh.example.chap01_encapsulation;

public class Run {

	public static void main(String[] args) {
		// Account ����ϱ� ���ؼ� ��ü ����
		Account a = new Account();
		
		// ���� �ܾ� ��ȸ
		a.displayBalance();
		
		a.deposit(1000000);	// open declaration : ctrl+hover 
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 2000000;
		// The field Account.balance is not visible
		// private�� �� �ڽ�(Account)������ �� �� �ְԲ� �������ֱ� ������
		// �ܺ� Ŭ������ Run������ �� �� ����.
		
		a.withdraw(500000);
		a.displayBalance();
		// �̷� ���� �Ͼ ���� : ������ private�� �� �ɾ� ���ұ� ����
		
		
	}

}
