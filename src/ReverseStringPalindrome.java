import java.util.Scanner;

public class ReverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a string and check if its palindrome or not
		//if string is reversed then if original and reversed string both are same
		//then it is called as Palindrome
		
		String s;
		
		//take input from user dynamically through console
		Scanner in=new Scanner(System.in);
		System.out.println("please enter a string");
		s=in.nextLine();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is a palindrome string");
		}
		else
		{
			System.out.println("Given string is NOT a palindrome string");
		}
		
	}

}
