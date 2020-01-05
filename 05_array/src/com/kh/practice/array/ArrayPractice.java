package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
//			자료형[] 배열명 = new 자료형[배열크기]
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
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("양의 정수를 입력해주세요.");
		} else {
			int[] arr = new int[num];
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = i + 1;
				System.out.print(arr[i]+ " ");	
			}

		}
	}
	public void practice4() {
		
		String str[] = {"사과","귤","포도","복숭아","참외"};
				
		System.out.println(str[1]);
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int cnt=0;								// cnt 공부 별도
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int arr[] = new int[str.length()];		// String이 아니라 int다.
//		application
		for(int i=0;i<arr.length;i++) {
			arr[i]= str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
	
		System.out.print(str+"에"+" "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
				cnt++;
				
			}
		}
		System.out.println();
		System.out.println("i 개수 : "+cnt);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num<7&&num>=0) {
			System.out.println(arr[num]+"요일");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum=0;
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
			System.out.println("총합 : "+ sum);		
	}
	public void practice8() {					// 콤마(,) 구현 X
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int odd =sc.nextInt();
		
		if(odd<3||odd%2==0) {
			System.out.println("다시 입력하세요");
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
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		String str[] = {"양념", "불닭", "레드콤보", "허니콤보"};
		
		switch(chicken) {
		case "양념":
		case "붉닭":
		case "레드콤보":
		case "허니콤보":
			System.out.printf("%s치킨 배달 가능",chicken);
			break;
		default:
			System.out.printf("%s치킨은 없는 메뉴입니다",chicken);
		}
		
	}
	public void practice9_1() {
		// if문으로 할 수는 없을까
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		String str[] = {"양념", "불닭", "레드콤보", "허니콤보"};
		int i=0;
			if(chicken==str[i]) {
				System.out.printf("%s치킨 배달 가능",chicken);
			} else {
				System.out.printf("%s치킨은 없는 메뉴입니다",chicken);
			}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
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
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
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
		Arrays.sort(arr);		// 오름차순 메소드
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice15() {					
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char arr1[] = new char[str.length()];
		char arr2[] = new char[str.length()];
		
		int flag=1;
		int cnt=0;
		
		System.out.print("문자열에 있는 문자 : ");
		
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
		System.out.println("문자 개수 : " +cnt);	
	}
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] str = new String[size];
		
		for(int i=0;i<size;i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			String str1 = sc.nextLine();
			str[i]= str1;
		}

		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			char ch = sc.nextLine().charAt(0);

			if(ch=='y'||ch=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int sizeNum = sc.nextInt();
				sc.nextLine();

				String copy[]= new String[str.length+sizeNum];

				for(int i=0;i<copy.length;i++) {
					if(i<str.length) {
						copy[i] = str[i];
					} else {
						System.out.print((i+1)+"번째 문자열 : ");
						String str1 = sc.nextLine();
						copy[i] = str1;
					}
				}
				str = copy;
			}	else if(ch=='n'||ch=='N') {
				break;
			}	else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}// while문종료
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}
}
