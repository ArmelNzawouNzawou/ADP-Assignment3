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

         fac = new Faculty("","");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFacultyName() {
        String Name = fac.getFacultyName();
        Assert.assertEquals("Incorrect", "Informatics and Design", "Informatics and Design");
}

    @Test
    public void getFacultyColor() {
        String Name = fac.getFacultyColor();
        Assert.assertEquals("Incorrect", "Red", "Red");
    }

    @Test
    public void termDates() {
        fac.termDates();
    }

}