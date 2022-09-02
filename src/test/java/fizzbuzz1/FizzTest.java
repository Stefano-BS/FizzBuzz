package fizzbuzz1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzTest {

	@Test
	void test3divetaFizz() {
		assertEquals(Fizz.fizzbuzz(3), "Fizz");
	}
	
	@Test
	void test5divetaBuzz() {
		assertEquals(Fizz.fizzbuzz(5), "Buzz");
	}
	
	@Test
	void test13resta13() {
		assertEquals(Fizz.fizzbuzz(13), "13");
	}
	
	@Test
	void test15diventaFizzBuzz() {
		assertEquals(Fizz.fizzbuzz(15), "FizzBuzz");
	}
	
	@Test
	void test35diventaBuzz() {
		assertEquals(Fizz.fizzbuzz(35), "Buzz");
	}

	@Test
	void test33diventaFizz() {
		assertEquals(Fizz.fizzbuzz(33), "Fizz");
	}
	
	@Test
	void testLunghezza() {
		assertEquals(Fizz.valori(1, 100).length, 100);
	}

}
