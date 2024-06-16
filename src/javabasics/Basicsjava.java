package javabasics;

public class Basicsjava implements BasicInterface{
	  String h="suzuki";
	int f1=1;
	public String car() {
		
		h="change";
		System.out.println(f1);
		
		return "hello";
		
	}
	
	
	public static void typecasting() {
		
	int a=100;
	String str= Integer.toString(a);

	
		System.out.println(str);
		
		
	}
	
	public Basicsjava() {

		System.out.println("this is inherites constructor");
	}
	

	public static void main(String[] args) {
		//System.out.println("hello");
		//Basicsjava b=new Basicsjava();
	//b.car();
      //  typecasting();
        
       BasicInterface a = new Basicsjava(); 
      a.basicmethos();
      BasicInterface.hello();
   
      
      
	}


	@Override
	public void basicmethos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nonbasicmethod() {
		// TODO Auto-generated method stub
		
	}



}
