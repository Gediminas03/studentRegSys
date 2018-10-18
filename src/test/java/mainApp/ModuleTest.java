package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {

    LocalDate DOB;
    Student student = new Student("Victoria",DOB = new LocalDate(1997, 2, 19),14102368);
    Module module;

    @Test
    public void getName() {
        module = new Module("EE453", student);
        assertEquals("EE453", module.getName());
    }

    @Test
    public void getStudent() {
        module = new Module("EE453", student);
        boolean studentCheck = student.equals(module.getStudent());
        assertTrue("Array content is same:", studentCheck);
    }

}