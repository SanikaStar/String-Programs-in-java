package string;

public class FindLength {
	public static void main(String[] args) {
		
		System.out.println(length("Ssdfdsf"));
		
	}
	
	public static int length(String s)
	{
		int ct=1;
		for(int i=0; ;i++)
		{
			try
		{
			s.charAt(i);
			ct++;
		}
			catch(StringIndexOutOfBoundsException  e)
			{
				return ct;
			}
	}
	}

}
