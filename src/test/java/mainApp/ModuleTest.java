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
        module = new Module("Electomagnetics","EE453");
        assertEquals("Electomagnetics", module.getName());
    }

    @Test
    public void getCode() {
        module = new Module("Electomagnetics","EE453");
        assertEquals("EE453", module.getCode());
    }

}