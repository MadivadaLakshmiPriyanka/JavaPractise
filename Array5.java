
public class Array5{
	public static void main(String args[])
	{
		int k=0;
		int flag=0;
		int [] a=new int[k];
		for(int i=100;i<=200;i++)
		{
			flag=0;
		
		for(int j=1;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			
			a[k]=i;
			k++;
			
		System.out.println(a[k]);
		}
		}
}
}
