package Test.Lobanov;

import org.junit.Assert;
import org.junit.Test;

import Calculation.Arithmetics;

public class TestArithmetics {

	@Test
	public void testAdd() {
		Arithmetics a = new Arithmetics();
		double res = a.add(4, 7);
		if (res != 11)
			Assert.fail();
	}

	@Test
	public void testDeduct() {
		Arithmetics a = new Arithmetics();
		double res = a.deduct(12, 4);
		if (res != 8)
			Assert.fail();
	}

	@Test
	public void testMult() {
		Arithmetics a = new Arithmetics();
		double res = a.mult(3, 3);
		if (res != 9)
			Assert.fail();
	}

	@Test
	public void testDiv() {
		Arithmetics a = new Arithmetics();
		double res = a.div(15, 5);
		if (res != 3)
			Assert.fail();
	}

}
