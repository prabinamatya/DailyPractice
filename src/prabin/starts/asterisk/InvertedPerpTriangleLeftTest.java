package prabin.starts.asterisk;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InvertedPerpTriangleLeftTest {
	InvertedPerpTriangleLeft testObject;
	
	@Before
	public void setup(){
		testObject = new InvertedPerpTriangleLeft();
	}

	@Test
	public void test() {
//		testObject.makeLeftInvertedTriangle(10);
	}
	
	@Test
	public void testRightInverted() throws Exception {
//		testObject.makeRightInvertedTriangle(10);
	}
	
	@Test
	public void testInvertedPyramid() throws Exception {
//		testObject.makeInvertedPyramid(11);
	}
	
	@Test
	public void testupperLeftHypotenuseTriangle() throws Exception {
//		testObject.upperLeftHypotenuseTriangle(11);
	}
	
	@Test
	public void testupperRightHypotenuseTriangle() throws Exception {
		testObject.upperRightHypotenuseTriangle(11);
	}
}
