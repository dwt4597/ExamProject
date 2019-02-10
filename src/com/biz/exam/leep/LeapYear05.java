package com.biz.exam.leep;

import java.io.*;
import java.util.*;

import com.biz.exam.method.*;
/*
 * 임진왜란은 1592년에 발생했다.
 * 1592년 부터 2018년까지 윤년인 해를 찾아서
 * 윤년들.txt 파일로 저장
 * 
 * 1992년
 */
public class LeapYear05 {

	public static void main(String[] args) {

		String gradeFile = "src/com/biz/exam/윤년들.txt";
		FileWriter fw;
		PrintWriter pw;
		try {
			fw = new FileWriter(gradeFile);
			pw = new PrintWriter(fw);
			String s = "평년";

			for (int years = 1592; years <= 2018; years++) {
				if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
					pw.printf("%d년 \n",years);
					
				} 

			}
			pw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}