import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    /*
     * Test Principles:
     * 
     * - Both inputs are valid non-negative integers.
     *      
     * - At least one input is "0".
     *      
     * - Inputs have different lengths.
     *
     * - Extremely large results.
     */

    /**
     * Test two small numbers.
     */
    @Test
    void testSmallNumbers() {
        Solution12 multiplier = new Solution12();
        assertEquals("6", multiplier.multiply("2", "3"));
    }

    /**
     * Test two big numbers.
     */
    @Test
    void testBigNumbers() {
        Solution12 multiplier = new Solution12();
        assertEquals("56088", multiplier.multiply("123", "456"));
    }

    /**
     * Test one 0.
     */
    @Test
    void testZeroMultiplier() {
        Solution12 multiplier = new Solution12();
        assertEquals("0", multiplier.multiply("0", "9999"));
    }

    /**
     * Test two 0.
     */
    @Test
    void testBothZeroMultiplier() {
        Solution12 multiplier = new Solution12();
        assertEquals("0", multiplier.multiply("0", "0"));
    }

    /**
     * Test different length numbers.
     */
    @Test
    void testDifferentLengthMultiplier() {
        Solution12 multiplier = new Solution12();
        assertEquals("8369910", multiplier.multiply("12345", "678"));
    }

    /**
     * Test max boundary.
     */
    @Test
    void testMaxBoundary() {
        Solution12 multiplier = new Solution12();
        assertEquals("999999998000000001", multiplier.multiply("999999999", "999999999"));
    }
}