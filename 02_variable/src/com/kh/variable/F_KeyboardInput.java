package com.kh.variable;
import java.util.*;  // Scanner import �ۼ�(�����̵� ����)
public class F_KeyboardInput {

	public void	inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: "); // �ȳ� ���� ����
		String name = sc.nextLine();  // ����ڰ� �̸��� �� ������ ��ٸ���.
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();  // ���̸� sc���� 20�� �޾ƿ� ���̴�. ����ڰ� �̸��� �� ������ ��ٸ���.
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");  // �ȳ����� : �Ҽ��� ù° �ڸ����� �Է�. Ű : �Ǽ��� �޾ƿ� ���̴�.
		double height = sc.nextDouble(); // Ű�� �޾ƿ´�. ����ڰ� �̸��� �� ������ ��ٸ���.
		
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm �Դϴ�.");
		
	}
	
	public void inputScanner2() {
		// ����ڿ��� �̸��� ���̸� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���: ");
//		int age = sc.nextInt();	
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();   //nextLine �Ȱ��� �����ش�. �׷����� �̸��� �ּҰ� ���� �� ��ٸ��� �ٷ� ���͹����� ������ �߻��ߴ�.
		
		// �ذ��ϴ� ���
		// ���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//		int age = sc.nextInt();
//		sc.nextLine();  // ���� ���� ���� ������ �ϴ°� �ƴ϶� ���ۿ� �����ִ� �ٹٲ޸� ���ִ� ������ �ϴ� ���̴�. ����, ���ۿ� �ٹٲ��� ���� �ʴ´�.
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();
		
		// ���2. age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ�(parsing)
//		int age = sc.nextLine(); 
		// �Ľ� : ���ڿ��� �⺻ �ڷ������� �ٲ��ִ� �� 	
		// "1" (o), "�ڽſ�" (x) ���ڷ� �����Ǵ� ���ڿ��� �⺻ �ڷ������� �ٲ� �� �ִ�.
		// "true"(o), "�ڽſ�"(x) true�� �����Ǵ� ���ڿ��� �⺻ �ڷ������� �ٲ� �� �ִ�.
//		String userAge = sc.NextLine();
//		int age = Integer.parseInt(userAge); // Int�� �ٲٰ� ������, integer.parseInt��! (�˾Ƶα�)
     	int age = Integer.parseInt(sc.nextLine());  // �̰� �� �� ���� �ϳ��� ��ģ ���̴�. ������ �� �� ġȯ�ϴ���, �ٷ� ����ִ��� ���̴�.(�߿�)
		System.out.print("�ּҸ� �Է��ϼ���: ");
		String address = sc.nextLine();
		
		// ���3. next()�� �ּҸ� �ޱ� (�Ѱ谡 �ִ� ���) 
		// �Ѱ� : 
//		int age = sc.nextInt();
		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address 	= sc.next();
//		next(); �޼ҵ�� ���⸦ '������'�� �ν��Ѵ�. ���� ��⵵ �� �� �ǿս� �� �� ������ �� �� �̷��� �� ������ �ν��Ѵ�.
//		���� �ּҿ� ���Ⱑ ���� ��� ó���� ������ �о�´�.
		
		// + �߰� : char���� �ް� ���� ����?
		System.out.print("������ �Է��ϼ��� : "); // F / M
//		String userGender = sc.nextLine(); // �ϴ� ���ڿ��� �޾ƿ´�.
//		char gender = userGender.charAt(0); // char gender��� ���� �����ϰ� �ʹ�.
		char gender = sc.nextLine().charAt(0); // �� �� ���� �� �ٷ� ����� �� ���̴�.
//		.charAt(0);�� �߿��ϴ�. charAt�̶� ���ڿ����� index��°�� ���ڸ� �������ִ� '�޼ҵ�'.
		
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�Դϴ�.");
		System.out.println("gender : " + gender);
	}
}

