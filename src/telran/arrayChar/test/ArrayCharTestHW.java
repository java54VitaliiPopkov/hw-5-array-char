package telran.arrayChar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.arrayChar.ArrayCharHW;

class ArrayCharTestHW {
	@DisplayName("test of the method countTest")
	@Test
	void countTest() {
		char[] ar1 = { 'H', 'e', 'l', 'l', 'o' };
		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);
		assertEquals(1, arrayChar1.count('e'));
		assertEquals(2, arrayChar1.count('l'));
		assertEquals(0, new ArrayCharHW(new char[] { 'T', 'e', 'l', 'R', 'a', 'n' }).count('r'));
	}

	@DisplayName("test of the method compareToIgnporeCase")
	@Test
	void compareToIgnporeCase() {
		char[] ar1 = { 'H', 'e', 'l', 'l', 'O' };
		char[] ar2 = { 'W', 'o', 'r', 'l', 'd' };
		char[] ar3 = { 'H', 'e', 'l', 'l', 'O' };
		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);
		ArrayCharHW arrayChar2 = new ArrayCharHW(ar2);
		ArrayCharHW arrayChar3 = new ArrayCharHW(ar3);

		assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar3));
		assertEquals(0, new ArrayCharHW(new char[] { 'h', 'e', 'l', 'l', 'o' }).compareToIgnoreCase(arrayChar3));
		assertFalse(arrayChar1.compareToIgnoreCase(arrayChar2) == 0);
	}

	@DisplayName("test of the method indexOf")
	@Test
	void indexOfTest() {
		char[] ar1 = { '1', '2', '3', '2' };

		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);

		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('4'));

	}

	@DisplayName("test of the method contains")
	@Test
	void containsTest() {
		char[] ar1 = { 'H', 'e', 'l', 'l', 'o' };

		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);

		assertTrue(arrayChar1.contains('H'));
		assertFalse(arrayChar1.contains('n'));
		assertFalse(new ArrayCharHW(new char[] {}).contains('o'));

	}

	@DisplayName("test of the method equals")
	@Test
	void equalsTest() {
		char[] ar1 = { 'H', 'e', 'l', 'l', 'o' };
		char[] ar2 = { 'H', 'e', 'l', 'l', 'o' };
		char[] ar3 = { 'W', 'o', 'r', 'l', 'd' };

		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);
		ArrayCharHW arrayChar2 = new ArrayCharHW(ar2);
		ArrayCharHW arrayChar3 = new ArrayCharHW(ar3);

		assertTrue(arrayChar1.equals(arrayChar2));
		assertFalse(arrayChar1.equals(arrayChar3));
		assertTrue(new ArrayCharHW(new char[] {}).equals(new ArrayCharHW(new char[] {})));

	}

	@DisplayName("test of the method equlsIgnoreCase")
	@Test
	void equlsIgnoreCaseTest() {
		char[] ar1 = { 'H', 'e', 'l', 'l', 'o' };
		char[] ar2 = { 'h', 'E', 'L', 'L', 'O' };
		char[] ar3 = { 'W', 'o', 'r', 'l', 'd' };

		ArrayCharHW arrayChar1 = new ArrayCharHW(ar1);
		ArrayCharHW arrayChar2 = new ArrayCharHW(ar2);
		ArrayCharHW arrayChar3 = new ArrayCharHW(ar3);

		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar3));
		assertTrue(new ArrayCharHW(new char[] { 'H', 'e', 'l', 'l', 'o' })
				.equalsIgnoreCase(new ArrayCharHW(new char[] { 'H', 'e', 'l', 'l', 'o' })));
		assertTrue(new ArrayCharHW(new char[] {}).equalsIgnoreCase(new ArrayCharHW(new char[] {})));

	}

}
