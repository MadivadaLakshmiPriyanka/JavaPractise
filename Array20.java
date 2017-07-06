
public class Array20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={1,0,0,1,1,0,0};
		int b=1,sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			b=1;
			for(int j=0;j<a.length-1-i;j++)
			{
				b=b*2;
			}
				sum=sum+a[i]*b;
			}
			System.out.println(sum);
		
		

	}

}
