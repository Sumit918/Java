
public class Student
{
    //Attributes
    private  String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int enrollmentID;
    private int courseDuration;
    private double tuitionFee;
    //Constructor
    public Student(String dateOfBirth, String studentName, int courseDuration, double tuitionFee)
    {
        this.courseName = "";
        this.dateOfEnrollment = "";
        this.enrollmentID = 0;
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
    }
    //Accessor Method
    public String getCourseName(){
        return courseName;
    }

    public String getDateOfEnrollment(){
        return dateOfEnrollment;
    }

    public int getEnrollmentID(){
        return enrollmentID;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getCourseDuration(){
        return courseDuration;
    }

    public double getTuitionFee(){
        return tuitionFee;
    }
    //set methods
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public void setEnrollmentID(int enrollmentID){
        this.enrollmentID = enrollmentID;
    }
    // mutator method for the attribute dateOfEnrollment
    public void setDateOfEnrollment(String dateOfEnrollment){
        this.dateOfEnrollment = dateOfEnrollment;
    }
    //setter method for date of birth, student name, course duration, tuition fee
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setCourseDuration(int courseDuration){
        this.courseDuration=courseDuration;
    }
    public void setTuitionFee(double tuitionFee){
        this.tuitionFee = tuitionFee;
    }
    //method for display
    public void display(){
        if (enrollmentID == 0 || courseName == null || dateOfEnrollment == null )
        {
            System.out.println("Some of the parameters are missing.");
            
        }else{
            int yearsEnrolled = courseDuration/12;
            System.out.println("EnrollmentID:"+enrollmentID);
            System.out.println("DateOfBirth:"+dateOfBirth);
            System.out.println("CourseName:"+courseName);
            System.out.println("StudentName:"+studentName);
            System.out.println("YearsEnrolled:"+yearsEnrolled);
            System.out.println("CourseDuration:"+courseDuration);
            System.out.println("TuitionFee:"+tuitionFee);

        }
    }
}
