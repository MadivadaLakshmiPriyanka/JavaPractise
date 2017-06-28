
public class Array6{
	public static void main(String args[])
	{
		
		char[] a={'B','A','H','U','B','A','L','I','2'};	
		int k=9;
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.println(a[j]);
			}
			k--;
			if(i==9)
			{
			System.out.println("-Reaching 2000cr");
			System.out.println();
			}
		}
}
}
