import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook s1, s2;
	
	@BeforeEach
	void setUp() throws Exception {
		s1 = new GradeBook(5);
		s2 = new GradeBook(5);
		
		s1.addScore(1);
		s1.addScore(2);
		s1.addScore(3);
		s1.addScore(4);
		
		s2.addScore(10);
		s2.addScore(15);
		s2.addScore(20);
		s2.addScore(25);
	}

	@AfterEach
	void tearDown() throws Exception {
		s1 = s2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals(true,s1.addScore(5.0));
		assertEquals(true,s2.addScore(5.0));
	}

	@Test
	void testSum() {
		assertEquals(10.0,s1.sum(),.001);
		assertEquals(70.0,s2.sum(),.001);
	}

	@Test
	void testMinimum() {
		assertEquals(1.0,s1.minimum(),.001);
		assertEquals(10.0,s2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(9.0,s1.finalScore(),.001);
		assertEquals(60.0,s2.finalScore(),.001);
	}

	@Test
	void testToString() {
		assertTrue(s1.toString().contains("Grade List: 1.0 2.0 3.0 4.0"));
		assertTrue(s2.toString().contains("Grade List: 10.0 15.0 20.0 25.0"));
	}
}
