package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    List<String> courseECE = Arrays.asList("ECE");
    List<String> courseCSIT = Arrays.asList("CSIT");
    List<String> modulesListECE = Arrays.asList("EE350", "EE450", "EE453", "CT434", "CT420");
    List<String> modulesListCSIT = Arrays.asList("CT434", "CT420", "CT436", "CT421");

    Student student;


    @Test
    public void getUsername() {
        student = new Student("Daniel", 21, "19/02/1997",14102368, "Danie", modulesListECE, courseECE);
        assertEquals("Danie21", student.getUsername());
    }

    @Test
    public void getAge() {
        student = new Student("Daniel", 21, "19/02/1997",14102368, "Danie", modulesListECE, courseECE);
        assertEquals(21, student.getAge());
    }

    @Test
    public void getName() {
        student = new Student("Victoria", 25, "19/02/1993",15102354, "Vici", modulesListCSIT, courseCSIT);
        assertEquals("Victoria", student.getName());
    }

    @Test
    public void getCourses() {
        student = new Student("Victoria", 25, "19/02/1993",15102354, "Vici", modulesListCSIT, courseCSIT);
        boolean studentCourseCheck = courseCSIT.equals(student.getCourses());
        assertTrue("Array content is same:", studentCourseCheck);
    }

    @Test
    public void getModules() {
        student = new Student("Victoria", 25, "19/02/1993",15102354, "Vici", modulesListCSIT, courseCSIT);
        boolean studentModuleCheck = modulesListCSIT.equals(student.getModule());
        assertTrue("Array content is same:", studentModuleCheck);
    }

    @Test
    public void getDOB() {
        student = new Student("Daniel", 21, "19/02/1997",14102368, "Danie", modulesListECE, courseECE);
        assertEquals("19/02/1997", student.getDOB());
    }

    @Test
    public void getID() {
        student = new Student("Victoria", 25, "19/02/1993",15102354, "Vici", modulesListCSIT, courseCSIT);
        assertEquals(15102354, student.getID());
    }
}