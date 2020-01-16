package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		
		try (FileInputStream fis = new FileInputStream("a_byte.txt")) {
			
			// abcdefgcde
//			while(fis.read()!=-1){
//				System.out.print((char)fis.read()+ " ");
//			}
			
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value+ " ");
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		} 

	}
	
	public void fileSave() {
		
		try (FileOutputStream fos = new FileOutputStream("a_byte.txt");){
			
			// write(int b):void
			fos.write(97);
			
			// write(byte[] b):void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b   c    d   e    f    g
			fos.write(bArr);
			
			// write(byte[], int off, int len):void
			fos.write(bArr, 1, 3);// bArr에 대해 1 index부터 3개 : cde
			
		} catch(FileNotFoundException e) {  
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace(); 
		}
	}
}
