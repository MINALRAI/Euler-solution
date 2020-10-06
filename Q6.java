
public class Q6 {

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
