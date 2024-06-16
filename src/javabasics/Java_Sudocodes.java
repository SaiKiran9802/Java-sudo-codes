package javabasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java_Sudocodes {

	public void palendrome() {
	 int i=121;
	 int reverse=0;                           			                                      
	 int reminder=0;
	 while(i>0) {
	 reminder=i%10;
	 reverse=(reverse*10)+reminder;
	  i=i/10;
	 }
	 System.out.println(reverse);

	}
	
	public void fibonacciseries() {
		
	int a=0;
	int b=1;
	int c;
	
for(int i=0; i<=10; i++) {
		
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);	
	}
		
	}
	
	public void prime(int num) {
		
		boolean prime=true;
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				prime=false;
				break;
				
			}
			
			
		}
		System.out.println(prime);
	}
	
	public void reverseofstring() {
		
		String str="hello world";
			char str2;
			String str3="";
		for(int i=str.length()-1; i>=0; i--) {
			str2=str.charAt(i);
		   str3=str3+str2;
		}	
		System.out.println(str3);
	}
	public void reverseofarray() {
		int k=0;
		int a[]= {10, 20, 30, 40, 50}; 
		int b[]=new int[a.length];
       for(int i=a.length-1; i>=0; i--) {
           
          for (int j=k; j<b.length;) {
        	  b[j]=a[i];
        	  System.out.println(b[j]);
        	  break;
          }
          k=k+1;
         
       }
	}
	public void arraylistdup() {
		
		List L= new ArrayList();
		L.add("Hello");
		L.add(23);
		System.out.println(L.get(0));
		Iterator i= L.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		String stra= "hello world";
		String strh=stra.replace("e", "");
		System.out.println(strh);
	}
	
	public void lowertoupper() {
		
		String str="Sai Kiran";
		StringBuffer strb= new StringBuffer(str);
		for(int i=0; i<str.length(); i++) {
			
		
			if(Character.isUpperCase(str.charAt(i))) {
				strb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			
		}
		
	}
	
	
	
	
	
	public static void main(String args[]) {
			
		Java_Sudocodes s= new Java_Sudocodes();
		//s.palendrome();
		//s.fibonacciseries();
		//s.prime(13);
		//s.reverseofstring();
		//s.reverseofarray();
		s.palendrome();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
