package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Sample {
	 public static void main( String[] args )
	    {
	        /*System.out.println( "Hello World!" );
	        System.out.println(System.getProperty("user.dir"));
	        printFibonacci(3);
	        numPalindromeCheck(544);
	        
	        String s="Arjun";
	        s=s+"Desai";
	        System.out.println(s);*/
		// reverseTraverseArrayList();
		 //splitExample();
		 
		/* int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  */
		 
		 /*StringBuilder s1 = new StringBuilder("Java"); 
	        String s2 = "Love"; 
	        s1.append(s2); // append will directly make change in the s1 by appending
	        System.out.println("The String S1"+ s1);
	        s1.substring(4); // this will return a string if it is not stored then no use , the s1 will remain the same
	        System.out.println("The String S1"+ s1);
	        int foundAt = s1.indexOf(s2); 
	        System.out.println(foundAt); */
		 
		 //System.out.println('j'+'a'+'v'+'a');
		 
		 try {
			 System.out.println("The length of the args is "+args.length);
			args[0]="O";
			 return;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
		 finally{
			 System.out.println("In Finally");
		 }
		 
	    }
	 private static void numPalindromeCheck(int num) {
		int dig,temp;
		int sum=0;
		
		temp=num;  // First we will save the original number for later comparison
		
		while(num>0){
			dig=num%10;
			sum=dig+(sum*10);
			num=num/10;
		}
		
		if (sum == temp) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}
		
		
	}
	public static void printFibonacci(int num){
		 int n1=0;
		 int n2=1;
		 int n3;
		 if(num<=2){
			 if(num==1){
				 System.out.println(n1+" ");
			 }
			 else if(num==2){
				 System.out.println(n1+" "+n2);
			 }
			 else{
				 System.out.println("Invalid input number");
			 }
			}
		 else{
			 System.out.print(n1+" "+n2+" ");
			 for(int i=2;i<num;i++){
				 n3=n1+n2;
				 System.out.print(n3+" ");
				 n1=n2;
				 n2=n3;
			 }
		 }
		 
	 }
	public static void reverseTraverseArrayList(){
		List<Integer> aList= new ArrayList<>();
		aList.add(1);aList.add(2);aList.add(3);aList.add(4);aList.add(5);aList.add(5);
		
		ListIterator<Integer> lIterator=aList.listIterator(aList.size());
		
		while(lIterator.hasPrevious()){
			System.out.println(lIterator.previous());
			
		}
		System.out.println("The number of frequency of 5 is  "+Collections.frequency(aList, 5));
	}
	public static void splitExample(){
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		}  
	}
}
