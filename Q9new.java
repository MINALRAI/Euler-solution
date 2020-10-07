/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/
 class Q9new {

	public static void main(String[] args) {
		int i,j,x;
		for(i=1;i<=1000;i++)
		{
			for(j=i;j<=1000;j++)
			{
				x=1000-i-j;
				if(i*i+j*j==x*x)
				{
					System.out.println(x+" "+i+ " "+ j);
					System.out.println(x*i*j);
					break;
				}
			}
		}

	}

}
//output
//425 200 375
//31875000
