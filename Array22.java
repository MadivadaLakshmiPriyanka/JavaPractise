
public class Array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={23,22,17,11,14,6,8};
		int flag=0,sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			flag=0;
			for(int j=2;j<a[i]/2;j++)
			{
			if(a[i]%j==0)
			{
				flag=1;
				break;
			}
		}
			if(flag==0)
			{
				sum=sum+a[i];
			}
		}
				System.out.println(sum);
			
				
			
		
		

	}

}
