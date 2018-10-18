package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

//A module class, which should contain information such as module name, id (e.g.
//CT417), list of students, courses it is associated with)


public class Module {

    String Name;
    Student student;

    public Module(String name, Student student) {
        Name = name;
        this.student = student;
    }

    public String getName() {
        return Name;
    }

    public Student getStudent() {
        return student;
    }

}
