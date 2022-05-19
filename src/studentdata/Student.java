/*
 * 
 * 
 */

package studentdata;

/**
 * This class represents student 
 *
 * @author Kaloyan Palazov
 */
public class Student {

    private String studentName;

    public Student(){}
    public Student(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}