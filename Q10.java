
public class Q10 {
	public static void main(String[] args) {
		int i,j,flag=0;
		long sum=2;
		for(i=3;i<2000000;i+=2)
		{
			for(j= 3; j*j<=i; j+=2)
			{
				flag=0;
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}if(flag==0)
			{
				//System.out.println(i);
				sum=sum+i;}
		}
		System.out.println(sum);
			
	}

}
