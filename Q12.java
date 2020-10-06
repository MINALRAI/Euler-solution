
public class Q12 {
	static int divisors(int n)
	{
		int c=0;
		int s=(int)Math.sqrt(n);
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
				c+=2;
		}
		if(s*s==n)
			c--;
		return c;
	}

	public static void main(String[] args) {
		int n=0, i=1;
		while(divisors(n)<500)	
		{
			n+=i;
			i++;
		}
		System.out.println(n+" "+ i);
		
		

	}

}
