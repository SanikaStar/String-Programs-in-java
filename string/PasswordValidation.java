package string;

public class PasswordValidation {
	public static void main(String[] args) {
		String s="Sanika@123";
		System.out.println(isPassword(s));
		
	}
	public static boolean isPassword(String s)
	{
		if(s.length()<9)
		{
			return false;
		}
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				return false;
			} else
			if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				return false;
			}else
			if(!(s.charAt(i)=='@' || s.charAt(i)=='#'||s.charAt(i)=='_'))
			{
				return false;
			}
				
		}
		return true;
	}

}
