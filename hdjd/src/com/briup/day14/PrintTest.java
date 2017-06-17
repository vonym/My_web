package com.briup.day14;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintTest {

	public static void main(String[] args) {
		// PrintStream ps=System.out;
		// ps.println("");
		PrintStream ps = null;
		try {
			ps = new PrintStream("");
			ps.println("");
			ps.println(100);
			ps.printf("%1$d+%2$d=%3$d \n", 1, 1, 2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
}
