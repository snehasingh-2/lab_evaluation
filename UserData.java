package day1;
//wap to ask three numbers from user and print their sum 
//java.util = package name 
//Scanner = Class name 
import java.util.Scanner;

public class UserData {

	public static void main(String[] args) {

		int x,y,z;
		//in line 14 we are creating object of scanner class
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter three numbers ");
		x=s.nextInt(); //nextInt is predefined method in scanner class
		y=s.nextInt();
		z=s.nextInt();
		
		
		int sum= x+y+z;
		System.out.println("sum="+ sum );
	}

}
