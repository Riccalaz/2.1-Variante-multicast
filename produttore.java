package unptantic21;

import java.util.Random;

public class produttore extends Thread{
	buffer b[];
	int n;
	
	public produttore(buffer[] buf,int t) {
		for(int i=0;i<t;i++)
		b=buf;
		n=t;
	}
	
	public void run() {
		Random ran = new Random();
		
		
		while(true) {
			int r=ran.nextInt(2048)-1024;
			
			
			try {
				for(int i=0;i<n;i++) {
					b[i].ins(r);
					b[i].stampa();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(r>0) {
				try {
					Thread.sleep(r/100*50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
