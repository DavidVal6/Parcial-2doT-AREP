package edu.eci.arep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class CollatzTest {
    @Test
    public void shouldMakeCollatzRight(){
        CollatzMader collatz = new CollatzMader(13);
        collatz.makeCollatz();
        ArrayList<Integer> ans = collatz.getCollatzResult();
        assertEquals(10,ans.size());
    }
}
