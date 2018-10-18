package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    LocalDate DOB;

    Student student;


    @Test
    public void getName() {
        student = new Student("Victoria", DOB = new LocalDate(1997, 2, 19),14102368);
        assertEquals("Victoria", student.getName());
    }


    @Test
    public void getAge() {
        student = new Student("Victoria", DOB = new LocalDate(1997, 2, 19),14102368);
        assertEquals(21, student.getAge());
    }

    @Test
    public void getUsername() {
        student = new Student("Victoria", DOB = new LocalDate(1997, 2, 19),14102368);
        assertEquals("Victoria21", student.getUsername());
    }

    @Test
    public void getDOB() {
        student = new Student("Victoria", DOB = new LocalDate(1997, 2, 19),14102368);
        assertEquals("1997-02-19", student.getDOB().toString());
    }

    @Test
    public void getID() {
        student = new Student("Victoria", DOB = new LocalDate(1997, 2, 19),14102368);
        assertEquals(14102368, student.getID());
    }
}