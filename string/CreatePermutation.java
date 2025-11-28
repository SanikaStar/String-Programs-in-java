
package string;

import java.util.Arrays;

public class CreatePermutation {
	public static void main(String[] args) {
		char [] ar={'a','b','c','d'};
		createPermutation(ar,0);
		
	}
	public static void createPermutation(char[] ar ,int refIndex)
	{
		if(refIndex==ar.length-1)
		{
			System.out.println(Arrays.toString(ar));
			return ;
		}
		for(int i=refIndex;i<ar.length;i++)
		{
			swap(ar,i,refIndex);
			createPermutation(ar,refIndex+1);
			swap(ar,refIndex,i);
		}
	}
	public static void swap(char [] ar,int index,int refIndex)
	{
		char temp=ar[index];
		ar[index]=ar[refIndex];
		ar[refIndex]=temp;
		
	}

}
