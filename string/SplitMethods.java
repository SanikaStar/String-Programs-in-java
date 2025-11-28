package string;

import java.util.Arrays;

public class SplitMethods {
	public static void main(String[] args) {
		String s="Hii hello namaste";
		System.out.println(Arrays.toString(split(s)));
		
	}
	public static String[] split(String s)
	{
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			   ct++;
		}
		String [] ans=new String[ct+1];   
		String temp="";
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				temp+=ch;
			}else {
				ans[index++]=temp;
				temp="";
			}
		}
		ans[index]=temp;
		return ans;
	}
	}
