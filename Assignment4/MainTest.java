import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testSieveOfEratosthenes() {
		boolean test[] = new boolean[] {true, true, true, true, false, true, true};
		assertArrayEquals(test, Main.sieveOfEratosthenes(6));
	}

}
