import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LabTest {

	@Test
	void prime() {
		assertEquals(PrimeNumber.findPrime(1), 2);
	}
	
	@Test
	void prime1() {
		assertEquals(PrimeNumber.findPrime(2), 3);
	}
	
	@Test
	void prime2() {
		assertEquals(PrimeNumber.findPrime(3), 5);
	}
	
	@Test
	void prime3() {
		assertEquals(PrimeNumber.findPrime(4), 7);
	}
}


