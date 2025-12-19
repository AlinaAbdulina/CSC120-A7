import java.util.ArrayList;

public class Student {
    /** 
     * Student's full name
     */
    private String name; 

    /** 
     * Student id 
     */
    private String id; 

    /** 
     * Expected graduation year
     */
    private int classYear; 

    /** 
     * List of student's courses 
     */
    private ArrayList<Course> classes; 

    /**
     * Construct student
     * @param name student name
     * @param id student id
     * @param classYear expected graduation year
     */
    public Student(String name, String id, int classYear) {
        this.name = name;
        this.id = id;
        this.classYear = classYear;
        this.classes = new ArrayList<>(); 
    }

    /** 
     * @return student's name 
     */
    public String getName() {
        return this.name; 
    }

    /** 
     * @return student information 
     */
    public String toString() {
        return this.name + " ID: " + this.id + " Class Year: " + this.classYear;
    }
    
    public static void main(String[] args) {
        Student ab = new Student("Ab", "9909abc", 2014);
        System.out.println(ab);
        Course csc120 = new Course("OOP", "CSC120", "TR 10:50");
        ab.classes.add(csc120);
        System.out.println(ab.classes);
    }
    
}
