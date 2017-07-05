package com.NumAlpha;

public class MainPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintNumOrChar print = new PrintNumOrChar();
		for(int i = 1; i < 27; i++) {  
	           new Thread(new PrintChar(print)).start();  
	           new Thread(new PrintNum(print)).start();  
	       }  
	}
}
