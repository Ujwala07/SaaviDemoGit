
public class PrintingPyramindPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingPyramindPrograms pp =new PrintingPyramindPrograms();
		pp.pyramidPattern3();
		
	}

	public void pyramidPattern1()
	{
	/* 1 2 3 4
	5 6 7
	8 9
	10 */
	int k=1;
	for(int i=0;i<4;i++)
	{
		for(int j=1;j<=4-i;j++)
		{			
			
			System.out.print(k);
			System.out.print("\t");
			k++;
			
		}
		System.out.println();
	}
	}
	
	public void pyramidPattern2() 
	{
		/*1
		2 3
		4 5 6
		7 8 9 10*/
		int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public void pyramidPattern3() 
	{
		/*3
		6 9
		12 15 18*/
		int k=1;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(3*k);
				k++;
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
