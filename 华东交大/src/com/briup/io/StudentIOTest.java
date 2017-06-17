package com.briup.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentIOTest {
	public static void main(String[] args) {
		try {
			List<StudentTest> list = new ArrayList<>();
			FileInputStream fis = new FileInputStream("src/com/briup/io/test1.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,"utf-8"));
			FileOutputStream fos = new FileOutputStream("src/com/briup/io/test1.txt", true);
			ObjectOutputStream obs = new ObjectOutputStream(fos);
			String line = null;
			String[] strs = null;
			StudentTest student = null;
			while ((line = br.readLine()) != null) {
				strs = line.split(":");
				student = new StudentTest(strs[0], Integer.parseInt(strs[1]), strs[2]);
				list.add(student);
			}
			for (int i = 0; i < list.size(); i++) {
				obs.writeObject(list.get(i));
			}
			obs.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
