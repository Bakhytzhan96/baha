import java.io.*;
import java.util.Scanner;

import javax.swing.JFrame;

import java.util.Random;

class anglo_russki extends JFrame{
	
	
	private String anglo_r="";
    private String[][] anglo_russki=new String[57][2];
	int mad=0;
	Scanner sc=new Scanner(System.in);
	Random r=new Random();	
	public void anglo_r(){
		FileInputStream FINPUT;		
		try {			
			FINPUT = new FileInputStream("C:\\Users\\HP\\Desktop\\12.txt");
			BufferedReader buf= new BufferedReader(new InputStreamReader(FINPUT));		
			while(true) {
				try{				
					anglo_r=buf.readLine();
					anglo_russki[mad]=anglo_r.split(":");
					System.out.println(anglo_russki[mad][0]+" "+anglo_russki[mad][1]);
					mad++;				
				}catch (Exception e) {
					break;
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
	public void translate() {
		while(true) {			
			System.out.println("Vvedite slovo: ");
			String anglo=sc.nextLine();
				int t =0;
				for(int i=0;i<anglo_russki.length;i++) {
					if(anglo.equalsIgnoreCase(anglo_russki[i][0])) {
						System.out.println("Rus: "+anglo_russki[i][1]);
						t=1;break;
					}}
					if(t==0)
						System.out.println("net");
				
		}	
	}	
	public void test() {
		while(true) {
			int ch=r.nextInt(mad);
			for(int i=0;i<anglo_russki.length; i++) {
				for(int j=0; j<1; j++) {
					System.out.println("Слово: "+anglo_russki[ch][0]);
				}
		    	for(int s=1;s<2;s++) {		 	 		
		    		System.out.println("Перевод данного слово:");
		 	 		String d = sc.nextLine();		 	 		
		 	 		if(d.equalsIgnoreCase(anglo_russki[ch][1])) { 
		 	 			System.out.println("Правильно");
		 	 		}else {
		 	 			System.out.println("Не правильно");		 	 			
		 			}
		 	 	 }
				break;
			}			
		}
	}	
}
public class Slovar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		anglo_russki eng=new anglo_russki();
		eng.anglo_r();
		System.out.println("Перевод: 1, Test: 2 ");
		int a=sc.nextInt();
		if(a==1) {
			eng.translate();
		}else if(a==2) {
			eng.test();
		}
	}
}
