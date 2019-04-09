package Test.Pirogov;

import org.junit.Assert;
import org.junit.Test;

import Calculation.Arithmetics;

public class TestArithmetics {

	@Test
	public void testAdd() {
		Arithmetics a = new Arithmetics();
		double res = a.add(2, 7);
		if (res != 9)
			Assert.fail();
	}

	@Test
	public void testDeduct() {
		Arithmetics a = new Arithmetics();
		double res = a.deduct(5, 0);
		if (res != 5)
			Assert.fail();
	}

	@Test
	public void testMult() {
		Arithmetics a = new Arithmetics();
		double res = a.mult(8, 4);
		if (res != 32)
			Assert.fail();
	}

	@Test
	public void testDiv() {
		Arithmetics a = new Arithmetics();
		double res = a.div(150, 5);
		if (res != 30)
			Assert.fail();
	}

}
