package br.com.playing;

import org.junit.Test;

public class TesteRandomChar {
	@Test
	public void testReturnThreeChar(){
		RandomChar c = new RandomChar();
		System.out.println(c.returnThreeChar());
	}
	@Test
	public void testSubstChar(){
		RandomChar c = new RandomChar();
		String n = c.substChar("?????");
		System.out.println(n);
	}
	@Test
	public void testTestSubstChar(){
		RandomChar c = new RandomChar();
		String n = c.substChar("Test?");
		System.out.println(n);
	}

}
