package com.annotationdemo.handler;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.annotationdemo.annotation.Decoration;
import com.annotationdemo.aop.IAop;
import com.annotationdemo.demo.Demo;

public class DecorationHandler {

	public void decorate() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		
		
		try {
			
		
			Class clz = Class.forName("com.annotationdemo.demo.Demo");
			Method[] methods = clz.getDeclaredMethods();
		
			for(Method m : methods){
				
				System.out.println("method is :" + m.toString());
				
				if(m.isAnnotationPresent(Decoration.class)){
					
					Decoration a = m.getAnnotation(Decoration.class);
					System.out.println("the annotation of " + m.toString() + "is:" + a.toString());
					
					String className = a.value();
					
					Class aopClz = Class.forName(className);
					
					Method before = aopClz.getDeclaredMethod("before");
					Method after = aopClz.getDeclaredMethod("after");
					
					
					before.invoke(aopClz.newInstance());
					m.invoke(clz.newInstance());
					after.invoke(aopClz.newInstance());
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
