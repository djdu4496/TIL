package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int i;
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else {
			for(i=1;i<=num;i++) {
			System.out.print(i+" ");
			}
		}
	}
	public void practice1_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
			
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
		
		int i=1;
		
		while(i<=num) {
			System.out.print(i+" ");
			i++;
		}
	}
	public void practice2(){
		Scanner sc = new Scanner(System.in);
				
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			practice2();
		} else {
			int i=1;
			while(i<=num) {
				System.out.print(i + " ");
				i++;
			}
		}
	}
	public void practice2_1() {
		// ���� ���� for�� Ǯ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			practice2();
		} else {
			for(int i=1;i<=num;i++) {
				System.out.print(i + " ");
			}
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else {
			for(int i=num;i>=1;i--) {
				System.out.print(i+" ");
			}
		}
	}
	public void practice3_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else {
			int i=num;
			while(i>=1) {
				System.out.print(i+" ");
				i--;
			}
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			practice4();
		} else {
			for(int i=num;i>=1;i--) {
				System.out.print(i+" ");
			}
		}
	}
	public void practice4_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			practice4();
		} else {
			int i=num;
			while(i>=1) {
				System.out.print(i+" ");
				i--;
			}
		}
	}
	public void practice5() {	// ������ ��¹����� ��ġ ���� x
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int i=0;
		int j=1;
		
		for(;i<=num;i+=num) {
			for(;j<=(num-1);j++) {
				System.out.print(j+" + ");
			}			
		}
		System.out.print(num + " = " + num*(num+1)/2);	
	}
	public void practice5_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int i=0;
		int j=1;
		
		while(i<=num) {
			while(j<=(num-1)) {
			System.out.print(j+" + ");
			j++;
			}
			i+=num;
		}
		System.out.print(num + " = " + num*(num+1)/2);	
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min=0;
		int max=0;
		
		if(start>end) {
			min=end;
			max=start;
		} else {
			min=start;
			max=end;
		}
		
		if(start<1||end<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			for(;min<=max;min++) {
				System.out.print(min+" ");
			}
		}
	}
	public void practice6_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min=0;
		int max=0;
		
		if(start>end) {
			min=end;
			max=start;
		} else {
			min=start;
			max=end;
		}
		
		if(start<1||end<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			while(min<=max) {
				System.out.print(min+" ");
				min++;
			}
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min=0;
		int max=0;
		
		if(start>end) {
			min=end;
			max=start;
		} else {
			min=start;
			max=end;
		}
		
		if(start<1||end<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			practice7();
		} else {
			for(;min<=max;min++) {
				System.out.print(min+" ");
			}
		}
	}
	public void practice7_1() {
		// ���� ���� while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min=0;
		int max=0;
		
		if(start>end) {
			min=end;
			max=start;
		} else {
			min=start;
			max=end;
		}
		
		if(start<1||end<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			practice7_1();
		} else {
			for(;min<=max;min++) {
				System.out.print(min+" ");
			}
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.printf("===== %d�� =====%n",dan);
		
		int su=1;
		
		for(;dan<=9;dan++) {
			for(;su<=9;su++) {
				System.out.println(dan+" * "+su+" = "+(dan*su));
			}
		}
	}
	public void practice8_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.printf("===== %d�� =====%n",dan);
		
		int su=1;
		
		while(dan<=9) {
			while(su<=9) {
				System.out.println(dan+" * "+su+" = "+(dan*su));
				su++;
			}
			dan++;
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} else {
			System.out.printf("===== %d�� =====%n",dan);
			for(;dan<=9;dan++) {
				for(int su=1;su<=9;su++) {
					System.out.println(dan+" * "+su+" = "+(dan*su));
				}
				if(dan<=8) {
					System.out.printf("===== %d�� =====%n",dan+1);
				}				
			}
		}
	}
	public void practice9_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} else {
			System.out.printf("===== %d�� =====%n",dan);
			while(dan<=9) {
				int su=1;
				while(su<=9) {
					System.out.println(dan+" * "+su+" = "+(dan*su));
					su++;
				}
				if(dan<=8) {
					System.out.printf("===== %d�� =====%n",dan+1);
					dan++;
				}
			}
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			practice10();
		} else {
			System.out.printf("===== %d�� =====%n",dan);
			for(;dan<=9;dan++) {
				for(int su=1;su<=9;su++) {
					System.out.println(dan+" * "+su+" = "+(dan*su));
				}
				if(dan<=8) {
					System.out.printf("===== %d�� =====%n",dan+1);
				} else {
					break;
				}
			}
		}
	}
	public void practice10_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			practice10();
		} else {
			System.out.printf("===== %d�� =====%n",dan);
			while(dan<=9) {
				int su=1;
				while(su<=9) {
					System.out.println(dan+" * "+su+" = "+(dan*su));
					su++;
				}
				if(dan<=8) {
					System.out.printf("===== %d�� =====%n",dan+1);
					dan++;
				} else {
					break;
				}
			}
		}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int sNum = sc.nextInt();
		System.out.print("���� : ");
		int cha = sc.nextInt();
		
		int i=1;

		for(;i<=10;i++) {
			System.out.print(sNum+(i-1)*cha + " ");
		}
	}
	public void practice11_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int sNum = sc.nextInt();
		System.out.print("���� : ");
		int cha = sc.nextInt();
		
		int i=1;

		while(i<=10) {
			System.out.print(sNum+(i-1)*cha + " ");
			i++;
		}
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		String op="";
		
		while(!op.equals("exit")) {
			System.out.print("������(+, -, *, /, %) : ");
			op = sc.next();
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			switch(op) {
				case "+":
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case "-":
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case "*":
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case "/":
					if(num2!=0) {
						System.out.println(num1+" / "+num2+" = "+(num1/num2));
						break;
					}	else if(num2==0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
						break;
					}
				case "%":
					System.out.println(num1+" % "+num2+" = "+(num1%num2));
					break;
				case "exit":
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				}
			}
	}
	public void practice12_1() {
		// ���� ���� do~while�� Ǯ���
		Scanner sc = new Scanner(System.in);
		
		String op=null; 		// ��Ģ: ��Ʈ���� �ʱ�ȭ�� null������ ���ش�.
								// while�� "";, do~while�� null������ �ʱ�ȭ�ϴ°� �ƴϴ�.
		do {
		System.out.print("������(+, -, *, /, %) : ");
		op = sc.next();
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		switch(op) {
			case "+":
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			case "-":
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
			case "*":
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
			case "/":
				if(num2!=0) {
					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				}	else if(num2==0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
			case "%":
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
				break;
			case "exit":
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
		}while(!op.equals("exit"));
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("������ ���� ���� ������ �����ϼ���.");		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice13_1() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("������ ���� ���� ������ �����ϼ���.");		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int i=1;
		while(i<=num) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("������ ���� ���� ������ �����ϼ���.");		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=i;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14_1() {
		// ���� ���� do~while�� Ǯ���
		Scanner sc = new Scanner(System.in);	
		System.out.println("������ ���� ���� ������ �����ϼ���.");		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int i=1;
		
		while(i<=num) {
			int j=i;					// ��ġ �߿�
			while(j<=num) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
