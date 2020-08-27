package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LecturerTest {

    Lecturer lecture;

    @Before
    public void setUp() throws Exception {

        lecture = new Lecturer("", "", "", "");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getLecturerName() {

        String  LecturerName = lecture.getLecturerName();
        assertEquals("Incorrect", "Vincent ", "Vincent ");
    }

    @Test
    public void getLecturerSurname() {
        String  LecturerSurname = lecture.getLecturerSurname();
        assertEquals("Incorrect", "Dawn", "Dawn");
    }

    @Test
    public void lecturerFunction() {
        lecture.lecturerFunction();
    }
}