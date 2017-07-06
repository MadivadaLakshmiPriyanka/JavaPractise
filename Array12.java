
public class Array12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
int [][] a={{1,2},{3,4}};
int [][] b={{5,6},{7,8}};
int [][] c=new int[2][2];
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		c[i][j]=a[i][j]-b[i][j];
		System.out.println(c[i][j]+" ");
		for(int k=1;k<=i/2;k++)
		{
	       if(c[i][j]%k==0)
	       {
	    	   flag=1;
	    	   break;
	       }
	       if(flag==0)
	       {
	    	   c[i][j]=0;
	       }
	       System.out.println(c[i][j]);
		}
	}
}

	}

}
