package string;

public class LongestCommonSubString {
	public static void main(String[] args) {
		String s1="ababcde";
		String s2="abdabcde";
		subSeq(s1,s2);
		
	}
	public static void subSeq(String s1,String s2)
	{
		int max=0;
		String ans="";
		for(int i=0;i<s1.length();i++)
		{
			int k=i;
			String temp="";
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(k)==s2.charAt(j))
				{
					temp=temp+s1.charAt(k);
					if(k<s1.length()-1)
					{
						k++;
					}
				}else {
					if(temp.length()>0&& temp.length()>max)
					{
						max=temp.length();
						ans=temp;
						j=j-temp.length();
					}
					k=i;
					temp="";
				}
			}
			if(temp.length()>0&& temp.length()>max)
			{
				max=temp.length();
				ans=temp;
				
			}
		}
		System.out.println(ans);
		System.out.println(max);
	}

}
