/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
class Q7 {
	public static boolean isPrime(int n)
	{
		int flag=0;
		for(int i=3;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n=0,x=1,count=0;
		while(n<=10001)
		{
			x++;
			if(isPrime(x))
			{
				count=x;
				n++;
				}
	}
		System.out.println(count);

}
}
//output
//104743
