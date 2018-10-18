package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

//A student class should contain some attributes such as (Name, Age, DOB, ID,
//username, courses and strings registered for, etc.).
// A specific method (getUsername()) will generate the student’s username by
//concatenating their name and age.

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student {
    String Name;
    int Age;
    LocalDate DOB;
    int ID;
    LocalDate now = LocalDate.now();

    public Student(String name, LocalDate DOB, int ID) {
        Name = name;
        this.DOB = DOB;
        this.ID = ID;
    }

    public int getAge() {
        Years age = Years.yearsBetween(DOB, now);
        Age = age.getYears();
        return Age;
    }

    public String getUsername() {

        return Name.concat(Integer.toString(getAge()));
    }

    public String getName() {
        return Name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }
}
