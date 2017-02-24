package com.gatto.tdd.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsConverterTest {

	@Test
	public void mustUnderstandSymbolI() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("I");
		assertEquals(1, number);
	}

	@Test
	public void mustUnderstandSymbolV() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("V");
		assertEquals(5, number);
	}

	@Test
	public void mustUnderstandTwoSymbolsII() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("II");
		assertEquals(2, number);
	}

	@Test
	public void mustUnderstandFourSymbolsTwoByTwoXXII() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("XXII");
		assertEquals(22, number);
	}

	@Test
	public void mustUnderstandSymbolIX() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("IX");
		assertEquals(9, number);
	}

	@Test
	public void mustUnderstandComplexesNumbersXXIV() {
		RomanNumeralsConverter rnc = new RomanNumeralsConverter();
		int number = rnc.convert("XXIV");
		assertEquals(24, number);
	}

}
