import org.junit.Assert;
import org.junit.Test;
public class HelloWorldTest
{
	@Test
	public  void testAdd()
	{
		Assert.assertEquals(HelloWorld.add(3,4),7);
	}
}
	