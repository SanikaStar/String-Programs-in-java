package string;

public class NumbersToWords {
	public static void main(String[] args) {
		System.out.println(numToWord(200002));
	}
	
	public static String numToWord(int num) {
		String ans;
		if(num ==0) {
			return "Zero";
		}
		else if(num<0) {
			num = -num;
			ans = "Minus ";
		}
		else if(num>0 && num<10) {
			return generateWords(num);
		}
		else {
			ans ="";
		}
		int digitLen = ((""+num).length()+1);
		int[]digits = new int[digitLen/2];
		
		for(int i=num,j=digits.length-1; i!=0;j--) {
			if(j==digits.length-1) {
				digits[j]=i%1000;
				i/=1000;
			}
			else {
				digits[j] = i%100;
				i/=100;
			}
		}
		
		for(int i=0; i<digits.length-1; i++) {
			if(digits[i]>=0 && digits[i]<=20) {
				String s =  generateWords(digits[i]);
				if(s=="") {
					ans+="";
				}
				else {
					ans = ans +s+" "+generateWords(power(digitLen-2))+" ";
					digitLen-=2;
				}
			}
			else {
				String s = generateWords(digits[i]-digits[i]%10);
				if(s=="") {
					ans+="";
				}
				else {
					ans = ans+ s+" "+generateWords(digits[i]%10)+" "+generateWords(power(digitLen-2))+" ";
				}

			}
		}
		
		if(digits[digits.length-1]<=20) {
			ans += generateWords(digits[digits.length-1])+" ";
		}
		else if(digits[digits.length-1]>20 && digits[digits.length-1]<100) {
			ans += generateWords(digits[digits.length-1]-digits[digits.length-1]%10)+" "+generateWords(digits[digits.length-1]%10)+" ";
		}
		else {
			ans += generateWords(digits[digits.length-1]/100)+" Hundred "
		+generateWords(digits[digits.length-1]%100-digits[digits.length-1]%10)+" "+generateWords(digits[digits.length-1]%10)+" ";
		}
		
		return ans;
	}
	
	public static int power(int index) {
		int pow =1;
		for(int i=0; i<index; i++) {
			pow*=10;
		}
		return pow;
	}
	
	public static String generateWords(int val) {
		int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000,100000,10000000};
		String[] words= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","twelve","Thirteen","Fourteen",
				"Fifteen","Sixteen","Seventeen","Eighteen","nineteen","Twenty","Thirty","Fourty","Fifty","sixty","seventy","eighty","ninety","Hundread","Thousand","Lakh","Crore"};
		int ref = search(numbers, val);
		return words[ref];		
	}
	
	public static int search(int[] ar, int val) {
		for(int i=0;i<ar.length; i++) {
			if(ar[i]==val) {
				return i;
			}
		}
		return -1;
	}
}
