package com.NumAlpha;

public class PrintChar implements Runnable {
	private PrintNumOrChar print = new PrintNumOrChar();
	public PrintChar(PrintNumOrChar print) {
		this.print = print;
	}
	@Override
	public void run() {
		print.printChar();
	}

}
