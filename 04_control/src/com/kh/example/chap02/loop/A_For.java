package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
 
 		for(�ʱ��; ���ǽ�; ������){
 			���๮��;
 		}
 		�ʱ�� -> ���ǽ� -> (���ǽ��� true�϶�) ���๮�� -> ������ -> ���ǽ� -> (���ǽ��� true�϶�) -> (�ݺ�)
 		���ǽ� ����� false�� �� ������ �ݺ�
 		
 		for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
 		������, ��� �������� �� �ݺ����� �������� ���� ������
 		for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ���ؾ� ��
 		�� for() �ȿ����� ������ �� ��� �ʿ��� �����
 		
 		���ذ� �� �Ǹ� ��� ���̸� ������ ��� �Ẹ��
 		���� ���� �ݺ��ϴ� ���� �ٸ� ���� ���� Ǯ��� �ͺ��� �߿��ϴ�
	 */
	public void method1() {
		// 1���� 5���� ���
		for (int i = 1; i <= 5 ; i++) {
			System.out.println(i + "��° �ݺ��� ����");
		}
	}
	public void method1_1() {
		// �ڱ� �Ұ� �ټ� �� �ϱ� :�� �̸��� �ڽſ��
		for (int i = 1; i <= 5 ; i++) {				// i�� �� 1���� ������ �ʿ�� ����.
			System.out.println("�� �̸��� �������");
		}
		
	}
	public void method2() {
		// 5���� 1���� ����ϱ�
		for(int i = 5; i >= 1 ; i--) {
			System.out.println(i + "��° �ݺ��� ����");
		}

	}
	public void method2_1() {
		// 8���� 3���� ���
		for(int i = 8; i >=3 ; i--)	 {
			System.out.println(i);
		}
	}
	public void method3() {
		// 1���� 10 ������ Ȧ���� ���
		// 1 3 5 7 9
		for(int i = 1; i <= 10 ; i +=2)	 {		// ���ǽ��� ������ ������ ������.
			System.out.println(i);
		}
	}
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ���
		/*
		 	���� �� ���� �Է��ϼ���.
		 	��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		 	���� 
		 	ù ��° ���� : 1
		 	�� ��° ���� : 5
		 	1 2 3 4 5 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ���\n"
				+ "��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		
		// ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է��ϱ� ���� ��ġ
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		// ----------------------------------------
		
		System.out.println("");
		
//		for (int i = min ; i <= max ; i++) {       // ��� 1 �̰͸� �˾Ƶ� ����ϴ�
//			System.out.println(i);
//		}
		for(; min <= max; min++) {                 // ��� 2for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
			System.out.print(min + " ");
		}
	}
	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�." ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int i;				// ����
		i = 2;				// �ʱ�ȭ
//		int i = 2;			// ����� ���ÿ� �ʱ�ȭ

		
		if(num <=9 && num >=1) {
		  for(i = 1; i <= 9; i++) {
				System.out.println(num+"*"+ i + "="+ num * i);
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		Math.random(); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
					   // �� �޼ҵ�� ������ �ִ�. 
//		System.out.println(Math.random()); // Ȯ���غ���
		// ���� Math.random()�� ����: 0 <== Math.random() < 1
		// 10���� ����� ���� 10 ���ϱ� : 0 <== Math.random() * 10 < 10
		// 10�� �����ϱ� ���� 1 ���ϱ� : 1 <= Math.random() * 10 + 1 < 11         
		// (������ �Ǽ��� ��ȯ�ǰ� �ִ�) 
		// ������ ����� ���� int ����ȯ : 1 <= (int)Math.random() * 10 + 1 < 11
		int random = (int)(Math.random() * 10 + 1);
//		System.out.println(random);
		
		int sum = 0;
		
		for(int i = 1; i <= random ; i++) {
			sum += i;
		}
		System.out.printf("1���� %d���� ���� �հ� : %d", random, sum);
	}
	public void method6() {
		// ��ø �ݺ���
		// 2�ܺ��� 9�ܱ��� ���
		
		int dan, su;
		
		for(dan = 2; dan <= 9; dan++) {
			for(su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
			}	
				System.out.println();
		}
	}
	public void method7() {
		// �Ƴ��α� �ð� ��� : 0�� 0�� ~ 23�� 59��
		
		int hour, min;
		
		for(hour = 0; hour <=23 ; hour++) {
			for(min = 0; min <= 59; min++) {
				System.out.printf("%d�� %d��%n", hour, min);
			}
		}
	}
	public void method8() {
		// �� �ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// �� ���� ����ڰ� �Է��� ����ŭ ���
		/*
		 	����� �� �� : 3
		 	*****
		 	*****
		 	*****	 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		int i,j;
		
		for(i = 1 ; i <= row; i++) {
			for(j = 1 ; j <=5;j++) {
			System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 	�� �� : 6
		 	ĭ �� : 6
		 	1*****
		 	*2****
		 	**3***
		 	***4**
		 	****5*
		 	*****6		 
		 */

		Scanner sc = new Scanner(System.in);// ���� ������ �ٹٲ� ���ֱ�
		System.out.print("�� �� : "); 			// ���� ���� row�� ������, i�� ����
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");			// ĭ�� ��    column ������, j�� ����
		int column = sc.nextInt();
		
		int i,j;
		
		for(i = 1; i <=row ; i++) {
			for(j=1;j<=column;j++) {
				if(i==j) {
					System.out.print(i);
				} else {
					System.out.print('*');
				}	
			}
			System.out.println();
		}											
	}
	public void method9_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int column = sc.nextInt();
		
		int i,j;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==j) {
					System.out.print(i);
				}	else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
	}
		
		
}

