package com.kh.example.chap05_constructor.model.vo.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		// �⺻ ������ user() {} (User.java line 23)�� �ּ�ó���ϸ�
		// The constructor User() is undefined
		// �Ű����� �ִ� �����ڸ� ���� ���¿��� �⺻ �����ڸ� ������ �� ���� ����
		// �⺻ �����ڸ� �� ������־�� �Ѵ�.
		u1.inform();
		
		User u2 = new User("id�Դϴ�", "pwd�Դϴ�");
		// inform();�� �� �ص� consoleâ�� ��°��� ���.
		u2.inform();
		
		User u3 = new User("id�Դϴ�","pwd�Դϴ�","�̸��Դϴ�");
		u3.inform();
	}

}
