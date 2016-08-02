package com.annotationdemo.demo;

import com.annotationdemo.annotation.Decoration;

public class Demo implements IDemo {

	@Decoration("com.annotationdemo.aop.AopImpl")
	public void doSomething(){
		
		System.out.println("demo doSomething......");
		
	}

}
