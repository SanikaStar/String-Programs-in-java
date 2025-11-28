package string;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="abcaba";
		int i;
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				break;
			}
		}
		
		if(i>=s.length()/2)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
