
public class number54{
	public static void main(String args[])
	{
		
		int flag=0,k=0;
		for(int i=200;i<=300;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
			if(i%j==0)
			{
				flag=1;
				break;
			}
			
		    }
		if(flag==0)
		{
			if(k%2==0)
			{
		  System.out.println(i);
		  
			}
			k++;
		}
		}
		
}
}
