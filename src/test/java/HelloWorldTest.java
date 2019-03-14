import org.junit.Assert;
import org.junit.Test;
public class HelloWorldTest
{
	@Test
	public  void testMul()
	{
		Assert.assertEquals(HelloWorld.mul(3,4),12);
	}
}
	