package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FacultyTest {
    private Faculty fac;

    @Before
    public void setUp() throws Exception {

         fac = new Faculty();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFacultyName() {
             Assert.assertEquals("Incorrect Faculty name", "Informa tics and Design", fac.getFacultyName());
    }

    @Test
    public void getFacultyColor() {
        Assert.assertEquals("Incorrect Faculty Color", "Red", fac.getFacultyColor());

    }
}