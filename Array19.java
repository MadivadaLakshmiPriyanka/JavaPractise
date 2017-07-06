
public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={1,0,2,4,3,5,1};
		int sum=0;
		
		for(int j=0;j<a.length;j++)
		{
			sum=0;
			for(int i=j;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			System.out.println(sum);
		}
		

	}

}
