package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	//						--------------------------- ==> Marker Interface : �ȿ� �ƹ��͵� ���� �̸��� �ִ°� (��Ŀ �������̽��� ������ Ŭ������ Ư���� �˷��ֱ� ���� �������� ���)
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
}
