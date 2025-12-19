public class Course {

    /** 
     * Course title
     * Course number
     * Meeting time
     */

    private String name;
    private String subjectNumber;
    private String meetingTime; 

    /**
     * Construct a Course
     * @param name course title
     * @param subjectNumber course number
     * @param meetingTime meeting time
     */
    public Course(String name, String subjectNumber, String meetingTime) {
        this.name = name;
        this.subjectNumber = subjectNumber;
        this.meetingTime = meetingTime; 
    }

    /** 
     * @return course title
     */
    public String getName() {
        return this.name;
    }

    /** 
     * @return course number 
     */
    public String getSubjectNumber() {
        return this.subjectNumber;
    }

    /** 
     * @return meeting time
     */
    public String getMeetingTime() {
        return this.meetingTime;
    }

    /** 
     * @return course description
     */
    public String toString() {
        return this.subjectNumber + ": " + this.name + " " + this.meetingTime; 
    }

    public static void main(String[] args) {
        Course csc120 = new Course("OOP", "CSC120", "TR 10:50");
        System.out.println(csc120);
    }
    
}
