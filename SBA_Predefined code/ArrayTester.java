package com.company.sba;
import java.util.Scanner;

public class ArrayTester {
	
	 public static double[] findDetails(double[] salary) {
	     double[] details = new double[3];
	     int lc=0,gc=0;
	     double averageSalary=0.0;
	     for(int i=0;i<salary.length;i++) {
	    	 averageSalary= salary[i]+averageSalary;
	     }
	     averageSalary=averageSalary/salary.length;
	     //System.out.println(averageSalary);
	     for(int i=0;i<salary.length;i++) {
	    	 if(salary[i]>averageSalary) {
	    		 gc++;
	     }else if(salary[i]<averageSalary)
	    	 lc++;
	     }
	     details[0]=averageSalary;
	     details[1]=gc;
	     details[2]=lc;
		 return details;     

	    }
	       
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	int totalSalaries=sc.nextInt();
            double[] salaries = new double[totalSalaries];
            for(int i=0;i<totalSalaries;i++) {
            	salaries[i]=sc.nextDouble();
            }
            double[] details=findDetails(salaries);   
	       // create double details array to accept return from findDetails       
	        System.out.println("Result: "+ details[0]+" "+details[1]+" "+details[2]);
	       
	    }

}
