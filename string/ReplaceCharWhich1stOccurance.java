package string;

public class ReplaceCharWhich1stOccurance {
	public static void main(String[] args) {
		String str="banana";
		System.out.println(replace(str,'a','@'));
		
		
		
	}
	public static String replace(String s,char old,char naya)
	{
		String ans="";
		int index=indexOfOcc(s,old);
		for(int i=0;i<s.length();i++)
		{
			if(i==index) {
				ans+=naya;
			}else
			{
				ans+=s.charAt(i);
				
			}
			
		}
		return ans;
				
	}
	
	public static int indexOfOcc(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				return i;
			}
			
		}
		return -1;
	}

}

