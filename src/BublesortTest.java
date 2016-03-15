import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BublesortTest {

	@Test
	public void test_example() {
		int[] array = {5,9,6,45,150,3};
		int[] sortedArray = BubbleSort.bubbleSort(array);
		int[] expectedArray = {3,5,6,9,45,150};
		assertTrue(Arrays.equals(sortedArray, expectedArray  )  );

	}
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testValidInput() {
		int[] array = {2,53,4,Integer.MAX_VALUE};
		//exception.expect(StackOverflowError.class);
		int[] result = BubbleSort.bubbleSort(array);  

	}

}
