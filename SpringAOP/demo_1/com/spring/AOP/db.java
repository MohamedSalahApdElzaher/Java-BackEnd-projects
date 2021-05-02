package com.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class db {
	
	@Pointcut("execution(public * com.spring.dao.*.*(..))")
	public void pointCut() {}
	
	@Pointcut("execution(public * com.spring.dao.*.NOtSelected())")
	public void notSelected() {}
	
	@Pointcut("execution(public * com.spring.dao.*.*())")
	public void hi() {}

	
//	@Before("execution(void allposts())")
//	public void connect() {
//		System.out.println("connected");
//	}
	
//	@Before("execution(* allposts())")
//	public void connect() {
//		System.out.println("connected");
//	}
	
//	@Before("execution(* all*())")
//	public void connect() {
//		System.out.println("connected");
//	}
	
//	@Before("execution(* all*(..))")
//	public void connect() {
//		System.out.println("connected");
//	}
	
//	@Before("pointCut() && !notSelected()")
//	public void connect() {
//		System.out.println("connected");
//	}
//	
//	@Before("notSelected()")
//	public void not_selec() {
//		System.out.println("not selected");
//	}
	
	@After("hi()")
	public void sayHi() {
		System.out.println("After saying hi :)");
	}
	
	@AfterReturning("hi()")
	public void sayHi2() {
		System.out.println("Afterreturing saying hi :)");
	}
	
	@AfterThrowing("pointCut()")
	public void getThrow() {
		System.out.println("After Throwing Exception");
	}

}
