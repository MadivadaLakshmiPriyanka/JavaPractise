
public class Array15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] a={{3,2,1},{5,6,7},{8,9,10}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
				sum=sum+a[i][i];
				}
				
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][i]=sum;
				
			}
		}
		for(int m=0;m<3;m++)
		{
			for(int n=0;n<3;n++)
			{
				System.out.print(a[m][n]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		

	}

}
