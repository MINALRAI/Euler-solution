
public class Q4 {
	public static boolean ispalindrome(int n)
	{
		String s,s1="",s2="";
		s=Integer.toString(n);
		for(int i=0;i<s.length();i++)
		{
			s1=s1+s.charAt(i);
			s2=s.charAt(i)+s2;
		}
		if(s1.equals(s2))
			return true;
			else
				return false;
	}

	public static void main(String[] args) {
		int p=0,max=0;
		for(int i=100;i<1000;i++)
		{
			for(int j=i;j<=1000;j++)
			{
				p=i*j;
				if(p<max)
					break;
				if(ispalindrome(p))
				{
					max=p;
					//System.out.println(max+" "+ i +" " +j);
				}
				
			}
		}
		System.out.println(max);

	}

}
