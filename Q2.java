
public class Q2 {

	public static void main(String[] args) {
		 int num1 = 0, num2 = 1; 
		  
	        int counter = 0; 
	  
	        int num3=0;
	        int sum=0;
	        while ((num1<4000000)&&(num2<4000000)) { 
	         num3 = num2 + num1; 
	           
	            if(num3%2==0)
	            {
	            	sum=sum+num3;
	            }
	            if(num3>4000000)
	            {
	            	break;
	            }
	           
	            num1 = num2; 
	            num2 = num3; 
	           

	}
	        System.out.println(sum);

}
}
