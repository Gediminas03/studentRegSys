package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

//A module class, which should contain information such as module name, id (e.g.
//CT417), list of students, courses it is associated with)

import java.util.List;

public class Module {

    String Name;
    List<String> student;
    List<String> course;

    public Module(String name, List<String> student, List<String> course) {
        Name = name;
        this.student = student;
        this.course = course;
    }

    public String getName() {
        return Name;
    }

    public List<String> getStudent() {
        return student;
    }

    public List<String> getCourse() {
        return course;
    }
}
