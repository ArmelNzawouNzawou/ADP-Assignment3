package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    Department dept;

    @Before
    public void setUp() throws Exception {

         dept = new Department("", "","","");
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getDeptName() {


       String  deptName = dept.getDeptName();
       assertEquals("Incorrect", "IT Department", "IT Department");

    }

    @Test
    public void getDeptHead() {
        String  deptHead = dept.getDeptHead();
        assertEquals("Incorrect", "DR Kabaso", "DR Kabaso");

    }

    @Test
    public void departmentFunction() {
        dept.departmentFunction();


    }
}