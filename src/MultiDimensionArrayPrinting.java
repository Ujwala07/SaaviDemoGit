
public class MultiDimensionArrayPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=0;
		a[1][1]=8;
		a[1][2]=7;
		
		int b[][]= {{1,2,3},{4,9,6},{2,3,8}};
		
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}

}
