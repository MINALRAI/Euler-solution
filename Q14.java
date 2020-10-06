
public class Q14 {
	

	public static void main(String[] args) {
		int i=0,n=1000000;
				long maxlen=0,maxno=0,s;
	
		for(i=2;i<=n;i++)
		{
			s=i;
		    int length=1;
				while(s!=1)
				{
					if(s%2==0)
					{
					s=s/2;
					}
					else
					{
						s=s*3 + 1;
					}
					length++;
				}
			
			
			
			if(length>maxlen)
			{
				maxlen=length;
				maxno=i;
			}
		}
		System.out.println(maxno);

	}

}
