
public class Array21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={6,-1,8,2,0,3,4,8,1,7};
		int [] b=new int[5];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				b[k]=a[i];
				k++;
			}
		}
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[j]);
			}
				
			
		
		

	}

}
