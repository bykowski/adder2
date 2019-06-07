package pl.bykowski.adder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add() {
        Adder adder = new Adder();
        int result = adder.add(10, 10);
        Assert.assertEquals(20, result);
    }
}