package string;

public class SortString {
	public static void main(String[] args) {
		String s="sanika".toLowerCase();
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-1-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		String str=new String (ch);
		System.out.println(str);
	}

}
