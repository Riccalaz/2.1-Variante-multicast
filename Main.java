package unptantic21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		
		
		int T = myObj.nextInt();
		buffer[] bu=new buffer[T];
		for(int i=0;i<T;i++){
			bu[i]= new buffer();
		}
		produttore p=new produttore(bu,T);
		consumatore[] th=new consumatore[T];
		p.start();
		
		for(int i=0;i<T;i++){
			th[i]= new consumatore(bu[i]);
			th[i].start(); //avvio i thread
		}
		
		
		
	}

}
