package com.example.AWS_Deploy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorUtilsTest {
	static CalculatorUtils cu;
	@BeforeAll
	static void createObject()
	{
		System.out.println("Object created before running all test method");
	 cu=new CalculatorUtils();
	}
	@BeforeEach
	void print() {
		System.out.println("Running print function before running each test method");
	}
	@Test
	void test1() {
		boolean result=cu.isPrime(5); 
		  assertEquals(true, result);
		}
	
	@Test
	void test2() {
		assertEquals(null, cu.reverseString(null),"Return failed");	
	}
	
	@Test
	void test3() {
		
		assertEquals("fedcba", cu.reverseString("abcdef"),"The reversed String Function failed");
	}
	@Test
	void test4(){
		 assertThrows(IllegalArgumentException.class, () -> cu.divide(10, 0),"Divide by zero allowed by mistake");
	}
	@Test
	void test5(){
		
		assertEquals(2, cu.divide(10, 5), "Division Failed");
	}
}
