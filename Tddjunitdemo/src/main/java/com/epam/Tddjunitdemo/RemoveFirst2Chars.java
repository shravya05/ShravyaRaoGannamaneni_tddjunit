package com.epam.Tddjunitdemo;

public class RemoveFirst2Chars {

	public String remove(String string) {
		StringBuilder sb=new StringBuilder(string);
		String  result=string;
		if(string.length()<=1)
			return string;
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
		sb.delete(0,2);
		result=sb.toString();
		}
		else if(string.charAt(0)=='A')
		{
			sb.delete(0,1);
			result=sb.toString();
		}
		else if(string.charAt(1)=='A')
		{
			sb.delete(1,2);
			result=sb.toString();
		}
		return result;
	}

}
