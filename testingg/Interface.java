package testingg;

import java.util.Scanner;

public interface Interface {

	public int id=100;
	public String employeeName="kathir";
    public float salary=10000;
    public float extraPay=5000;
	
}

interface Create extends Interface {
	
	Scanner sc=new Scanner(System.in);
	
	int choose = sc.nextInt();
	
	
	
	
	
	         public void add();
	           
	
	
		     public void dis();
	        	
	
		     public void del();
		      
		
	
		
		
	
}
