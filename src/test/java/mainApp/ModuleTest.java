package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ModuleTest {

    List<String> studentNames = Arrays.asList("Daniel Kenny", "Enda Scully", "Gabriela Diohrte", "Lara Croft", "Pavel Lang");
    List<String> courseECE = Arrays.asList("ECE");
    Module module;

    @Test
    public void getName() {
        module = new Module("EE453",studentNames, courseECE);
        assertEquals("EE453", module.getName());
    }

    @Test
    public void getStudent() {
        module = new Module("EE453",studentNames, courseECE);
        boolean studentModuleCheck = studentNames.equals(module.getStudent());
        assertTrue("Array content is same:", studentModuleCheck);
    }

    @Test
    public void getCourse() {
        module = new Module("EE453",studentNames, courseECE);
        boolean studentCourseCheck = studentNames.equals(module.getCourse());
        assertTrue("Array content is same:", studentCourseCheck);
    }
}