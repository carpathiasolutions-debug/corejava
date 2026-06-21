package Methodoverloading;

public class Printer {

	void printvale(int num) {
		System.out.println(num);
	}
	
	void  printvale(double num) {
		System.out.println(num);
		
	}
	
	void printvalue(String text) {
		System.out.println(text);
	}
	
	void printvalue (boolean flag) 
	{
		System.out.println(flag);
	}
}
