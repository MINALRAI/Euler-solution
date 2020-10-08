/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
 class Q5 {
	public static int hcf(int i,int j)
	{
		while(j!=0)
		{
			int temp=i;
			i=j;
			j=temp%j;
		}
		return i;
	}

	public static void main(String[] args) {
	   int n=1;
       for(int i=1;i<=19;i++)
       {
    	   int gcd=hcf(i,n);
    	   n=(n*i)/gcd;
       }
		System.out.println(n);

	}

}
//output
//232792560
