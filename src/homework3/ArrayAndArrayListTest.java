package homework3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

    // declare myArrayAndArrayList which is the object for testing
    ArrayAndArrayList myArrayAndArrayList;

    @BeforeEach
    void setUp() throws Exception {
        // initialize myArrayAndArrayList for testing
        this.myArrayAndArrayList = new ArrayAndArrayList();
    }

    /**
     * Test howMany method in ArrayAndArrayList.
     */
    @Test
    void testHowMany() {
        // element in the array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));

        assertEquals(2, this.myArrayAndArrayList.howMany(array, 3));
        assertEquals(1, this.myArrayAndArrayList.howMany(array, 7));
        assertEquals(1, this.myArrayAndArrayList.howMany(array, 9));

    }

    /**
     * Test findMax method in ArrayAndArrayList.
     */
    @Test
    void testFindMax() {
        // findMax in an nonEmpty array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(9, this.myArrayAndArrayList.findMax(array));

        int[] array2 = {1, 3, 5, 7, 19, 1, 2, 3, 4, 5};
        assertEquals(19, this.myArrayAndArrayList.findMax(array2));

        int[] array3 = {1, 3, 5, 7, 29, 1, 2, 3, 4, 5};
        assertEquals(29, this.myArrayAndArrayList.findMax(array3));

        int[] array4 = {1, 3, 5, 57, 39, 1, 2, 63, 24, 35};
        assertEquals(63, this.myArrayAndArrayList.findMax(array4));

    }

    /**
     * Test maxArray method in ArrayAndArrayList.
     */
    @Test
    void testMaxArray() {
        // test a valid array.
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));

        int[] array2 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5, 9};
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array2));

        int[] array3 = {9, 1, 3, 5, 7, 9, 1, 2, 3, 4, 5, 9};
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array3));

        int[] array4 = {9, 1, 3, 5, 9, 7, 9, 1, 2, 3, 4, 5, 9};
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array4));
    }

    /**
     * Test swapZero method in ArrayAndArrayList.
     */
    @Test
    void testSwapZero() {
        // test an array containing 0
        int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
        int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
        this.myArrayAndArrayList.swapZero(array);
        assertArrayEquals(testArray, array);


        int[] array2 = {1, 1, 0, 2, 5, 3, 0, 5};
        int[] testArray2 = {1, 1, 2, 5, 3, 5, 0, 0};
        this.myArrayAndArrayList.swapZero(array2);
        assertArrayEquals(testArray2, array2);

        int[] array3 = {1, 0, 0, 2, 0, 3, 0, 0};
        int[] testArray3 = {1, 2, 3, 0, 0, 0, 0, 0};
        this.myArrayAndArrayList.swapZero(array3);
        assertArrayEquals(testArray3, array3);

        int[] array4 = {1, 2, 3, 2, 5, 3, 0, 5};
        int[] testArray4 = {1, 2, 3, 2, 5, 3, 5, 0};
        this.myArrayAndArrayList.swapZero(array4);
        assertArrayEquals(testArray4, array4);
    }
}

