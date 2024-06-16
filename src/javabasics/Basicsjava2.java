package javabasics;

import org.testng.annotations.Test;

public class Basicsjava2  {

	
	


   static Basicsjava1 j;


	public  Basicsjava2(Basicsjava1 j) {
		
	this.j=j;
		
	}
	

	public static void hello() {
		j.h1="King";
		System.out.println(j.h1);
	}
	
	public static void main(String[] args) {
		
		Basicsjava2.hello();

	}
	
	
}
