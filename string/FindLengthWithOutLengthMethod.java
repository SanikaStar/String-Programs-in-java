package string;

public class FindLengthWithOutLengthMethod {
	public static void main(String[] args) {
		String s="Sanika";
		System.out.println(length(s));
		
	}
	public static int length(String s)
	{
		int ct=0;
		for(int i=0;;i++)
		{
			try {
				s.charAt(i);
				ct++;
				
			}
			catch(StringIndexOutOfBoundsException e)
			{
				return ct;
			}
		}
	}

}
