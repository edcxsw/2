package Test.Negodin;

import org.junit.Assert;
import org.junit.Test;

import Calculation.Arithmetics;

public class TestArithmetics {

	@Test
	public void testAdd() {
		Arithmetics a = new Arithmetics();
		double res = a.add(5, 7);
		if (res != 12)
			Assert.fail();
	}

	@Test
	public void testDeduct() {
		Arithmetics a = new Arithmetics();
		double res = a.deduct(9, 4);
		if (res != 5)
			Assert.fail();
	}

	@Test
	public void testMult() {
		Arithmetics a = new Arithmetics();
		double res = a.mult(5, 3);
		if (res != 15)
			Assert.fail();
	}

	@Test
	public void testDiv() {
		Arithmetics a = new Arithmetics();
		double res = a.div(18, 9);
		if (res != 2)
			Assert.fail();
	}

}
