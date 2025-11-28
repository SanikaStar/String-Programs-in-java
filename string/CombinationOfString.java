package string;

public class CombinationOfString {
	public static void main(String[] args) {
		String s="abc";
		combination(s,0,"");
		
		
	}
	public static void combination(String a,int ref,String newStr)
	{
		if(!newStr.isEmpty())
		{
			System.out.println(newStr);
		}
		for(int i=ref;i<a.length();i++)
		{
			combination(a,i+1,newStr+a.charAt(i));
		}
	}

}
