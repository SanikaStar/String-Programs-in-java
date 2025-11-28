package string;

public class Panagram {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(checkPanagram(s));
		
		
	}
   public static boolean checkPanagram(String s)
   {
	   int [] ct= new int [26];
	   for(int i=0;i<s.length();i++)
	   {
		   char ch=s.charAt(i);
		   if(ch>='a' && ch<='z')
		   {
			   ct[ch-97]++;
		   }else if(ch>='A' && ch<='Z')
		   {
			   ct[ch-65]++;
		   }
	   }
	   for(int i=0;i<ct.length;i++)
	   {
		   if(ct[i]==0)
		   {
			   return false;
		   }
	   }
	   return true;
   }
}
