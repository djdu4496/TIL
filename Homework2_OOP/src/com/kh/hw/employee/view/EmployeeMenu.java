package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		int menuNum=0;
		while(menuNum!=9) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 번호를 누르세요 : ");
			menuNum = sc.nextInt();

			if(menuNum==1) {
				insertEmp();
			} else if(menuNum==2) {
				updateEmp();
			} else if(menuNum==3){
				deleteEmp();
			} else if(menuNum==4) {
				printEmp();
			} else {
				System.out.println("정보를 잘못 입력하셨습니다.");
			}
		}
	}

	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();

		System.out.print("사원 이름 : ");
		String name = sc.nextLine();

		sc.nextLine();

		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();

		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char addInfo = sc.nextLine().charAt(0);

		if(addInfo=='y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();

			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();

			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();

			ec.add(empNo, name, gender, phone, dept, salary, bonus);		
		} else if(addInfo=='n') {
			ec.add(empNo, name, gender, phone);

		}
	}

	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");

		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();

		if(menuNum==1) {
			System.out.print("수정할 전화 번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
		} else if(menuNum==2) {
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			ec.modify(salary);
		} else if(menuNum==3) {
			System.out.print("수정할 보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
		} else if(menuNum==9) {
			System.out.println("메인메뉴로 돌아갑니다.");

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ask = sc.nextLine().charAt(0);

		if(ask=='y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		} else if(ask=='n') {
			System.out.println("데이터 삭제에 실패하였습니다.");
		}
	}

	public void printEmp() {
		if(ec.inform()==null) {
			System.out.println("사원 데이터가 없습니다.");
		} else if(ec.inform()!=null) {
			System.out.println(ec.inform());
		}
	}
}