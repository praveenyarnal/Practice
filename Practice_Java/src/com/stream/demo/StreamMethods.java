package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream() method is default method in Collection interface
public class StreamMethods {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,1,5,6,7);
		
		// DISTICT method will return the distinct object stream 
		Stream<Integer> distinctValues= values.stream().distinct();
		
		//FOREACH method will be used as iterator for a stream object.
		System.out.println("-----------------DISTINCT--------------------------------------");
		//distinctValues.forEach(i->System.out.println(i));
		
		// FILTER method will return the filtered stream object. 	
		// For instance finding the values which are divisible by 2
		System.out.println("-----------------FILTER--------------------------------------");
		values.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		//MAP
		System.out.println("-----------------MAP--------------------------------------");
		values.stream().map(i->i*2).forEach(i->System.out.println(i));
		
		//REDUCE
		System.out.println("-----------------REDUCE--------------------------------------");
		int reducedValue=values.stream().reduce(0, (carry,elem)-> carry+elem);
		System.out.println("The reduced value is"+ reducedValue);

		
	}
}
