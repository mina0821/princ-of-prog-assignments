package cs2s03;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cs2s03.ListChar;
import cs2s03.StackChar;
import cs2s03.SnocQueue;
import cs2s03.AListPQueue;

public class TestingA4 {
	//  ListChar, StackChar, SnocQueue, AListPQueue
	//10 scenarios
	//3 sc throw exceptions
	//3 sc have 15 (or more) operations
	//4 sc random
	private static ListChar lc;
	private static StackChar sc;
	private static SnocQueue sq;
	private static AListPQueue pq;
	
	@Before
	public void setUp() {
		lc = new ListChar();
		sc = new StackChar();
		sq = new SnocQueue();
		pq = new AListPQueue();
	}

	@Test
	public void test1() {
		//at least 15 operations
		
		//ListChar.java
		for(char al='a';al<='s';al++){
			lc.push(al);
		}
		assertEquals(lc.toString(),"srqponmlkjihgfedcba");
		
		//StackChar.java
		for(char al='a';al<='s';al++){
			sc.push(al);
		}
		assertEquals(sc.toString(),"srqponmlkjihgfedcba");
		
		//SnocQueue.java
		for(char al='a';al<='s';al++){
			sq.enqueue(al);
		}
		assertEquals(sq.toString(),"abcdefghijklmnopqrs");
		
		//AListPQueue.java
		for(char al='a';al<='o';al++){
			pq.insertItem(1, al);
		}
		pq.insertItem(2, 'z');
		pq.insertItem(3, 'x');
		pq.insertItem(4, 'y');
		assertEquals(pq.toString(),"4y 3x 2z 1o 1n 1m 1l 1k 1j 1i 1h 1g 1f 1e 1d 1c 1b 1a");
		
	}
	
	@Test
	public void test2() {
		//at least 15 operations
		
		//ListChar.java
		for(char al='a';al<='i';al++){
			lc.push(al);
		}
		for(int i=0;i<7;i++){
			lc.pop();
		}
		assertEquals(lc.toString(),"ba");
		
		//StackChar.java
		for(char al='a';al<='i';al++){
			sc.push(al);
		}
		for(int i=0;i<7;i++){
			sc.pop();
		}
		assertEquals(sc.toString(),"ba");
		
		//SnocQueue.java
		for(char al='a';al<='i';al++){
			sq.enqueue(al);
		}
		for(int i=0;i<7;i++){
			sq.dequeue();
		}
		assertEquals(sq.toString(),"hi");
		
		//AListPQueue.java
		for(char al = 'a';al<='i';al++){
			pq.insertItem(5, al);
		}
		for(int i=0;i<7;i++){
			pq.deleteItem();
		}
		pq.insertItem(2, 'z');
		pq.insertItem(3, 'x');
		pq.insertItem(4, 'y');
		assertEquals(pq.toString(),"5b 5a 4y 3x 2z");
		
	}
	
	@Test
	public void test3() {
		//at least 15 operations
		
		//ListChar.java
		for(char al='a';al<='r';al++){
			lc.push(al);
		}
		for(int i=0;i<3;i++){
			lc.pop();
		}
		assertEquals(lc.toString(),"onmlkjihgfedcba");
		
		//StackChar.java
		for(char al='a';al<='r';al++){
			sc.push(al);
		}
		for(int i=0;i<3;i++){
			sc.pop();
		}
		assertEquals(sc.toString(),"onmlkjihgfedcba");
		
		//StackChar.java
		for(char al='a';al<='r';al++){
			sq.enqueue(al);
		}
		for(int i=0;i<3;i++){
			sq.dequeue();
		}
		assertEquals(sq.toString(),"defghijklmnopqr");
		
		//AListPQueue.java
		for(char al='a';al<='o';al++){
			pq.insertItem(1, al);
		}
		for(int i=0;i<3;i++){
			pq.deleteItem();
		}
		pq.insertItem(2, 'z');
		pq.insertItem(3, 'x');
		pq.insertItem(4, 'y');
		assertEquals(pq.toString(),"4y 3x 2z 1l 1k 1j 1i 1h 1g 1f 1e 1d 1c 1b 1a");
		
	}

	
	@Test
	public void test4() {
		//test for exceptions
		
		//ListChar.java
		try {
			lc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//StackChar.java
		try {
			sc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//SnocQueue.java
		try {
			sq.peek();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//AListPQueue.java
		try {
			pq.next();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
	}
	
	@Test
	public void test5() {
		//test for exceptions
		
		//ListChar.java
		lc.push('c');
		lc.pop();
		try {
			lc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//StackChar.java
		sc.push('c');
		sc.pop();
		try {
			sc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//SnocQueue.java
		sq.enqueue('c');
		sq.dequeue();
		try {
			sq.peek();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//AListPQueue.java
		pq.insertItem(1, 'c');
		pq.deleteItem();
		try {
			pq.next();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
	}
	
	@Test
	public void test6() {
		//test for exceptions
		
		//ListChar.java
		for(char al='a';al<='i';al++){
			lc.push(al);
		}
		for(int i=0;i<9;i++){
			lc.pop();
		}
		try {
			lc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//StackChar.java
		for(char al='a';al<='i';al++){
			sc.push(al);
		}
		for(int i=0;i<9;i++){
			sc.pop();
		}
		try {
			sc.top();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//SnocQueue.java
		for(char al='a';al<='i';al++){
			sq.enqueue(al);
		}
		for(int i=0;i<9;i++){
			sq.dequeue();
		}
		try {
			sq.peek();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		//AListPQueue.java
		for(char al='a';al<='i';al++){
			pq.insertItem(4, 'c');
		}
		for(int i=0;i<9;i++){
			pq.deleteItem();
		}
		try {
			pq.next();
			Assert.fail("Expected exception to be thrown");
		} catch (EmptyContainerException e) {
			assertThat(e.error(),containsString("empty"));
		}
		
		
	}
	
	@Test
	public void test7() {
		//random
		
		//ListChar.java
		assertTrue(lc.isEmpty());
		
		//StackChar.java
		assertTrue(sc.isEmpty());
		
		//SnocQueue.java
		assertTrue(sq.isEmpty());
		
		//AListPQueue.java
		assertTrue(pq.isEmpty());
		
	}
	
	@Test
	public void test8() {
		//random
		
		//ListChar.java
		lc.push('c');
		assertTrue(lc.isEmpty()==false);
		
		//StackChar.java
		sc.push('c');
		assertTrue(sc.isEmpty()==false);
		
		//SnocQueue.java
		sq.enqueue('c');
		assertTrue(sq.isEmpty()==false);
		
		//AListPQueue.java
		pq.insertItem(4, 'c');
		assertTrue(pq.isEmpty()==false);
		
	}
	
	@Test
	public void test9() {
		//random
		
		//ListChar.java
		lc.push('c');
		lc.pop();
		assertTrue(lc.isEmpty());
		
		//StackChar.java
		sc.push('c');
		sc.pop();
		assertTrue(sc.isEmpty());
		
		//SnocQueue.java
		sq.enqueue('c');
		sq.dequeue();
		assertTrue(sq.isEmpty());
		
		//AListPQueue.java
		pq.insertItem(4, 'c');
		pq.deleteItem();
		assertTrue(pq.isEmpty());
		
	}
	
	@Test
	public void test10() {
		//random 
		
		//ListChar.java
		ListChar noneLc = new ListChar();
		assertTrue(lc.equals(noneLc));
		
		//StackChar.java
		StackChar noneSc = new StackChar();
		assertTrue(sc.equals(noneSc));
		
		//SnocQueue.java
		SnocQueue noneSq = new SnocQueue();
		assertTrue(sq.equals(noneSq));
		
		//AListPQueue.java
		AListPQueue nonepq = new AListPQueue();
		assertTrue(pq.equals(nonepq));
		
	}

}
