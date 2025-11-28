package string;

public class FindIndex {
	public static void main(String[] args) {
		String s="Sanika patil".toLowerCase();
		
		System.out.println(FindIndex(s,'s'));
		System.out.println(subString(s,2,8));
		
	}
	public static int FindIndex(String s,char ch)
	{
		int i;
		for( i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static String subString(String s,int start,int end)
	{
		if(start<end)
		{
			String ans="";
		for(int i=start;i<end;i++)
		{
			ans+=s.charAt(i);
		}
		return ans;
		}
		return s;
	}

}


