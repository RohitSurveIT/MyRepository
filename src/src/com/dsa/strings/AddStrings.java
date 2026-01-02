package com.dsa.strings;

public class AddStrings {
	
	public static String addStrings(String num1,String num2) {
		StringBuilder sb=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
		
		while(i>=0 || j>=0 || carry>0) {
			int digit1=i>=0?num1.charAt(i)-'0':0;
			int digit2=j>=0?num2.charAt(j)-'0':0;
			int sum=digit1+digit2+carry;
			sb.append(sum%10);  //last digit
			carry=sum/10;       //remaining carry
			i--;
			j--;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="223";
		String num2="547";
		System.out.println(addStrings(num1,num2));

	}

}
