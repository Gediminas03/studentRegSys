package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CourseTest {

    List<String> studentNames = Arrays.asList("Daniel Kenny", "Enda Scully", "Gabriela Diohrte", "Lara Croft", "Pavel Lang");
    List<String> courseECE = Arrays.asList("ECE");
    List<String> courseCSIT = Arrays.asList("CSIT");
    LocalDate dateStart = new LocalDate(2015, 9, 1);
    LocalDate dateFinish = new LocalDate(2019, 8, 31);

    Course course;

    @Test
    public void getName() {
        course = new Course("Electronic and Computer Eng",courseECE, studentNames, dateStart, dateFinish);
        assertEquals("Electronic and Computer Eng", course.getName());
    }

    @Test
    public void getCourse() {
        course = new Course("Electronic and Computer Eng",courseECE, studentNames, dateStart, dateFinish);
        boolean courseCheck = courseECE.equals(course.getCourse());
        assertTrue("Array content is same:", courseCheck);
    }

    @Test
    public void getStudentName() {
        course = new Course("Computer Science and IT",courseCSIT, studentNames, dateStart, dateFinish);
        boolean studentCheck = courseCSIT.equals(course.getCourse());
        assertTrue("Array content is same:", studentCheck);
    }

    @Test
    public void getStartDate() {
        course = new Course("Computer Science and IT",courseCSIT, studentNames, dateStart, dateFinish);
        assertEquals("2015-09-01", course.getStartDate().toString());
    }

    @Test
    public void getEndDate() {
        course = new Course("Computer Science and IT",courseCSIT, studentNames, dateStart, dateFinish);
        assertEquals("2019-08-31", course.getEndDate().toString());
    }
}