package homework4;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class CustomIntegerArrayListTest {

    @Test
    void testGetArrayList() {

        //create a new empty CustomIntegerArrayList
        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(0, 5);
        arr1.add(1, 5);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(0, 5);
        lst1.add(1, 5);
        assertEquals(lst1, arr1.getArrayList());

        ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
        arr4Elements.add(100);
        arr4Elements.add(200);
        arr4Elements.add(500);

        //create a new CustomIntegerArrayList with the elements in the given ArrayList
        CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

        ArrayList<Integer> lst4 = new ArrayList<Integer>();
        lst4.add(100);
        lst4.add(200);
        lst4.add(500);

        assertEquals(lst4, arr4.getArrayList());

        //create a new empty CustomIntegerArrayList
        CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
        arr1.add(3);
        arr1.add(0, 50);
        arr1.add(1, 60);

        ArrayList<Integer> lst5 = new ArrayList<Integer>();
        lst1.add(3);
        lst1.add(0, 50);
        lst1.add(1, 60);
        assertEquals(lst5, arr5.getArrayList());

        //create a new empty CustomIntegerArrayList
        CustomIntegerArrayList arr6 = new CustomIntegerArrayList();
        arr1.add(30);
        arr1.add(0, 5);
        arr1.add(1, 6);

        ArrayList<Integer> lst6 = new ArrayList<Integer>();
        lst1.add(30);
        lst1.add(0, 5);
        lst1.add(1, 6);
        assertEquals(lst5, arr5.getArrayList());

        //create a new empty CustomIntegerArrayList
        CustomIntegerArrayList arr7 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(0, 6);
        arr1.add(1, 4);

        ArrayList<Integer> lst7 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(0, 6);
        lst1.add(1, 4);
        assertEquals(lst5, arr5.getArrayList());
    }

    @Test
    void testGet() {
        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(0, 5);
        arr1.add(1, 5);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(0, 5);
        lst1.add(1, 5);

        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));
        assertEquals((Integer)lst1.get(1), (Integer)arr1.get(1));
        assertEquals((Integer)lst1.get(2), (Integer)arr1.get(2));

        arr1.add(5);
        lst1.add(5);
        assertEquals((Integer)lst1.get(3), (Integer)arr1.get(3));

        arr1.add(6);
        arr1.add(7);
        lst1.add(6);
        lst1.add(7);
        assertEquals((Integer)lst1.get(5), (Integer)arr1.get(5));
        assertEquals((Integer)lst1.get(4), (Integer)arr1.get(4));
    }

    @Test
    void testAddInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));
        assertEquals((Integer)lst1.get(1), (Integer)arr1.get(1));
        assertEquals((Integer)lst1.get(2), (Integer)arr1.get(2));

        arr1.add(5);
        lst1.add(5);
        assertEquals((Integer)lst1.get(3), (Integer)arr1.get(3));

        arr1.add(6);
        lst1.add(6);
        assertEquals((Integer)lst1.get(4), (Integer)arr1.get(4));

        arr1.add(7);
        lst1.add(7);
        assertEquals((Integer)lst1.get(5), (Integer)arr1.get(5));
    }

    @Test
    void testAddIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 4);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);

        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));
        assertEquals((Integer)lst1.get(1), (Integer)arr1.get(1));
        assertEquals((Integer)lst1.get(2), (Integer)arr1.get(2));

        arr1.add(1, 3);
        lst1.add(1, 3);
        assertEquals((Integer)lst1.get(3), (Integer)arr1.get(3));

        arr1.add(2, 4);
        lst1.add(2, 4);
        assertEquals((Integer)lst1.get(4), (Integer)arr1.get(4));

        arr1.add(3, 5);
        lst1.add(3, 5);
        assertEquals((Integer)lst1.get(5), (Integer)arr1.get(5));
    }

    @Test
    void testRemoveInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 4);
        arr1.remove(0);
        arr1.remove(1);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);
        lst1.remove(0);
        lst1.remove(1);

        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));

        lst1.add(0, 3);
        lst1.add(1, 4);
        lst1.add(2, 5);
        arr1.add(0,3);
        arr1.add(1, 4);
        arr1.add(2, 5);

        lst1.remove(2);
        arr1.remove(2);
        assertEquals((Integer)lst1.get(2), (Integer)arr1.get(2));

        lst1.remove(1);
        arr1.remove(1);
        assertEquals((Integer)lst1.get(1), (Integer)arr1.get(1));

        lst1.remove(0);
        arr1.remove(0);
        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));
    }

    @Test
    void testRemoveIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 4);
        arr1.remove(3, 3);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);
        assertEquals(lst1, arr1.getArrayList());

        arr1.add(0, 4);
        arr1.add(0, 4);
        arr1.add(0, 4);
        lst1.add(0, 4);
        arr1.remove(2, 4);
        assertEquals(lst1, arr1.getArrayList());

        arr1.add(0, 7);
        arr1.add(0, 7);
        arr1.add(0, 7);
        lst1.add(0, 7);
        arr1.remove(2, 7);
        assertEquals(lst1, arr1.getArrayList());

        arr1.add(3, 8);
        arr1.add(3, 8);
        arr1.add(3, 8);
        arr1.remove(3, 8);
        assertEquals(lst1, arr1.getArrayList());

    }

    @Test
    void testSpliceIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.splice(3, 2);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        assertEquals((Integer)lst1.get(0), (Integer)arr1.get(0));
        assertEquals((Integer)lst1.get(1), (Integer)arr1.get(1));
        assertEquals((Integer)lst1.get(2), (Integer)arr1.get(2));

    }

    @Test
    void testSpliceIntIntIntArray() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.splice(3, 1, new int[] { 4, 5 });

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(4);
        lst1.add(5);
        lst1.add(6);

        assertEquals(lst1, arr1.getArrayList());
    }
}
