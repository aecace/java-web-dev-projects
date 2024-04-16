package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testOnlyBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testStringBookendedWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testBalancedBracketsWithinStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBalancedBracketsProceedingStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void testLoneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testLoneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testUnbalancedBracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testLoneOpeningBracketWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testLoneClosingBracketWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void testUnbalancedBracketsWithinStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

}