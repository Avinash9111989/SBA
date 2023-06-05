package com.company.sba;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class SwitchCaseTester {

	public static void main(String[] args) {
	// add switch case for given problem statement
		Scanner sc = new Scanner(System.in);
		ArrayList<String> output = new ArrayList<String>();
		int[] casenums= new int[sc.nextInt()];
		for(int i=0;i<casenums.length;i++) {
			casenums[i]=sc.nextInt();
		}
		for(int i=0;i<casenums.length;i++) {
			switch(casenums[i]) {
			case 1: output.add(isPrimeNumber(sc.nextInt()));
			break;
			case 2: output.add(fibanocciSeries(sc.nextInt()));
			break;
			case 3: output.add(removeDuplicates(sc.next()));
			break;
			case 4:output.add(factorial(sc.nextInt()));
			break;
			case 5: output.add(palindrome(sc.next()));
			break;
			case 6:  output.add(amstrong(sc.nextInt()));
			break;
		    default: System.out.println("Please provide correct case number");
			}
		}
	   for(String o:output) {
		   System.out.println(o);
	   }
     	}

	private static String amstrong(int nextInt) {
		// TODO Auto-generated method stub
		int  originalNum, remainder, result = 0;
		originalNum=nextInt;
		while (originalNum != 0) {
		       // remainder contains the last digit
		        remainder = originalNum % 10;
		        
		       result += remainder * remainder * remainder;
		        
		       // removing last digit from the orignal number
		       originalNum /= 10;
		    }

		    if (result == nextInt)
		       return nextInt+" is an Armstrong number.";
		    else
		    	 return nextInt+" is not an Armstrong number.";

	}

	private static String palindrome(String str) {
		// TODO Auto-generated method stub
		  String  reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		     return str +" is a Palindrome String.";
		    }
		    else {
		    	 return str +" is a not a Palindrome String.";
		    }
		   
	}

	private static String factorial(int nextInt) {
		// TODO Auto-generated method stub
		  int i,fact=1;  
		  for(i=1;i<=nextInt;i++){    
		      fact=fact*i;    
		  }    
		  return fact+"";
	}

	private static String removeDuplicates(String next) {
		// TODO Auto-generated method stub
		 LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<next.length();i++)   
	            set.add(next.charAt(i));   
	        next="";
	        for(Character ch : set)   
	            next=next+ch;   
	        // print the string after removing duplicate characters   
	     return next;  
	    }   
	

	private static String fibanocciSeries(int nextInt) {
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		   String str="0 1";
		 for(i=2;i<=nextInt;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;  
		  str=n3+"";
		  str=str+" ";  
		  n1=n2;    
		  n2=n3;    
		 }
		return str;    
		  
		
	}

	private static String isPrimeNumber(int nextInt) {
		// TODO Auto-generated method stub
	    boolean flag = false;
	    for (int i = 2; i <= nextInt / 2; ++i) {
	      // condition for nonprime number
	      if (nextInt % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      return nextInt + " is a prime number.";
	    else
	    	return nextInt + " is not a prime number.";
	  }
	}


