package string;

public class PhoneNoValidation {
	public static void main(String[] args) {
		String s="9143263434";
		String s2="+919143263434";
		System.out.println(isPhoneNo(s));
		System.out.println(isPhoneNo2(s2));
	}
    public static boolean isPhoneNo(String s)
    {
    	if(s.length()!=10)
    	{
    		return false;
    	}
    	for(int i=0;i<s.length();i++)
    	{
    		if(i==0 &&!(s.charAt(0)=='7' || s.charAt(0)=='8' || s.charAt(0)=='9'))
    		{
    			return false;
    		}
    		if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
    		{
    			return false;
    		}
    		
    	}
    	
    	return true;
    	
    }
    
    
    public static boolean isPhoneNo2(String s)
    {
    	if(s.length()!=13)
    	{
    		return false;
    	}
    	if(!(s.charAt(0)=='+' && s.charAt(1)=='9' && s.charAt(2)=='1'))
    			{
    		       return false;
    			}
    	for(int i=3;i<s.length();i++)
    	{
    		if(i==3 &&!(s.charAt(3)=='7' || s.charAt(3)=='8' || s.charAt(3)=='9'))
    		{
    			return false;
    		}
    		if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
    		{
    			return false;
    		}
    	
    	}
    	return true;
    }
    
}
