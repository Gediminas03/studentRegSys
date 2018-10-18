package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

//A student class should contain some attributes such as (Name, Age, DOB, ID,
//username, courses and strings registered for, etc.).
// A specific method (getUsername()) will generate the student’s username by
//concatenating their name and age.

import java.util.List;

public class Student {
    String Name;
    int Age;
    String DOB;
    int ID;
    String Username;
    List<String> modules;
    List<String> courses;

    public Student(String name, int age, String DOB, int ID, String username, List<String> module, List<String> courses) {
        Name = name;
        Age = age;
        this.DOB = DOB;
        this.ID = ID;
        Username = username;
        this.modules = module;
        this.courses = courses;
    }

    public List<String> getModule() {
        return modules;
    }

    public List<String> getCourses() {
        return courses;
    }

    public int getAge() {
        return Age;
    }

    public String getUsername() {
        return Username.concat(Integer.toString(Age));
    }

    public String getName() {
        return Name;
    }

    public String getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }
}
