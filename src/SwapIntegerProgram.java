
public class SwapIntegerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapIntegerProgram si=new SwapIntegerProgram();
		si.swapWithVariable();
	}
	
	public void swapWithoutVariable()
	{
		int a=9;
		int b=6;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of variable b is "+b);
		System.out.println("The value of variable a is "+a);

	}
	
	public void swapWithVariable()
	{
		int a=4;
		int b=5;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of variable b is "+b);
		System.out.println("The value of variable a is "+a);
	}

}
