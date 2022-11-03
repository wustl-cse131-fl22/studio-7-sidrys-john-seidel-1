package studio7;

import java.util.Scanner;

public class rectangle {

private int length;
private int width;

private int newlength; 
private int newwidth; 

public rectangle (int length, int width, int newlength, int newwidth) {
	this.length = length;
	this.width = width;
	this.newlength = newlength; 
	this.newwidth = newwidth; 
}

	public int recArea(int length, int width) {
		return length*width;
	}
	public int recPer(int length, int width) {
		int perimeter = 2*width + 2*length;
		return perimeter;
	}
	
	public String isSquare(int length, int width) {
		if (length == width) {
			return "Rectangle is a square";
		} else {
			return "rectangle is not a square";
		}
	}
	public int recArea2(int newlength, int newwidth) {
		return newlength*newwidth;
	}
	public int recPer2(int newlength, int newwidth) {
		int newperimeter = 2*newwidth + 2*newlength;
		return newperimeter;
	}
	
	public String compare(int length, int width, int newlength, int newwidth) 
	{
		if (recArea(length, width)>recArea2(newlength, newwidth)) {
			return "Rectangle 1 is bigger" ; 
		} else if (recArea(length, width)==recArea2(newlength, newwidth)) {
			return "they are equal in area";
		}else {
			return "rectangle 2 is bigger";
		}
	}

}



//public static void main(String[] args) {

//	 
//}