package Test.Hramov;

import org.junit.Assert;
import org.junit.Test;

import Calculation.Arithmetics;

public class TestArithmetics {
	
	@Test
	public void testAdd() {
		Arithmetics a=new Arithmetics();
		double res = a.add(3, 7);
		if (res !=10)Assert.fail();
	}
	
	@Test
	public void testDeduct() {
		Arithmetics a=new Arithmetics();
		double res = a.deduct(8, 4);
		if (res !=4)Assert.fail();
	}
	
	@Test
	public void testMult() {
		Arithmetics a=new Arithmetics();
		double res = a.mult(7, 3);
		if (res !=21)Assert.fail();
	}
	
	@Test
	public void testDiv() {
		Arithmetics a=new Arithmetics();
		double res = a.div(10, 5);
		if (res !=2)Assert.fail();
	}

}
