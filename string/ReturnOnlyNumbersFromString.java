package string;

public class ReturnOnlyNumbersFromString {
	public static void main(String[] args) {
		String s="as12df*fghd$#345";
		onlyNumber(s);
		String s2="ab12cd2*#56x2";
		
		onlyNumber(s2);
		
	}
//	public static String onlyNumber(String s)
//	{
//		String ans="";
//		int sum=0;
//		
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch>='0' && ch<='9' )
//			{
//				
//				ans+=ch;
//				Integer.parseInt(ans);
//				sum+=(ch-'0');
//	         }
//			
//		}
//		
//		return "numbers present in String are:"+ans +" AND Sum of Numbers is:"+sum;
//		
//		}
	
	
	
	
	public static void onlyNumber(String s)
	{
		String ans="";
		int sum=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9' )
			{
				
				ans+=ch;
				Integer.parseInt(ans);
				sum+=(ch-'0');
	         }
			
		}
		
		 System.out.println("numbers present in String are:"+ans );
		 System.out.println("Sum of Numbers is:"+sum);
		}
	}


