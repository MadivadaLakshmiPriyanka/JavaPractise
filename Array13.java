
public class Array13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
int r=0,c=0;
int count=0;
int [][] a=new int[2][2];
for(int i=200;i<400;i++)
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
	    	   count++;
	    	   if(r<2)
	    	   {
	    		   a[r][c]=i;
	    		   System.out.println(a[r][c]);
	    		   c++;
	    		   if(c==2)
	    		   {
	    			   r++;
	    			   c=0;
	    		   }
	       }
	    	   if(count==4)
	    	   {
	    		   break;
	    	   }
	      
		}
	
}

	}

}
