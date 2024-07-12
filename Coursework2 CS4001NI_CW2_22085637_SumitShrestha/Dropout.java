//The Dropout class is also a subclass of the Student class and it has five attributes
public class Dropout extends Student 

{
    //Attrributes
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    //Creating Constructor
    public Dropout(String dateOfBirth, String studentName, int courseDuration, double tuitionFee, 
    int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout,int enrollmentID,String courseName,String dateOfEnrollment) {

        super(dateOfBirth, studentName, courseDuration, tuitionFee);//A call is made to the superclass constructor with four parameters
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);

        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;

    }
    //accessor method
    public int getNumOfRemainingModules() {
        return this.numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return this.numOfMonthsAttended;
    }

    public String getDateOfDropout() {
        return this.dateOfDropout;
    }

    public int getRemainingAmount() {
        return this.remainingAmount;
    }

    public boolean getHasPaid() {
        return this.hasPaid;
    }
    //setter method
    public void setNumOfRemainingModules(int numOfRemainingModules) {
        this.numOfRemainingModules = numOfRemainingModules;
    }

    public void setDateOfDropout(String dateOfDropout) {
        this.dateOfDropout = dateOfDropout;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    //method to calculate pending amount to be paid.
    public boolean billsPayable(double amountPaid) {
        double pendingAmount = super.getTuitionFee() - amountPaid;

        if (pendingAmount > 0) {
            this.remainingAmount = (int) pendingAmount;
            this.hasPaid = false;
            System.out.println("The pending amount to be paid: $" + pendingAmount);
            return false; // Bills are not fully paid
        } else if (pendingAmount == 0) {
            this.remainingAmount = 0;
            this.hasPaid = true;
            System.out.println("No pending amount. The student has paid the entire tuition fee.");
            return true; // Bills are fully paid
        } else {
            System.out.println("Amount paid is more than the tuition fee. No pending amount.");
            return true; // Bills are fully paid
        }
    }
    //Method to remove student
    public void removeStudent(int enrollmentID) {
        if (this.hasPaid == true) {
            setDateOfBirth("");
            setCourseName("");
            setStudentName("");
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0.0);
            setEnrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.dateOfDropout = "";
            this.remainingAmount = 0;
            System.out.println("Student removed.");
        } else {
            System.out.println("All bills not cleared.");
        }
    }
    //Method for Display
    public void display() {
        super.display();//calling from parent class
        System.out.println("Number of remaining modules: " + this.numOfRemainingModules);
        System.out.println("Number of months attended: " + this.numOfMonthsAttended);
        System.out.println("Date of dropout: " + this.dateOfDropout);
        System.out.println("Remaining amount: " + this.remainingAmount);
    }

}
