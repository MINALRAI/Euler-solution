/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
 class Q5 {

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
//output
//232792560
