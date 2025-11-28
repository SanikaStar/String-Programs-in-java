package string;

import java.math.BigDecimal;

public class AdditionOfTwoStringNumbers {
	public static void main(String[] args) {
		String s1="453653737";
		String s2="63268";
		System.out.println("Product of two number:"+Product(s1,s2));
		System.out.println("Sum of two number:"+sum(s1,s2));
	}
	
	public static String Product(String s1,String s2)
	{
		BigDecimal d1= new BigDecimal(s1);
		BigDecimal d2= new BigDecimal(s2);
		return ""+d1.multiply(d2);
	}
	
	public static String sum(String s1,String s2) {
		try {
			long l1= Long.parseLong(s1);
			long  l2= Long.parseLong(s2);
			String ans="";
			int lengthDiff=s1.length()-s2.length();
			if(lengthDiff> 0)
			{
				s2=("0".repeat(lengthDiff)+s2);
			}else
			{
				s1=("0".repeat(lengthDiff)+s1);
			}
			int carry=0;
			for(int i=s1.length()-1;i>=0;i--)
			{
				int sum=(s1.charAt(i)-48)+(s2.charAt(i)-48)+carry;
				carry=0;
				if(sum<=9)
				{
					ans=sum+ans;
				}
				else {
					ans=(sum%10)+ans;
					carry=sum/10;
				}
			}
			
			if(carry>0)
			{
				ans=carry+ans;
			}
			return ans;
		}catch(NumberFormatException e)
		{
			return "";
		}
	}

}
