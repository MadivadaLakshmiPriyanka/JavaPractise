
public class Array18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={6,8,0,5,3,2,1};
		int i=0,temp=0;
		
		for(int j=0;j<a.length/2;j++)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=i+2;
		}
		for(int k=0;k<=6;k++)
		{
			System.out.println(a[k]);
		}


	}

}
