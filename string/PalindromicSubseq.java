package string;

public class PalindromicSubseq {
	public static void main(String[] args) {
		String s="abab";
		System.out.println(longestPalSub(s));
		
	}
	public static String longestPalSub(String s)
	{
		s=addSpaces(s);
		int max=0,i=0,j=0,k=0;
		String longestPal="";
		while(i<s.length())
		{
			if(j>0 && k<s.length()-1)
			{
				if(s.charAt(j-1)==s.charAt(k+1))
				{
					j--;
					k++;
				}
				else if(k-j>0)
				{
					String temp=s.substring(j,k+1);
					temp=remove(temp,' ');
//					System.out.println(temp);
					if(temp.length()>=max) {
						max=temp.length();
						longestPal=temp;
						
					}
					i++;
					j=k=i;
				}else {
					i++;
					j=k=i;
				}
				
			}
			
			else{
				if(k-j>0)
				{
					String temp=s.substring(j,k+1);
					temp=remove(temp,' ');
//					System.out.println(temp);
					if(temp.length()>=max) {
						max=temp.length();
						longestPal=temp;
						}
				}
				i++;
				j=k=i;
		}
	}
		return longestPal;

}
	
	
	public static String  addSpaces(String s)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			ans+=s.charAt(i)+" ";
		}
		return ans.trim();
	}
	public static String subString(String s,int start,int end)
	{
		if(start<end)
		{
			String ans="" ;
			for(int i=start;i<end;i++)
			{
				ans+=s.charAt(i);
			}
			return ans;
		}
		return s;
	}
	public static String remove(String s,char ch)
	{
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=ch) {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
}
