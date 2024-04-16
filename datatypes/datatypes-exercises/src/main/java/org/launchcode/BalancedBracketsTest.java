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
    String message1 = "a string with balanced brackets at its beginning and end returns true";
    public void testBalancedBracketsAtBeginningAndEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]", message1));
    }

    @Test
    String message2 = "a string with balanced brackets within the string itself returns true";
    public void testBalancedBracketsInMiddleReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]", message2));
    }

    @Test
    String message3 = "a string proceeded by balanced brackets returns true";
    public void testBalancedBracketsAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode", message3));
    }

    @Test
    String message4 = "an empty string returns true";
    public void testEmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), message4);
    }

    @Test
    String message5 = "a single set of balanced brackets returns true";
    public void testOnlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]", message5));
    }

    @Test
    String message6 = "a string with nested balanced brackets returns true";
    public void testNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]", message6));
    }

    @Test
    String message7 = "a string with unbalanced brackets in the wrong order within the string itself returns false";
    public void testUnbalancedBracketsAtEndReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[", message7));
    }

    @Test
    String message8 = "a single opening unbalanced bracket returns false";
    public void testSingleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[", message8));
    }

    @Test
    String message9 = "a single closing unbalanced bracket returns false";
    public void testSingleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]", message9));
    }

    @Test
    String message10 = "a string containing only an opening unbalanced bracket returns false";
    public void testOnlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode", message10));
    }

    @Test
    String message11 = "a string containing only a closing unbalanced bracket returns false";
    public void testOnlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]", message11));
    }

    @Test
    String message12 = "unbalanced brackets in the wrong order returns false";
    public void testMismatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][", message12));
    }
}