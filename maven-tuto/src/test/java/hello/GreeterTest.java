package hello;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();
	
	@Test
	public void asseertEvidence() {
		Assert.assertTrue(3 == 1+2);
	}
	
	@Test
	public void greeterSaysHello() {
		Assert.assertTrue(greeter.sayHello().contains("Hello"));
	}

	@Test
	public void greeterSaysHello2() {
		Assert.assertThat(greeter.sayHello(), CoreMatchers.containsString("Hello"));
	}
}
