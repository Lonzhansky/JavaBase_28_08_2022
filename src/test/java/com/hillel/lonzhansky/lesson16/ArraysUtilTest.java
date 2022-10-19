package com.hillel.lonzhansky.lesson16;

import com.hillel.loznhansky.lessons.lesson16.main.ArraysUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilTest {

    static int[] array;

    @BeforeAll
    public static void beforeAll() {
        array = new int[] {4, 65, 7, 3};
    }

    @Disabled("it will be fix soon")
    @Test
    public void test2() {
        int index = ArraysUtil.getIndexElementInArray(new int[] {1, 2, 3, 4}, 232);
        assertEquals(1, index);
    }

    @BeforeEach
    public void beforeEach() {
        array = new int[] {4, 65, 7, (int) (Math.random() * 10)};
    }

    @Test
    public void test1() {
        assertTrue(ArraysUtil.getIndexElementInArray(new int[] {1, 2, 3, 4}, 3) == 2);
    }


    @Test
    public void test3() {
        int index = ArraysUtil.getIndexElementInArray(new int[] {}, 2);
        assertEquals(-2, index);
    }

    @Test
    public void test4() {
        int index = ArraysUtil.getIndexElementInArray(null, 2);
        assertEquals(-3, index);
    }

    @Test
    public void test5() {
        int index = ArraysUtil.getIndexElementInArray(null, 2);
        assertTrue(index == -3);
    }


}
