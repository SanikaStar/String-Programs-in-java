package string;
public class EmailValidation {
	public static void main(String[] args) {
		String s="sanika2710@gmail.com";
		System.out.println(isValidEmail(s));
		}
	public static boolean isValidEmail(String s)
	{
		int atCount=0;
		 if(s.length()<5)
		 {
			 return false;
		 }
			 for(int i=0;i<s.length();i++)
			 {
				 if(i==0 && (s.charAt(0)>='0' && s.charAt(0)<='9'))
				 {
					 return false;
				 } else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				 {
					 return false;
				 }else if(s.charAt(i)=='@')
				 {
					 atCount++;
				 }
			 }
			 if(atCount!=1)
			 {
				 return false;
			 }
		 
			 int len=s.length();
			
			 if(!(s.charAt(len-1)=='m' && 
					 s.charAt(len-2)=='o'&& s.charAt(len-3)=='c' && s.charAt(len-4)=='.'))
			 {
				 return false;
			 }
		 return true;
	}

}
