
public class Q9new {

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
