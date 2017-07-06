
public class Array14{
	public static void main(String args[])
	{
		int sum=0;
		int[][] a={{33,44},{11,1}};	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][i];
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][i]=sum;
				System.out.println(a[i][j]);
			}
			
		}
		
	}
}

			
		
		
		
		
		


