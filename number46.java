
public class number46{
	public static void main(String args[])
	{
		int k=4;
		int v=800;
		for(int i=1;i<=4;i++)
		{
			v=10;
			for(int j=1;j<=k;j++)
			{
				System.out.print(v+" ");
				v=v+100;
			}
			k--;
			System.out.println(" ");
			v=v+100;
		}
		
}
}
