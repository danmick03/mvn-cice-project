package calcproject;

import static org.junit.Assert.*;

import org.junit.Test;

import calculatorProject.CalcPro;

public class calcTest {
	
	CalcPro cal=new CalcPro();

	@Test
	public void addTest() {
		assertEquals(18,cal.add(12, 6));
	}
	@Test
	public void subTest() {
		assertEquals(15,cal.sub(18, 3));
		
	}
	@Test
	public void modTest() {
		assertEquals(2,cal.mod(12, 5));
		
}
}