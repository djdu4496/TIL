package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("7. ����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1: System.out.println("�Է¸޴��Դϴ�."); break;
			case 2: System.out.println("�����޴��Դϴ�."); break;
			case 3: System.out.println("��ȸ�޴��Դϴ�."); break;
			case 4: System.out.println("�����޴��Դϴ�."); break;
			case 7: System.out.println("���α׷��� ����˴ϴ�."); break;
			default: System.out.println("�߸��� ��ȣ�Դϴ�");
			} 
		}while(menuNum != 7);
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if((num>0)&&(num%2==0)) {
			System.out.println("¦����");
		} else if(num%2!=0) {
			System.out.println("Ȧ����");		
		}	else if(num<0){
			System.out.println("����� �Է����ּ���.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double average = (double)(total / 3);
		
		if(kor>=40&&math>=40&&eng>=40&&average>=60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + total);
			System.out.println("��� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}	else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String season ="";
			
		switch(month) {
		case 1: 
		case 2: 
		case 12:
			season = "�ܿ�";
			break;
		case 3: 
		case 4: 
		case 5: 
			season = "��";
			break;
		case 6: 
		case 7: 
		case 8: 
			season = "����";
			break;
		case 9: 
		case 10: 
		case 11: 
			season = "����";
			break;
		default:
			System.out.printf("%d���� �߸� �Էµ� ���Դϴ�.",month);
		}
		if(month <12) {
			System.out.printf("%d���� %s�Դϴ�.",month,season);
		} 
	}
	public void practice5() { // �ذ� : ���ڿ��� ������ �������� �˾ƺ�����, equals �޼ҵ带 ȣ���ؼ� ���Ѵ�.
							  // equals���� �ƴ� ���� !xx.equals(xx);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		String corId = "myId";
		String corPw = "myPassword12";
		
		if((id.equals(corId))&&(pw.equals(corPw))) {
			System.out.println("�α��� ����");
		} else if(!pw.equals(corPw)){
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if(!id.equals(corId)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "������":
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default:
			System.out.println("�� �� ���� �����Դϴ�.");
		}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double m = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double kg = sc.nextDouble();
		
		double bmi = kg/(m*m);
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("��ü��");
		} else if(bmi>=18.5&&bmi<23) {
			System.out.println("����ü��");
		} else if(bmi>=23&&bmi<25) {
			System.out.println("��ü��");
		} else if(bmi>=25&&bmi<30) {
			System.out.println("��");
		} else if(bmi>=30) {
			System.out.println("�� ��");
		}
		
	}
	public void practice8() {		// ������ : �Ҽ��� ��°¥������ �ݿ����� �ʴ´�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String sign = sc.next();
		
		
		
		double sign1 = (double)num1+num2;
		double sign2 = (double)num1-num2;
		double sign3 = (double)num1*num2;
		double sign4 = (double)num1/num2;
		double sign5 = (double)num1%num2;
		
		if(num1<0||num2<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		} else {
			switch (sign) {
			case "+":
				System.out.printf("%d+%d=%f", num1,num2,sign1);
				break;
			case "-":
				System.out.printf("%d-%d=%f", num1,num2,sign2);
				break;
			case "*":
				System.out.printf("%d*%d=%f", num1,num2,sign3);
				break;
			case "/":
				System.out.printf("%d/%d=%f", num1,num2,sign4);
//				System.out.println(num1+"/"+num2+"="+(double)(num1/num2));
				break;
			case "%":
				System.out.printf("%d%%d=%f", num1,num2,sign5);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}	
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fin = sc.nextInt();
		System.out.print("���� ���� : ");
		int work = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int att = sc.nextInt();
			
		System.out.println("================= ��� =================");
		
		double mid1 = (double)mid*2/10;
		double fin1 = (double)fin*3/10;
		double work1 = (double)work*3/10;
		double att1 = (double)att;
		double total = mid1 + fin1 + work1+att;						
			
		if(total>=70) {
			System.out.println("�߰� ��� ����(20) : " + mid1);
			System.out.println("�⸻ ��� ����(30) : " + fin1);
			System.out.println("���� ����(30) : " + work1);
			System.out.println("�⼮ ����(20) : " + att1);			
			System.out.println("���� : " + total);
			System.out.println("Pass");
		}	else if(total<70&&att>=15) {
			System.out.println("�߰� ��� ����(20) : " + mid1);
			System.out.println("�⸻ ��� ����(30) : " + fin1);
			System.out.println("���� ����(30) : " + work1);
			System.out.println("�⼮ ����(20) : " + att1);			
			System.out.println("���� : " + total);
			System.out.println("Fail [���� �̴�]");
		}	else if(att1<15) {				
		    System.out.printf("Fail [�⼮ ȸ�� ����(%d/20)]",att);
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		
		System.out.print("���� : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			practice1();break;
		case 2:
			practice2();break;
		case 3:
			practice3();break;
		case 4:
			practice4();break;
		case 5:
			practice5();break;
		case 6:
			practice6();break;
		case 7:
			practice7();break;
		case 8:
			practice8();break;
		case 9:
			practice9();break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}