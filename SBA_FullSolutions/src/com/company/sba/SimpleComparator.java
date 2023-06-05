package com.company.sba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Student{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
}  
class AgeComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		} 
}  
 
class NameComparator implements Comparator{
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		return s1.name.compareTo(s2.name);  
		}  
}  
class SimpleComparator{  
public static void main(String args[]){  
	
	ArrayList<Student> student=new ArrayList<Student>(); 
	ArrayList<Integer> rollno=new ArrayList<Integer>(); 
	ArrayList<String> name=new ArrayList<String>(); 
	ArrayList<Integer> age=new ArrayList<Integer>(); 
	
	Scanner sc = new Scanner(System.in);
	int size=sc.nextInt();
    for(int i=0;i<size;i++) {
	rollno.add(sc.nextInt());
    }
    for(int i=0;i<size;i++) {
    	name.add(sc.next());
        }
    for(int i=0;i<size;i++) {
    	age.add(sc.nextInt());
        }
    for(int i=0;i<size;i++) {
	student.add(new Student(rollno.get(i),name.get(i),age.get(i)));  
    }
	  
	System.out.println("Sorting by Name");  
	  
	Collections.sort(student,new NameComparator());  
	Iterator itr=student.iterator();  
	while(itr.hasNext()){  
	Student st=(Student)itr.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	System.out.println("Sorting by age");  
	  
	Collections.sort(student,new AgeComparator());  
	Iterator itr2=student.iterator();  
	while(itr2.hasNext()){  
	Student st=(Student)itr2.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
  
}  
}  