package testingg;

import java.util.Scanner;



class details implements Create {
	
	 
	public void add() {
		
Scanner sc=new Scanner(System.in);
details lib = new details();

System.out.println("Insert ur id : ");
int id=sc.nextInt();

System.out.println("enter ur name  Name : ");
String employeeName=sc.next();

System.out.println("your salary is : ");
float salary=sc.nextFloat();

System.out.println("your  extrapay is : ");
float extraPay=sc.nextFloat();


System.out.println();

System.out.println("Add sucessfully");
		
	}
	 
	 
	public void dis() {
		
		
		
			System.out.println(id);

		

		
	}
	
	
	public void del() {
		
	}
 

public static void main(String args[]) {
	
	Create obj=new details();
	obj.add();
	
	Create obj1=new details();
	obj1.dis();
}

}


