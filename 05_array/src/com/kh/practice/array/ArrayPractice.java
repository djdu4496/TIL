package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
//			�ڷ���[] �迭�� = new �ڷ���[�迭ũ��]
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("���� ������ �Է����ּ���.");
		} else {
			int[] arr = new int[num];
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = i + 1;
				System.out.print(arr[i]+ " ");	
			}

		}
	}
	public void practice4() {
		
		String str[] = {"���","��","����","������","����"};
				
		System.out.println(str[1]);
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int cnt=0;								// cnt ���� ����
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		int arr[] = new int[str.length()];		// String�� �ƴ϶� int��.
//		application
		for(int i=0;i<arr.length;i++) {
			arr[i]= str.charAt(i);
		}
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
	
		System.out.print(str+"��"+" "+ch+"�� �����ϴ� ��ġ(�ε���) : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
				cnt++;
				
			}
		}
		System.out.println();
		System.out.println("i ���� : "+cnt);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num<7&&num>=0) {
			System.out.println(arr[num]+"����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int sum=0;
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
			System.out.println("���� : "+ sum);		
	}
	public void practice8() {					// �޸�(,) ���� X
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int odd =sc.nextInt();
		
		if(odd<3||odd%2==0) {
			System.out.println("�ٽ� �Է��ϼ���");
		} else {
			int arr[] = new int[odd];
			
			for(int i=0;i<arr.length;i++) {
				if(i<arr.length*1/2+1) {
					arr[i]= i + 1;	
					System.out.print(arr[i]+" ");
				} else if(i>=arr.length*1/2+1){
					arr[i]= arr[i-1]-1;	
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		
		String str[] = {"���", "�Ҵ�", "�����޺�", "����޺�"};
		
		switch(chicken) {
		case "���":
		case "�Ӵ�":
		case "�����޺�":
		case "����޺�":
			System.out.printf("%sġŲ ��� ����",chicken);
			break;
		default:
			System.out.printf("%sġŲ�� ���� �޴��Դϴ�",chicken);
		}
		
	}
	public void practice9_1() {
		// if������ �� ���� ������
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		
		String str[] = {"���", "�Ҵ�", "�����޺�", "����޺�"};
		int i=0;
			if(chicken==str[i]) {
				System.out.printf("%sġŲ ��� ����",chicken);
			} else {
				System.out.printf("%sġŲ�� ���� �޴��Դϴ�",chicken);
			}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String id = sc.nextLine();

		char str[] = new char[id.length()];
		char copyStr[] = str;
		
		for(int i=0;i<copyStr.length;i++) {
			if(i<8) {
				copyStr[i]=id.charAt(i);
			} else	{
				copyStr[i]='*';
			}
			System.out.print(copyStr[i]);
		}

	}
	public void practice11() {
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
	}
	public void practice12() {
		int arr[] = new int[10];
				
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int max=arr[0];		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			} 
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}
	
	
	public void practice13() {
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {		
			arr[i]=(int)(Math.random()*10+1);
				for(int j=0;j<i;j++) {
					if(arr[i]==arr[j]) {
						i--; 
						break;
					}
				}		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice14() {
		int arr[] = new int[6];
		
		for(int i=0;i<arr.length;i++) {		
			arr[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);		// �������� �޼ҵ�
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice15() {					
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char arr1[] = new char[str.length()];
		char arr2[] = new char[str.length()];
		
		int flag=1;
		int cnt=0;
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i=0;i<str.length();i++) {	
			arr1[i]=str.charAt(i);
		}
		for(int i=0;i<arr1.length;i++) {
			flag=1;
			for(int j=0;j<i;j++) {
				if(arr1[i]==arr1[j]) {
					flag=0;		// boolean
					break;
				} else {
					flag=1;
				}
	
			}
			if(flag==1) {
				arr2[cnt] = arr1[i];
				cnt++;
			}
		}
		
		for(int i=0;i<cnt;i++) {
			if(i==0) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(", "+arr2[i]);
			}
		}
		System.out.println();
		System.out.println("���� ���� : " +cnt);	
	}
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] str = new String[size];
		
		for(int i=0;i<size;i++) {
			System.out.print((i+1)+"��° ���ڿ� : ");
			String str1 = sc.nextLine();
			str[i]= str1;
		}

		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N)");
			char ch = sc.nextLine().charAt(0);

			if(ch=='y'||ch=='Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int sizeNum = sc.nextInt();
				sc.nextLine();

				String copy[]= new String[str.length+sizeNum];

				for(int i=0;i<copy.length;i++) {
					if(i<str.length) {
						copy[i] = str[i];
					} else {
						System.out.print((i+1)+"��° ���ڿ� : ");
						String str1 = sc.nextLine();
						copy[i] = str1;
					}
				}
				str = copy;
			}	else if(ch=='n'||ch=='N') {
				break;
			}	else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}// while������
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}
}
