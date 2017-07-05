package com.NumAlpha;

public class PrintNumOrChar {
	public boolean flag = true;
	static char ch = 'a';
	static int num = 1;
	public synchronized void printNum(){
		while(flag == false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = false;
		notify();
		System.out.println(num++);
	}
	
	public synchronized void printChar(){
		while(flag == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = true;
		notify();
		System.out.println(ch++);
	}
}
