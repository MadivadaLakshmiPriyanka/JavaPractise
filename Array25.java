
public class Array25{
	public static boolean isPresent(int [] a,int v)
	{
		boolean r=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==v)
			{
				r=true;
			}
		}
		return r;
	}
	public static void main(String args[])
	{
		int[] b={3,4,5,7,8,9,0,1};
		int v=4;
		boolean r=isPresent(b,v);
		if(r==true)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
		
}
}
