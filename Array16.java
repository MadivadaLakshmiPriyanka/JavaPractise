
public class Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char decision='Y';
		
		int [][] a={{1,0,0},{0,1,0},{0,0,1}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					if(a[i][j]!=1)
					{
						decision='N';
					}
				}
				else if(a[i][j]!=0)
				{
					decision='N';
				}
			}
		}
if(decision=='Y')
{
	System.out.println("Identity Matrix");
}
else
{
	System.out.println("Not Identity Matrix");
}
	}

}
