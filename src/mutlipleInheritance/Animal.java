package mutlipleInheritance;

public class Animal implements Dog,Cat 
{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("its walking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("its eating ");
	}



	}


