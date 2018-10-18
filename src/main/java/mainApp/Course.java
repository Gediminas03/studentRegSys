package mainApp;

/*        Gediminas Zukauskas
              13102362
                 ECE
*/

// A course programme class containing course name (CS & IT or ECE, etc.), list of
//strings, list of students that are enrolled, academic start date and end date.
//Start and end dates should use Joda Time classes (i.e. DateTime), which must be
//added as a project dependency.

import org.joda.time.LocalDate;

import java.util.List;

public class Course {

    java.lang.String Name;
    List<String> course;
    List<String> studentName;
    LocalDate startDate;
    LocalDate endDate;

    public Course(String name, List<String> course, List<String> studentName, LocalDate startDate, LocalDate endDate) {
        Name = name;
        this.course = course;
        this.studentName = studentName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return Name;
    }

    public List<String> getCourse() {
        return course;
    }

    public List<String> getStudentName() {
        return studentName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
