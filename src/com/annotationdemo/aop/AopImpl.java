package com.annotationdemo.aop;

public class AopImpl implements IAop {

	@Override
	public void before() {
		
		System.out.println("aopimpl before...............");
		
	}

	@Override
	public void after() {
		System.out.println("aopimpl after...............");
		
	}

}
