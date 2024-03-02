import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StringPracticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPracticePrograms.insertStringInAnotherString();
	}		
		
	public static void getSpecificIndexCharachter()
	{
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter string");
		str=in.nextLine();
		int index=3;
		
		//METHOD 1
		//GET USING CHARAT METHOD OF STRING
		//System.out.println(str.charAt(index));
		
		//METHOD 2
		//GET USING CHARARRAY FUCNTIONALITY
		char[] ch=str.toCharArray();
		System.out.println(ch[index]);
	}
	
	public static void replaceCharAtSpecificIndexOfString()
	{
		Scanner in=new Scanner(System.in);		
		System.out.println("Please enter string");
		String str=in.nextLine();
		
		int index=6;
		
		//METHOD 1
		//USING STRING CLASS
		/*String str1,str2;
		str1=str.substring(0, index);
		System.out.println(str1);
		str2=str.substring(index+1, str.length());
		str=str1+'F'+str2;
		System.out.println("The replaced string is "+str)*/;
		
		
		//METHOD 2
		//USING STRING BUILDER CLASS
		/*StringBuilder a=new StringBuilder(str);
		a.setCharAt(6, 'M');
		System.out.println(a);*/
		
		//METHOD 3
		//USING STRING BUFFER CLASS
		StringBuffer b=new StringBuffer(str);
		b.setCharAt(index, 'W');
		System.out.println(b);
		
	}
	
	public static void reverseString()
	{
		String str,rev = "";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		str=in.nextLine();
		
		//METHOD 1
		//USING CHAR ARRAY
		/*char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("The reversed string is "+rev);*/
		
		//METHOD 2
		//USING STRING BUILDER CLASS
		/*StringBuilder sb=new StringBuilder(str);
		StringBuilder rev1=sb.reverse();
		System.out.println("The reversed string is "+rev1);*/
		
		//METHOD 2
		//USING STRING BUFFER CLASS
		StringBuffer sf=new StringBuffer(str);
		StringBuffer rev2=sf.reverse();
		System.out.println("The reversed string is "+rev2);
	}
	
	public static void sortingString()
	{
		String str;
		char temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		str=in.nextLine();
		
		//METHOD1
		//WITHOUT USING SORT FUNCTION OF ARRAYS
		/*char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		String sorted=new String(ch);		
		System.out.println(sorted);*/
		
		//METHOD 2
		//USING ARRAYS SORT FUNCTION
		char c[]=str.toCharArray();
		Arrays.sort(c);
		String sort=new String(c);
		System.out.println(sort);			
	}
	
	public static void swapPairOfCharactersInString()
	{
		String str;
		char temp;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		
		//METHOD 1
		//USING CHARACTER ARRAY
		/*char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i+=2)
		{
			temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		
		String swapped=new String(ch);
		System.out.println(swapped);*/
		
		//METHOD 2
		//USING STRING BUFFER APPEND METHOD
		int len=str.length();
		StringBuffer sb=new StringBuffer(len);
		for(int i=0;i<len-1;i+=2)
		{
			sb.append(str.charAt(i+1));
			sb.append(str.charAt(i));
		}
		
		//if String has odd no length then append last letter as below
		if(len%2!=0)
		{
			sb.append(str.charAt(len-1));
		}
		
		System.out.println(sb.toString());
	}
	
	public static void checkIfStringIsPangram()
	{
		//STRING IS PANGRAM IF IT CONTAINS ALL ALPHABETS FROM A TO Z
		String str;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		str=str.toLowerCase();
		boolean allLettersPresent=true;
		
		for(char c='a';c<='z';c++)
		{
			if(!str.contains(String.valueOf(c)))
			{
				allLettersPresent=false;
				break;
			}
		}
		
		if(allLettersPresent==true)
		{
			System.out.println("the given string is PANGRAM as all alphabets are present");
		}
		else
		{
			System.out.println("the given string is NOT PANGRAM as all alphabets are NOT present");
		}
	}
	
	public static void printFirstLetterofEachWord()
	{
		String str;
		Scanner in = new Scanner(System.in);
		str=in.nextLine();
		
		String[] a=str.split(" ");
		for(String s : a)
		{
			System.out.print(s.charAt(0));
		}		
	}
	
	public static void removeLeadingZerosFromString()
	{
		String str;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		
		//METHOD 1
		//USING STRING BUFFER
		/*int i=0;
		while(i<str.length() && str.charAt(i)=='0')
		{
			i++;
		}
		
		StringBuffer sb=new StringBuffer(str);
		sb.replace(0, i, "");
		System.out.println(sb.toString());*/
		
		//METHOD 2
		int end=0;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)!='0')
			{
				end=j;
				break;
			}
		}
		
		String replaced=str.substring(end);
		System.out.println(replaced);
	}
	
	public static void compareStrings()
	{
		String s1 = new String("Geeksforgeeks"); 
        String s2 = new String("Practice"); 
        String s3 = new String("Geeks"); 
        String s4 = new String("Geeks"); 
        String s5 = new String("geeks");
        
        //USING STRING.EQAULS METHOD
        /*System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));*/
        
        //USING EqualsIgnore METHOD
        /*System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s4.equalsIgnoreCase(s5));*/
        
        //USING object.equals(s1,s2)
        /*System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(s3, s4));
        System.out.println(Objects.equals(s4, s5));*/
        
        //USING COMPARETO() METHOD
        //IF RESULT IS 0 THEN STRING ARE EQUAL
        if(s1.compareTo(s2)==0)
        {
        	System.out.println("S1 and S2 are equal");        
        }
        if(s3.compareTo(s4)==0)
        {
        	System.out.println("S3 and S4 are equal");
        }
        if(s4.compareTo(s5)==0)
        {
        	System.out.println("S4 and S5 are equal");
        }        
	}
	
	public static void printEvenLengthWordsInString()
	{
		String str;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		
		String[] s=str.split(" ");
		for(String a:s)
		{
			if(a.length()%2==0)
			{
				System.out.println(a);
			}
		}
	}
	
	public static void insertStringInAnotherString()
	{
		String str,insert="For";
		int index=4;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		
		//METHOD 1
		//USING SUBSTRING FUNCTION
		/*String before,after;
		before=str.substring(0, index+1);
		after=str.substring(index+1);
		
		System.out.println(before+insert+after);*/
		
		//METHOD 2
		//USING STRING BUFFER
		StringBuffer sb=new StringBuffer(str);
		sb.insert(index+1, insert);
		System.out.println(sb.toString());
	}
}
