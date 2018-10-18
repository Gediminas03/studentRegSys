package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    LocalDate DOB;
    LocalDate dateStart = new LocalDate(2015, 9, 1);
    LocalDate dateFinish = new LocalDate(2019, 8, 31);

    Course course;

    @Test
    public void getName() {
        course = new Course("Electronic and Computer Eng", dateStart, dateFinish);
        assertEquals("Electronic and Computer Eng", course.getName());
    }

    @Test
    public void getStartDate() {
        course = new Course("Electronic and Computer Eng", dateStart, dateFinish);
        assertEquals("2015-09-01", course.getStartDate().toString());
    }

    @Test
    public void getEndDate() {
        course = new Course("Electronic and Computer Eng", dateStart, dateFinish);
        assertEquals("2019-08-31", course.getEndDate().toString());
    }

}