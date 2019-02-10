package com.biz.exam.service;

import java.io.*;
import java.util.*;

public class MoneyService {
	int int50K;
	
	Map<String,Integer> mList;
	String[] paperName;
	public void writerPaper(String file) {
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			for(String name : mList.keySet()) {
				pw.println(name + " : "
						+ mList.get(name));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public MoneyService() {
		mList = new HashMap();
		int50K = 50000;
		paperName = new String[]{
			"5만원권",
			"1만원권",
			"5천원권",
			"1천원권",
			"500원권",
			"100원권",
			"50원권",
			"10원권"
		};
		
	}
	public void viewPaper2() {
		
		for(String name : mList.keySet()) {
			System.out.println(name + " : "
					+ mList.get(name));
		}
		
	}
	public void viewPaper() {
		
		// Map에서 key부분만 분리해내기
		Iterator<String> keys 
			= mList.keySet().iterator();
		while(keys.hasNext()) {
			String name = keys.next();
			System.out.println(name + " : "
						+ mList.get(name));
		}
		
		
		
	}
	
	public void makePaperInt(int nMoney) {
		int iSw = 1;
		boolean sw = true;
		while (true) {

			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			if (iSw == 1) {
				int50K = (int50K / 5);
				// iSw = 0;
			} else {
				int50K = (int50K / 2);
				// iSw = 1;
			}
			iSw *= -1;

		}

	}

	public void makePaperBoolean(int nMoney) {
		
		boolean sw = true;
		
		for(String name : paperName) {

			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			
			mList.put(name, nCount);
			
			
//			if(nMoney < 10) break;
			
			if (sw) {
				int50K = (int50K / 5);
			} else {
				int50K = (int50K / 2);
			}
			sw = !sw;

		}

	}

	public void makePaper(int nMoney) {
		int[] intCM = new int[8];

		// 3949203
		// nMoney를 5만원권으로 나누면, 5만원권의 매수가
		// 구해지는데

		// 5만원
		intCM[0] = (nMoney / int50K); //
		nMoney = nMoney - (intCM[0] * int50K);

		// 1만원권
		int50K = int50K / 5;
		intCM[1] = (nMoney / int50K);
		nMoney = nMoney - (intCM[1] * int50K);

		// 5천원권
		int50K = int50K / 2;
		intCM[2] = (nMoney / int50K);
		nMoney = nMoney - (intCM[2] * int50K);

		// 1천원권
		int50K = int50K / 5;
		intCM[3] = (nMoney / int50K);
		nMoney = nMoney - (intCM[3] * int50K);

		// 500원
		int50K = int50K / 2;
		intCM[4] = (nMoney / int50K);
		nMoney = nMoney - (intCM[4] * int50K);

		// 100원
		int50K = int50K / 5;
		intCM[5] = (nMoney / int50K);
		nMoney = nMoney - (intCM[5] * int50K);

		// 50원
		int50K = int50K / 2;
		intCM[6] = (nMoney / int50K);
		nMoney = nMoney - (intCM[6] * int50K);

		// 10원
		int50K = int50K / 5;
		intCM[7] = (nMoney / int50K);
		nMoney = nMoney - (intCM[7] * int50K);

		for (int i : intCM) {
			System.out.println(i);
		}

	}
}
