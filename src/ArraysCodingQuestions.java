import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ArraysCodingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraysCodingQuestions ac=new ArraysCodingQuestions();
		ac.arrayRotationBySpecificNo();
		
	}
	
	public void sortArrayInAscending()
	{
		int a[]= {6,2,5,9,1,4};
		int temp;
		//sorted should be 1,2,4,5,6,9
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void minimuNoFromArray() 
	{
		/*245
		347
		129*/
		
		int a[][]= {{2,4,5},{3,4,0},{1,2,9}};
		
		int min=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		
		System.out.println("The smallest number is "+min);
		
	}
	
	public void maxNoFromColumnOfMinNo()
	{
		//find min no from an multidimensional array and get the column no of min no
		//then find max no from that column
		/*245
		347
		129*/
		//output should be 3 in above case
		
		int b[][]= {{2,4,5},{3,8,7},{5,1,9}};
		
		int min=b[0][0];
		int column=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]<min)
				{
					column=j;
				}
			}
		}
		
		int max=b[0][column];
		for(int k=1;k<3;k++)
		{
			if(b[k][column]>max) 
			{
				max=b[k][column];
			}
		}
		
		System.out.println("The Maximun no from column of minimum no is "+max);
	}

	public void uniqueNoFromArray()
	{
		int a[]= {4,5,5,5,4,6,9,6,4,8,9};
		
		ArrayList<Integer> ab= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				//System.out.println("The no "+a[i]+" is repeated "+k+" times.");
			}
			if(k==1)
			{
				System.out.println("The unique no from given array is "+a[i]);
			}
		}
	}
	
	public void checkForValueInArray()
	{
		Integer[] a= {5, 1, 1, 9, 7, 2, 6, 10};
		
		int key;
		boolean result=false;
		Scanner in=new Scanner(System.in);
		key=in.nextInt();
		
		//METHOD 1
		//USING Liner Search
		/*for(int i=0;i<a.length;i++)
		{			
			if(a[i]==key)
			{				
				result=true;				
				break;
			}
		}
		System.out.println(result);*/
		
		//METHOD 2
		//USING LIST CONTAINS METHOD
		 /*result=Arrays.asList(a).contains(key);
		 System.out.println(result);*/
		 
		 //METHOD 3
		 //JAVA STREAMS		 
		 List<Integer> al=Arrays.asList(a);
		result= al.stream().anyMatch(s->s==key);
		System.out.println(result);
	}
	
	public void largestNumberInArray()
	{
		int[] arr= {20, 10, 20, 40, 100};
		int largest=arr[0];
		
		//METHOD 1
		//ITERATING THROUGH LOOP
		/*for(int a:arr)
		{
			if(a>largest)
			{
				largest=a;
			}
		}*/
		
		//METHOD 2
		//STREAMS
		largest=Arrays.stream(arr).max().getAsInt();		
		System.out.println(largest);		
	}
	
	public void sortingArraysAndSubArrays()
	{
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Integer[] array= { 99, 12, -8, 12, 34, 110, 0, 121, 66, -110 };
		
		//SORT ARRAY IN ASCENDING ORDER
		/*Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}*/
		
		//SORT IN DESCENDING ORDER
		/*Arrays.sort(array,Collections.reverseOrder());
		for(Integer x:array)
		{
			System.out.print(x+" ");
		}*/
		
		//SORT SUBARRAY WITHIN PARTICULAR INDEX
		/*Arrays.sort(arr,1,6);
		for(int m:arr)
		{
			System.out.print(m+" ");
		}*/
		
		//SORT SUBARRAY IN DESCENDING ORDER
		Arrays.sort(array,1,5,Collections.reverseOrder());
		for(Integer l:array)
		{
			System.out.print(l+" ");
		}
	}
	
	public void covertIntArrayToIntegerArray()
	{
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Integer[] b=new Integer[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			b[i]=Integer.valueOf(arr[i]);
		}
		
		Arrays.sort(b,Collections.reverseOrder());
		for(Integer j:b)
		{
			System.out.print(j+" ");
		}
	}
	
	public void sortArrayInDescending()
	{
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		
		//METHOD 1
		Arrays.sort(arr);
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}		
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public void removeDuplicatesFromArray()
	{
		Integer[] a= {9,8,6,5,9,8,9,2,3,3,6};
		
		//METHOD 1
		//USING STREAMS
		/*List<Integer> li=Arrays.asList(a);
		li.stream().sorted().distinct().forEach(s->System.out.print(s+" "));*/
		
		//METHOD 2
		int[] b= {9,8,6,5,9,8,9,2,3,3,6};
		Arrays.sort(b);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<b.length;i++)
		{
			if(!al.contains(b[i]))
			{
				al.add(b[i]);
			}
		}		
		
		for(int m:al)
		{
			System.out.print(m+" ");
		}		
	}
	
	public void mergeTwoArrays()
	{
		int[] a = { 10, 20, 30, 40 }; 
		int[] b = { 50, 60, 70, 80 }; 
		
		//METHOD 1
		//USING PREDEFINED FUNCTION System.arraycopy
		int alen=a.length;
		int blen=b.length;
		
		int[] c=new int[alen+blen];
		
		/*System.arraycopy(a, 0, c, 0, alen);
		System.arraycopy(b, 0, c, alen, blen);*/
		
		//METHOD 2
		//USING LOOPING CONCEPT
		for(int i=0;i<alen;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=0;j<blen;j++)
		{
			c[j+alen]=b[j];
		}
		
		for(int m:c)
		{
			System.out.print(m+" ");
		}		
	}
	
	public void checkIfTwoArraysAreEqual()
	{
		int a[] = { 30, 25, 40}; 
		int b[] = { 30, 25, 40 }; 
		boolean result=true;
					
		//METHOD 1
		//USING LOOPS
		/*if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(!(a[i]==b[i]))
				{
					result=false;
					break;
				}
			}
		}
		else
		{
			result=false;
		}*/
		
		//METHOD 2
		//USING PREDEFIND FUNCTION Arrays.equal
		result=Arrays.equals(a, b);
		
		if(result)
		{
			System.out.print("equal");
		}
		else
		{
			System.out.print("NOT equal");		
		}
	}
	
	public void removeOccuranceofElementInArray()
	{
		int[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
        int key = 3; 
        
        //METHOD 1
        //USING STREAMS
        /*List<int[]> li=Arrays.asList(arr);
        Arrays.stream(arr).filter(s->s!=key).forEach(s->System.out.print(s+" "));*/
        
        //METHOD 2
        //USING ARRAY LISTS
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]!=key)
        	{
        		al.add(arr[i]);
        	}
        }
        
        for(Integer m:al)
        {
        	System.out.print(m+" ");
        }
	}
	
	public void findCommonElementsInArray()
	{
		String[] arr1= { "Article", "in", "Geeks", "for", "Geeks" };
		String[] arr2 = { "Article", "Geeks","in" };
		
		ArrayList<String> al=new ArrayList<String>();
				
		//METHOD 1
		//USING LOOPS
		/*for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(!al.contains(arr1[i]))
					al.add(arr1[i]);
				}
			}
		}
		
		for(String m:al)
		{
			System.out.print(m+" ");
		}*/
		
		//METHOD 2
		//USING COLLECTION.REATAINALL() FUNCTION WHICH EXTRACTS ONLY COMMON ELEMENTS.
		HashSet<String> hs=new HashSet<String>();
		HashSet<String> hs1=new HashSet<String>();
		
		for(String a:arr1)
		{
			hs.add(a);
		}
		
		for(String b:arr2)
		{
			hs1.add(b);
		}
		
		hs.retainAll(hs1);
		
		for(String m:hs)
		{
			System.out.print(m+" ");
		}
	}
	
	public void copyArrayContent()
	{
		int a[] = { 1, 8, 3 }; 
		
		//METHOD 1
		//LOOPING
		int b[]=new int[a.length];
		
		/*for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}*/
		
		//METHOD 2
		//USING System.arrayCopy()
		/*System.arraycopy(a, 0, b, 0, 3);*/
				
		//method 3
		//clone() function
		//b=a.clone();
		
		//METHOD 4
		//copyof() function
		b=Arrays.copyOf(a, a.length);
		
		//METHOD 4
		//CopyofRange() function
		//b=Arrays.copyOfRange(a, 0, 2);
		
		for(int m:b)
		{
			System.out.print(m+" ");
		}
	}
		
	public void arrayRotationBySpecificNo()
	{
		int[] arr= {1,2,3,4,5,6,7};
		int index=2;
		int[] temp = new int[index];
		int[] result = new int[arr.length];
		
		
		for(int j=0;j<index;j++) 
		{
			temp[j]=arr[j];
		}
		
		for(int i=0;i<arr.length-index;i++)
		{
			arr[i]=arr[i+index];
		}
		
		System.arraycopy(arr, 0, result, 0, arr.length-index);
		System.arraycopy(temp, 0, result, arr.length-index, index);
		
		for(int m:result)
		{
			System.out.print(m+" ");
		}
	}
}
