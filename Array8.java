
public class Array8{
	public static void main(String args[])
	{
		
		int[] a={2,4,1,0,6};	
		int low=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(low>a[i])
			{
				low=a[i];
			}
		}
				System.out.println(low);
			
			
		
}
}
