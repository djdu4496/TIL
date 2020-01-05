package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {

		int[][] iArr = new int[3][3];

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				System.out.printf("(%d, %d)", i,j);
			}
			System.out.println();
		}
	}
	public void practice2() {

		int[][] iArr = new int[4][4];

		int value=1;

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				iArr[i][j]=value;
				value++;
			}
		}// ����

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}// ��� p.s ���� ����	
	}
	public void practice3() {

		int[][] iArr = new int[4][4];

		int value=16;

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				iArr[i][j]=value;
				value--;
			}
		}

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {

		int[][] iArr = new int[4][4];


		for(int i=0;i<iArr.length-1;i++) {
			for(int j=0;j<iArr.length-1;j++) {
				iArr[i][j]=(int)(Math.random()*10+1);
			}

		}//����

		//���ϴ� �� �Է�
		int sum=0;
		for(int i=0;i<iArr.length-1;i++) {
			for(int j=0;j<iArr.length-1;j++) {

				iArr[i][3] += iArr[i][j];
				iArr[3][i] += iArr[j][i];



			}
			sum = (iArr[i][3]+iArr[3][i]);

			iArr[3][3] +=sum;
		}

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}//����
	}
	public void practice5() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�� ũ�� : ");
			int rSize = sc.nextInt();
			System.out.print("�� ũ�� : ");
			int cSize = sc.nextInt();
		
			char ch = 0;
			
			if(rSize>=1&&rSize<=10&&cSize>=1&&cSize<=10){
				
				char[][] cArr = new char[rSize][cSize];
				
				for(int i=0;i<cArr.length;i++) {
					for(int j=0;j<cArr[i].length;j++) {
						cArr[i][j] = (char)((int)(Math.random()*26+65));
						
						System.out.print(cArr[i][j]+" ");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}		
		}//�ݺ���
	}
	public void practice6() { 
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
											{"��", "��", "��", "��", "��"}, 
											{"��","��", "��", "��", "��"}, 
											{"��", "��", "��", "��", "��"}, 
											{"��", "��", "! ", "��", "!! "}};
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				
				System.out.print(strArr[j][i]+" ");
				
			}
		}
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char value = 'a';
		
		char[][] chArr = new char[row][]; // ���� �迭 �Ҵ�
		
		
		
		for(int i=0;i<chArr.length;i++) {
			System.out.print(i+"���� �� ũ�� : ");
			int col = sc.nextInt();
			chArr[i]= new char[col];
		}// ���� �迭 �Ҵ� + �� ���(2. ���� for�� �̿�)
		

		
		for(int i=0;i<chArr.length;i++) {
			for(int j=0;j<chArr[i].length;j++) {
				chArr[i][j]=value++;
			}
		}
		
		for(int i=0;i<chArr.length;i++) {
			for(int j=0;j<chArr[i].length;j++) {
				System.out.print(chArr[i][j]+" ");
			}
			System.out.println("");
		}// ���		
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};

		System.out.println("==1�д�==");
		
		String[][] strArr1 = {{"���ǰ�"," ","������"},{"�����"," ","�����"},{"���̹�"," ","�ں���"}};
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				System.out.printf("%2s",strArr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==2�д�==");
		
		String[][] strArr2 = {{"�ۼ���"," ","������"},{"������"," ","��õ��"},{"��ǳǥ"," ","ȫ����"}};
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				System.out.printf("%2s",strArr2[i][j]);
			}
			System.out.println();
		}		
	}
	public void practice9() {
		
		String[] strArr = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];
		int cnt = 0;
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				strArr1[i][j]=strArr[cnt];
				cnt++;
			}
		}// �迭 ���� �� �Ҵ�
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				strArr2[i][j]=strArr[cnt];
				cnt++;
			}
		}// �迭 ���� �� �Ҵ�
		
		System.out.println("==1�д�==");
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				System.out.print(strArr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==2�д�==");
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				System.out.print(strArr2[i][j]+" ");
			}
			System.out.println();
		}// �迭 ���
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		String part ="";
		String row = "";
		String dir = "";
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				if(name.equals(strArr1[i][j])) {
					part = "1�д�";
					if(i==0) {
						row = "ù ��°";
					} else if(i==1) {
						row = "�� ��°";
					} else {
						row = "�� ��°";
					}
					if(j==0) {
						dir = "����";
					} else {
						dir = "������";
					}
				}
			}
		}
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				if(name.equals(strArr2[i][j])) {
					part = "2�д�";
					if(i==0) {
						row = "ù ��°";
					} else if(i==1) {
						row = "�� ��°";
					} else{
						row = "�� ��°";
					}
					if(j==0) {
						dir = "����";
					} else {
						dir = "������";
					}
				}
			}
		}
		
		
		System.out.printf("�˻��Ͻ� %2s �л��� %2s %2s �� %2s�� �ֽ��ϴ�.",name,part,row,dir);
	}
}

