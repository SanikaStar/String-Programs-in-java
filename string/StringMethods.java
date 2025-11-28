package string;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s="pneumonoultramicroscopicsilicovolcanoconiosis";
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(9));
		System.out.println(s.codePointBefore(9));
		System.out.println(s.codePointCount(0,9));
		System.out.println("Vinay".compareTo("Vijay"));
		System.out.println("Vijay".compareToIgnoreCase("Vinay"));
		System.out.println("Hi".concat("hello"));
		System.out.println(s.contains("volcano"));
		System.out.println("hi".contentEquals("hi"));
		System.out.println(s.endsWith("sis"));
		System.out.println(s.startsWith("sis"));
		
		byte[] ar=s.getBytes();
		System.out.println(Arrays.toString(ar));
		System.out.println(s.indent(10));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e','o'));
		System.out.println(s.indexOf("volcano"));
		System.out.println("ahaa".isBlank());
		System.out.println("  ".isEmpty());
	System.out.println(s.lastIndexOf('o'));
	System.out.println(s.length());
	System.out.println("ABC".repeat(5));
	System.out.println(s.replace('a', '@'));
	String  s2="I Love india";
	String [] word =s2.split("o");
	System.out.println(Arrays.toString(word));
	System.out.println("           ABC       ".strip());
	System.out.println(s.substring(40));
	System.out.println(s.substring(40,42));
	char []ch=s.toCharArray();
	System.out.println(Arrays.toString(ch));
	
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	
	}

}
