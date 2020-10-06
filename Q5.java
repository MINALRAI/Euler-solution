
public class Q5 {

	public static void main(String[] args) {
		int i,j,flag=0,n=0;
		for(i=20;i<1000000000;i+=20)
		{
			 flag=0;
			for(j=20;j>=2;j--)
			{
				if(i%j!=0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				n=i;
				break;
			}
				
		}
		System.out.println(n);

	}

}
