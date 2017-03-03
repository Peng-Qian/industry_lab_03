package ictgradschool.industry.lab03.ex05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anhyd on 3/03/2017.
 */
public class TestExerciseFive {

    private ExerciseFive ex;

    @Before
    public void setUp() {
        ex = new ExerciseFive();
    }

    @Test
    public void testGetRow() {

        assertEquals("X X O ", ex.getRow("X X O O X O X O X ", 1));
        assertEquals("O X O ", ex.getRow("X X O O X O X O X ", 2));
        assertEquals("X O X ", ex.getRow("X X O O X O X O X ", 3));

        assertEquals("X O X ", ex.getRow("X O X O X X O O X ", 1));
        assertEquals("O X X ", ex.getRow("X O X O X X O O X ", 2));
        assertEquals("O O X ", ex.getRow("X O X O X X O O X ", 3));

    }

    @Test
    public void testGetLeftDiagonal() {

        assertEquals("X X X", ex.getLeftDiagonal("X X O ", "O X O ", "X O X "));

        assertEquals("X O O", ex.getLeftDiagonal("X X O ", "X O X ", "X X O "));

    }
}
