package studio7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input rectangle length: ");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt(); 
		System.out.println("input rectangle width: ");
		int width = in.nextInt();
		System.out.println("input new rectangle length: ");
		int newlength = in.nextInt(); 
		System.out.println("input new rectangle width: ");
		int newwidth = in.nextInt();
		
		rectangle test = new rectangle (length,width, newlength, newwidth);
		
		 test.recArea(length, width);  
		 test.recPer(length, width);
		 test.isSquare(length, width);
		 test.compare(length, width, newlength, newwidth);
		 test.recArea2(newlength, newwidth);  
		 test.recPer2(newlength, newwidth);
		 
		 System.out.println( "rectangle 1 : " + 
				 			test.recArea(length, width) + " " + 
				 			test.recPer(length, width) + "Is sqaure?" + 
				 			test.isSquare(length,width));
		 System.out.println("compare to rec 2 " +  test.recArea2(newlength, newwidth) 
				 			+ " is bigger? " + test.compare(length, width, newlength, newwidth));

		 
		 
		 //Run DIe
		 
		 System.out.println("enter the number of sides: ");
		 int n = in.nextInt();
		 
		 Die dTest = new Die(n);
		 
		 System.out.print("You rolled a " + dTest.Num(n));
		 
		
	}

}
