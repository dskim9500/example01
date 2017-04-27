package org.opentutorials.javatutorials.Method;

import java.io.File;
import java.io.IOException;

public class SubFileTest {

	public static void getFileList(String path) {
		File dir = new File(path);

		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length; i++) {

			File file = fileList[i];

			if (file.isFile()) {
				// if(file.getName().contains("ini")) {

				// ������ �ִٸ� ���� �̸� ����
				System.out.println("\t filename = " + file.getName());

			}
		}

	}

	public static void main(String[] args) {
		String path = args[0];
		System.out.println("### " + path + " result");
		// TODO Auto-generated method stub
		getFileList(path);

//		path = "c:\\db";
//		System.out.println("### " + path + " result");
//		getFileList(path);
	}

}
