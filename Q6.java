/*The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
 class Q6 {

	public static void main(String[] args) {
             int sum1=(100*101)/2;
	     int square=sum1*sum1;
	     int sum2=(100*101*201)/6;
	     int diff=square-sum2;
	     System.out.println(diff);

	}

}
//output
//25164150
