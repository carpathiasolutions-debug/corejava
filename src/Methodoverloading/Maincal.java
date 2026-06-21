package Methodoverloading;

public class Maincal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c=new Calculator();
System.out.println(c.add(10.5, 1.00));
System.out.println(c.add("aakash", "patil"));
System.out.println(c.add(5, 0));
System.out.println(c.add(5, 0, 0) );

	}

}
