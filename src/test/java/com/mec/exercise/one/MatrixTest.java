package com.mec.exercise.one;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by javierbracerotorres on 16/10/2016.
 */
public class MatrixTest {
    Matrix instance;

    @Test
    public void testEmptyMatrix() {
        instance = new Matrix(new ArrayList<>(), 'A', 0);
        assertEquals(0, instance.execute());
    }

    @Test
    public void testAllTheSame() {
        ArrayList<Character> characters = new ArrayList<Character>() {{
            add('A');
            add('A');
            add('A');
            add('A');
            add('A');
            add('A');
        }};

        instance = new Matrix(characters, 'A', 3);
        assertEquals(6, instance.execute());
    }

    @Test
    public void testCharacterNotFound() {
        ArrayList<Character> characters = new ArrayList<Character>() {{
            add('A');
            add('B');
            add('C');
            add('D');
            add('E');
            add('F');
        }};

        instance = new Matrix(characters, 'Z', 3);
        assertEquals(0, instance.execute());
    }

    @Test
    public void testA() {
        instance = new Matrix(getCharacters(), 'A', 7);
        assertEquals(4, instance.execute());
    }

    @Test
    public void testB() {
        instance = new Matrix(getCharacters(), 'B', 7);
        assertEquals(6, instance.execute());
    }

    @Test
    public void testC() {
        instance = new Matrix(getCharacters(), 'C', 7);
        assertEquals(6, instance.execute());
    }

    @Test
    public void testD() {
        instance = new Matrix(getCharacters(), 'D', 7);
        assertEquals(5, instance.execute());
    }

    @Test
    public void testE() {
        instance = new Matrix(getCharacters(), 'E', 7);
        assertEquals(3, instance.execute());
    }

    @Test
    public void testF() {
        instance = new Matrix(getCharacters(), 'F', 7);
        assertEquals(4, instance.execute());
    }

    private ArrayList<Character> getCharacters() {
        return new ArrayList<Character>() {{
            add('A');
            add('C');
            add('A');
            add('F');
            add('F');
            add('F');
            add('F');
            add('A');
            add('C');
            add('C');
            add('C');
            add('C');
            add('E');
            add('E');
            add('A');
            add('D');
            add('D');
            add('A');
            add('C');
            add('E');
            add('D');
            add('B');
            add('B');
            add('B');
            add('A');
            add('A');
            add('A');
            add('D');
            add('A');
            add('B');
            add('B');
            add('B');
            add('D');
            add('D');
            add('D');
        }};
    }


}
