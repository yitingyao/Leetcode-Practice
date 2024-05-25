import main.TwoSumSolution;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class TwoSumSolutionTest {

    @Test
    public void testTwoSum() {
        TwoSumSolution solution = new TwoSumSolution();
        // Test where the expected indices are 0 and 1 for the sum to match target
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1,2}, solution.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{3, 3}, 6));

        // Additional tests can be added to cover more scenarios
    }
}
