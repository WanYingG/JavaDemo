package com.NumAlpha;

public class PrintNum implements Runnable {
	private PrintNumOrChar print = new PrintNumOrChar();
	public PrintNum(PrintNumOrChar print) {
		this.print = print;
	}
	@Override
	public void run() {
		print.printNum();
	}
	
}
