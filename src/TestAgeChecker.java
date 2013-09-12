import static org.junit.Assert.*;
import org.junit.Test;
public class TestAgeChecker {

	AgeChecker tester = new AgeChecker();
	
	@Test
	public void testVerifyAgeRestrictionTrue() {
		boolean result = tester.verifyLegalAge(1987);
		assertTrue(result);
	}
	
	@Test
	public void testVerifyAgeRestrictionFalse() {
		boolean result = tester.verifyLegalAge(2008);
		assertFalse(result);
	}
	
	@Test
	public void testConcatenateNames() {
		String result = tester.concatenateNames("Shannon", "Polches");
		assertEquals(result, "Shannon Polches");
	}

}
