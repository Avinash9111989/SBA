package com.company.sba;

import java.util.Scanner;

public class StringTester {
	
	 public static String sreverse(String string) {
            StringBuffer sb = new StringBuffer();
		 String[] arrayOfString = string.split("\\s+");
	    	   for(int i=0;i<arrayOfString.length;i++) {
	    	    for(int j=arrayOfString[i].length()-1;j>=0;j--) {
	    	    	sb.append(arrayOfString[i].charAt(j));
	    	    }
	    	 sb.append(" ");
	    	   }
             return sb.toString();
	    }
	       
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	String string=sc.nextLine();
	    	System.out.println("Result: "+ sreverse(string));
	       
	    }

}
