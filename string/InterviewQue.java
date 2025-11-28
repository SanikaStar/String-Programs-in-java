package string;

import java.util.Arrays;

public class InterviewQue {
	public static void main(String[] args) {
		String[] s1= {"iliketoCoDE","teaMAKEsmehappy","abracaDabra","pasSword","blackcoffeeISthebest"};
		String [] s2= {"coffe","coding","happy"};
		
		System.out.println(Arrays.toString(isWeakStrong(s1,s2)));
		System.out.println();
		isWeak(s1,s2);
	}
	public static  void isWeak(String[] s1,String []s2)
	{
		
		
	  for(int i=0;i<s1.length;i++)
	  {
		  boolean flag=false;
		  String str=s1[i];
		for(int j=0;j<s2.length;j++)
		{
		   String word=s2[j];
		   if(str.contains(word))
		   {
			   flag=true;
			   break;
		   }
		}
		if(flag)
		  {
			  System.out.println(str+" is :Strong");
		  }
		else {
			System.out.println(str+ " is : weak");
		}
			 
	  }
	  
	}
	
	
	public static String[] isWeakStrong(String [] s1,String [] s2)
	{
		String [] ans=new String[s1.length];
		for(int i=0;i<s1.length;i++)
		{
		    String temp="";
			
			String str=s1[i];
			for(int j=0;j<s2.length;j++)
			{
				String word=s2[j];
				if(str.contains(word))
				{
					temp="Strong";
					ans[i]=temp;
					break;
					
				}
				else {
					temp="Weak";
					ans[i]=temp;
					
				}
				
				
			}
			
		}
		return ans;
		
	}

}
