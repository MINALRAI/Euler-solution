//The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

//Let us list the factors of the first seven triangle numbers:

 //1: 1
// 3: 1,3
 //6: 1,2,3,6
//10: 1,2,5,10
//15: 1,3,5,15
//21: 1,3,7,21
//28: 1,2,4,7,14,28



// heloo worold 
// hello himanshu 
//

//We can see that 28 is the first triangle number to have over five divisors.

//What is the value of the first triangle number to have over five hundred divisors?
class Q12 {
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
		System.out.println(n);
		
		

	}

}
//output
//76576500
