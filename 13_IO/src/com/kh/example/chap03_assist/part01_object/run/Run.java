package com.kh.example.chap03_assist.part01_object.run;

import com.kh.example.chap03_assist.part01_object.model.dao.ObjectDAO;

public class Run {

	public static void main(String[] args) {
		ObjectDAO od = new ObjectDAO();
		od.fileSave();
		od.fileOpen();
	}
}
