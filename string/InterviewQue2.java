package string;

import java.util.Arrays;

public class InterviewQue2 {
	public static void main(String[] args) {
		String [] s1= {"20 SEP 1958","16 JUN 2068","06 JAN 1933",
				"25 MAY 2068","06 JAN 1933","25 MAY 1912","16 DEC 2016",
				"26 DEC 2061","04 NOV 2030","15 JUL 1963"};
		System.out.println(Arrays.toString(sortDate(s1)));
	
		
	}
	
	public static String[] sortDate(String [] d)
	{
		int [] y=new int[d.length];
		for(int i=0;i<d.length;i++)
		{
			String s=d[i];
			int year=Integer.parseInt(s.split(" ")[2]);
			
			y[i]=year;
		}
		
		for(int i=0;i<y.length-1;i++)
		{
			int swap=0;
			for(int j=0;j<y.length-i-1;j++)
			{
				if(y[j]>y[j+1])
				{
					y[j]=y[j]+y[j+1];
					y[j+1]=y[j]-y[j+1];
					y[j]=y[j]-y[j+1];
					swapEle(d,j,j+1);
					swap++;
				}
			}
			if(swap==0)
			{
				break;
			}
		}
		
		if(checkDuplicateYear(y))
		{
			for(int i=0;i<y.length-1;i++)
			{
				if(y[i]==y[i+1])
				{
					if(!checkMonth(d[i],d[i+1]))
					{
						sortMonth(d,i,i+1);
					}
					else
					{
						if(!checkDay(d[i],d[i+1]))
						{
							sortDay(d,i,i+1);
						}
					}
				}
			}
		}
		int j=0;
		for(int i=0;i<d.length-1;i++)
		{
			if(d[i].equals(d[i+1]))
			{
				d[i+1]="0";
				j++;
			}
		}
		
		if(j>0)
		{
			String[] newDates=new String[d.length-j];
			for(int i=0,k=0;i<d.length;i++)
			{
				if(!d[i].equals("0"))
				{
					newDates[k++]=d[i];
				}
			}
			d=newDates;
		}
		return d;
	}
	
	public static boolean checkDuplicateYear(int [] y)
	{
		for(int i=0;i<y.length-1;i++) {
			if(y[i]==y[i+1]) {
				return true;
			}
			
		}
		return false;
	}
	public static void swapEle(String [] d,int i,int j)
	{
		String temp=d[i];
		d[i]=d[j];
		d[j]=temp;
	}
	public static boolean checkMonth(String d1,String d2)
	{
		if(d1.split(" ")[1].equals(d2.split(" ")[1]))
		{
			return true;
		}
		return false;
	}
	public static void sortMonth(String d[] ,int i,int j)
	{
		String m1=d[i].split(" ")[1];
		String m2=d[j].split(" ")[1];
		String month[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		int cnt1=-1,cnt2=-1;
		for(int k=0;k<month.length;k++)
		{
			if(month[k].equals(m1))
			{
				cnt1=k;
				
			}
			if(month[k].equals(m2))
			{
				cnt2=k;
				
			}
			
		}
		if(cnt1>cnt2)
		{
			String temp=d[i];
			d[i]=d[j];
			d[j]=temp;
		}
	}
	public static boolean checkDay(String d1,String d2)
	{
		if(d1.split(" ")[0].equals(d2.split(" ")[0])) {
			return true;
		}return false;
	}
	
	public static void sortDay(String d[] ,int i,int j) {
		int day1=Integer.parseInt(d[i].split(" ")[0]);
		int day2=Integer.parseInt(d[j].split(" ")[0]);
		if(day1<31 && day2<31)
		{
			if(day1>day2) {
			String temp=d[i];
			d[i]=d[j];
			d[j]=temp;
		}
		}
	}
	

}
