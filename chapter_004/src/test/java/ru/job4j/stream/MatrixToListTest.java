package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixToListTest {
    @Test
    public void testMatrixToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, new MatrixToList().matrixToList(matrix));
    }

}