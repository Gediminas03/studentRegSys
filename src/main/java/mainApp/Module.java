package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

//A module class, which should contain information such as module name, id (e.g.
//CT417), list of students, courses it is associated with)


public class Module {

    String Name;
    String code;

    public Module(String name, String code) {
        Name = name;
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return code;
    }

}
