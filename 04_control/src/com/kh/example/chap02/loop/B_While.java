package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*		 
 		while(���ǽ�){
 			���� ����;
 			[������ or �б⹮;]
 		}
 	���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���� ���� �ϼ� -> ���ǽ� Ȯ�� -> (�ݺ�)	
 	���ǽ� ����� false�� �� ������ �ݺ�
	 */
	public void method1() {
		// 1����	5���� ���;
		int i = 1;
		while(i <= 5) {
			System.out.println(i + "��° �ݺ��� ����");
			i++;
		}

	}
	public void method1_1() {
		// �ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �������
		
		int i=0;
		while(i < 5) {
			System.out.println("�� �̸��� �������");
			i++;
		}
	}
	public void method2() {
		// 5���� 1���� ���
		
		int i=5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
	}
	public void method3() {
		// 1���� 10 ������ Ȧ���� ���
		
		int i=1;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
	}
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ������ ���� ���
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		// ù ��° ���� :
		// �� ��° ���� :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min = 0;
		int max = 0;
		
		if (start > end) {
			max = start;	//  ����(����) ����(������ ��)�� �ݴ�� ��� Ʋ�Ⱦ���
			min = end;		
		}	else {
			min = start;
			max = end;
		}
		
		while (min <= max) {
			System.out.println(min);
			min++;
		}
	}
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		// ������ ���� ������ 1~9������ ����� �Է��Ͽ��� �մϴ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>=1&&num<=9) {
			int i=1;
			while(i<=9) {
				System.out.println(num + "*" + i + "=" + num * i);	// '*'(x), "*"(o)
				i++;
			}
		}	else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�");
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		int random = (int)(Math.random()* 10 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i<=random) {
			sum +=i;
			i++;
		}
		System.out.printf("1���� %d������ ���� �հ� : %d", random, sum);
	}
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple		���ڿ� : love		���ڿ� : ant
		// 0 : a				0 : l			0 : a
		// 1 : p				1 : o			1 : n
		// 2 : p				2 : v			2 : t
		// 3 : l				3 : e
		// 4 : e
		
		// ����1. for
		// ����2. while
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();	
		
		int length = str.length();
		sc.close();
		// ���� 1. for
//		for(int i=0;i<5;i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�(method) : length()
		
//		System.out.println(str + "�� ���� : " + length);
//		for(int i=0;i<length;i++) { // or ���� �� �ְ� for(int i=0;i<str.length();i++) 
//		char ch = str.charAt(i);
//		System.out.println(i + " : " + ch);
//		}
		// ------------------------------------
		// ����2. while
		
		int i = 0;
		while(i<length) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
		
	}
	public void method7() {
		//2�ܺ��� 9�ܱ��� ���
		int num = 2;	
		
		while(num<=9) {
			int i=1;
			while(i<=9) {			
				System.out.println(num + "*" + i + "=" + num * i );
// (����� �ڵ�)	System.out.printf("%d * %d = %d%n", num, i, (num*i));
				i++;
			}
			num++;
		}
	}
	public void method8() {
		// �Ƴ��α� �ð� 0:0
		
		int h = 0;
		int m = 0;
		
		
		while (h<=23) {	
			m=0;
			while(m<60) {
				System.out.println(h + ":" + m);
// (����� �ڵ�)	System.out.printf("%02d�� %02d��%n", h, m);  // %d : ���� // %2d : ����(�� �ڸ� Ȯ���ϰڴ�) // %-2d : ���� ���� + �� �ڸ� Ȯ��
				m++;
			}
			h++;
		}
		
	}
	public void method9() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;     				// �߿� 
		while(menuNum != 9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.println("�޴� ���� : "); 
											 
			menuNum = sc.nextInt(); 	    // �߿� 

			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");	
			}
		}
	}
}
	

