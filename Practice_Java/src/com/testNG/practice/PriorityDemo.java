package com.testNG.practice;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test()
	public void c_method(){
		System.out.println("I'm in method C without any priority mentioned");
	}
	@Test()
	public void b_method(){
		System.out.println("I'm in method Bwithout any priority mentioned");
	}
	@Test(priority=6)
	public void a_method(){
		System.out.println("I'm in method A");
	}
	@Test(priority=0)
	public void e_method(){
		System.out.println("I'm in method E");
	}
	@Test(priority=6)
	public void d_method(){
		System.out.println("I'm in method D");
	}
}
//Output
//b,c,e,a,d

/*First preference: Non-prioritized methods: ‘c’ and ‘b’: Based on alphabetical order ‘b’ was executed first and then ‘c’.

Second preference: Prioritized methods: ‘a’, ‘e’ and ‘d’: ‘e’ was executed first as it was having highest priority(0). 
As the priority of ‘a’ and ‘d’ methods were same, testng considered the alphabetical order of their methods names. 
So, between them, ‘a’ was executed first and then ‘d’.
*/