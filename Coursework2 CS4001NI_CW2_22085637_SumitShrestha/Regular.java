
public class Regular extends Student{
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    //Constructor
    public Regular(int enrollmentID, String dateOfBirth,String courseName, String studentName, String dateOfEnrollment,int courseDuration,double tuitionFee,int numOfModules,int numOfCreditHours,double daysPresent){
        //calling from parent class
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    //Accessor Method
    public int getNumOfModules(){
        return numOfModules;
    }

    public int getNumOfCreditHours(){
        return numOfCreditHours;
    }

    public double getDaysPresent(){
        return daysPresent;
    }

    public boolean getIsGrantedScholarship() {
        return isGrantedScholarship;
    }
    
    public char presentPercentage(double daysPresent){
        double presentPercentage = (this.daysPresent / super.getCourseDuration()) * 100;
        if (super.getCourseDuration() > daysPresent || daysPresent < 0){
            System.out.println("Invalid days present..");
            return 'N';
        }
        else if (presentPercentage >= 80)
        {
            this.isGrantedScholarship = true;
            return 'A';
        } else if (presentPercentage >= 60){
            this.isGrantedScholarship = false;
            return 'B';
        } else if (presentPercentage >= 40){
            this.isGrantedScholarship = false;
            return 'C';
        } else if (presentPercentage >= 20)
        {
            this.isGrantedScholarship = false;
            return 'D';
        } else {
            this.isGrantedScholarship = false;
            return 'F';
        }
    }
    //Method for grantCertificate
    public void grantCertificate(String courseName, int enrollmentID,String dateOfEnrollment)
    {
        if (isGrantedScholarship == true)
        {
            System.out.println("The scholarship has been granted");
            System.out.println("The student having EnrollmentID"+enrollmentID+"has graduated from the " +courseName+"course on " +dateOfEnrollment);
        }
        else
        {
            System.out.println("The student having EnrollmentID"+enrollmentID+"hasnot graduated from the " +courseName+"course on " +dateOfEnrollment);
        }
    }
    //Method to Display
    public void displayRegular(){
        super.display();//calling from parent class
        System.out.println("NumOfModules :"+numOfModules);
        System.out.println("NumOfCreditHours:"+numOfCreditHours);
        System.out.println("DaysPresent:"+daysPresent);
        double presentPercentage = presentPercentage(daysPresent);
        if (presentPercentage >= 0) {
        System.out.println("Present Percentage: " + presentPercentage + "%");
    }
    }
    
}

