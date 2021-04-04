package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesTest {
    @Test
    public void test_uniqueArray() throws Exception {

        // "Empty array should return an empty array."
        int[] emptyArray = new int[0];
        assertArrayEquals(new int[0], RemoveDuplicates.unique(emptyArray));

        // "One value should return that value in array."
        int[] singleValArr = new int[]{-1};
        assertArrayEquals(new int[]{-1}, RemoveDuplicates.unique(singleValArr));

        // "Multiple values should return in same order as given."
        int[] multipleValsInOrder = new int[]{-1, 5, 10, -100, 3, 2};
        assertArrayEquals(new int[]{-1, 5, 10, -100, 3, 2}, RemoveDuplicates.unique(multipleValsInOrder));

        // "Duplicates should be removed and in the order first seen." do
        int[] duplicatesInOrder1 = new int[]{1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{1, 2, 3}, RemoveDuplicates.unique(duplicatesInOrder1));
        int[] duplicatesInOrder2 = new int[]{1, 3, 2, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{1, 3, 2}, RemoveDuplicates.unique(duplicatesInOrder2));
        int[] duplicatesInOrder3 = new int[]{3, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{3, 2, 1}, RemoveDuplicates.unique(duplicatesInOrder3));
    }
}