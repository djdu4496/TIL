package com.kh.example.chap03_assist.part01_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part01_object.model.vo.Member;

public class ObjectDAO {
	
	public void fileSave() {
		// Member ��ü�迭 3��¥�� �����
		// user01 pass01 ȫ�浿 hong777@kh.org 25 '��' 1250.7
		// user02 pass02 ������ you31@kh.org 17 '��' 1221.6
		// user03 pass03 �̼��� lee88@kh.org 22 '��' 1234.6
		
		Member[] mArr = new Member[5];
			
		mArr[0] = new Member("user01", "pass01", "ȫ�浿", "hong777@kh.org", 25, '��', 1250.7);
		mArr[1] = new Member("user02", "pass02", "������", "you31@kh.org", 17, '��', 1250.7);
		mArr[2] = new Member("user03", "pass03", "�̼���", "lee88@kh.org", 22, '��', 1250.7);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));) {
			
			for(int i=0;i<mArr.length;i++) {
				oos.writeObject(mArr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void fileOpen() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));) {
			
			Member[] mArr = new Member[3];
			
			for(int i=0;i<mArr.length;i++) {
				mArr[i] = (Member)ois.readObject();
			}
			
			for(Member m : mArr) {
				System.out.println(m);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
