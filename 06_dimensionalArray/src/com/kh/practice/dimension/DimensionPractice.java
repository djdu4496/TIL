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
		}// 저장

		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr.length;j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}// 출력 p.s 우측 정렬	
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

		}//저장

		//더하는 값 입력
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
		}//저장
	}
	public void practice5() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 크기 : ");
			int rSize = sc.nextInt();
			System.out.print("열 크기 : ");
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
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}		
		}//반복문
	}
	public void practice6() { 
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원","열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				
				System.out.print(strArr[j][i]+" ");
				
			}
		}
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char value = 'a';
		
		char[][] chArr = new char[row][]; // 가변 배열 할당
		
		
		
		for(int i=0;i<chArr.length;i++) {
			System.out.print(i+"행의 열 크기 : ");
			int col = sc.nextInt();
			chArr[i]= new char[col];
		}// 가변 배열 할당 + 값 기록(2. 이중 for문 이용)
		

		
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
		}// 출력		
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};

		System.out.println("==1분단==");
		
		String[][] strArr1 = {{"강건강"," ","남나나"},{"도대담"," ","류라라"},{"문미미"," ","박보배"}};
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				System.out.printf("%2s",strArr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		
		String[][] strArr2 = {{"송성실"," ","윤예의"},{"진재주"," ","차천축"},{"피풍표"," ","홍하하"}};
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				System.out.printf("%2s",strArr2[i][j]);
			}
			System.out.println();
		}		
	}
	public void practice9() {
		
		String[] strArr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];
		int cnt = 0;
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				strArr1[i][j]=strArr[cnt];
				cnt++;
			}
		}// 배열 선언 및 할당
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				strArr2[i][j]=strArr[cnt];
				cnt++;
			}
		}// 배열 선언 및 할당
		
		System.out.println("==1분단==");
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				System.out.print(strArr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				System.out.print(strArr2[i][j]+" ");
			}
			System.out.println();
		}// 배열 출력
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String part ="";
		String row = "";
		String dir = "";
		
		for(int i=0;i<strArr1.length;i++) {
			for(int j=0;j<strArr1[i].length;j++) {
				if(name.equals(strArr1[i][j])) {
					part = "1분단";
					if(i==0) {
						row = "첫 번째";
					} else if(i==1) {
						row = "두 번째";
					} else {
						row = "세 번째";
					}
					if(j==0) {
						dir = "왼쪽";
					} else {
						dir = "오른쪽";
					}
				}
			}
		}
		
		for(int i=0;i<strArr2.length;i++) {
			for(int j=0;j<strArr2[i].length;j++) {
				if(name.equals(strArr2[i][j])) {
					part = "2분단";
					if(i==0) {
						row = "첫 번째";
					} else if(i==1) {
						row = "두 번째";
					} else{
						row = "세 번째";
					}
					if(j==0) {
						dir = "왼쪽";
					} else {
						dir = "오른쪽";
					}
				}
			}
		}
		
		
		System.out.printf("검색하신 %2s 학생은 %2s %2s 줄 %2s에 있습니다.",name,part,row,dir);
	}
}

