/*The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
 class Q6 {

	public static void main(String[] args) {
		int sum=0,count=0,square;
		for(int i=1;i<=100;i++)
		{
			sum=sum+(i*i);
			count=count+i;
		}
		//System.out.println(sum);
		square=count*count;
		System.out.println(square-sum);

	}

}
//output
//25164150
