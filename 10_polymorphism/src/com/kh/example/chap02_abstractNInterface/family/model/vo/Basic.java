package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	//						--------------------------- ==> Marker Interface : 안에 아무것도 없이 이름만 있는것 (마커 인터페이스를 구현한 클래스의 특성을 알려주기 위한 목적으로 사용)
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
}
