package studentdata;

/**
 * This class represents part-time student
 *
 * @author Kaloyan Palazov
 */
public class PartTimeStudent extends Student
{
    
    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses)
    {
        super(name);
        this.numCourses = numCourses;
    }
    
    public int getNumCourses()
    {
        return numCourses;
    }
    
    public void setNumCourses(int numCourses)
    {
        this.numCourses = numCourses;
    }
}
