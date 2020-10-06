
public class Q3 {

	public static void main(String[] args) {
		long i,j,c=0,flag=0,max_no=0;
		long n=600851475143L;
		for(i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				
				for(j=2;j<i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
					
				}
				if(flag==0)
				{
					//System.out.println(i + "mamam");
					max_no=i;
					
				}
				
			}
		}
		System.out.println(max_no);

	}

}
