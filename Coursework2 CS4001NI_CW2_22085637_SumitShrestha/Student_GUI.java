/**
 * Write a description of class Glkj here.
 *CourseWrork 2
 * Sumit Shrestha
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Student_GUI implements ActionListener {
    // Variables of Student_GUI
    private ArrayList<Student> studentList = new ArrayList<>();
    private JFrame frame_StudentGUI;
    private JPanel panel_StudentGUI;
    private JLabel label_StudentGUI, logolabel_StudentGUI;
    private JButton btnRegular, btnDropout;
    private ImageIcon image, brgImage,imageRegular,imageDropout;

    // Variables of Regular_UIUX
    private JFrame frame_RegularGUI;
    private JPanel panel_RegularGUI;
    private JLabel label_RegularGUI, lblEnrollmentID, lblStudentName, lblTuitionFee, lblDateofEnrollment,
    lblCourseDuration, lblDateofBirth, lblCourseName, lblNumOfModules, lblNumOfCreditHours, lblDaysPresent;
    private JTextField txtEnrollmentID, txtStudentName, txtTuitionFee, txtNumOfModules, txtNumOfCreditHours,
    txtDaysPresent, txtCourseDuration;
    private JComboBox<String> txtDateofEnrollmentDay,txtDateofEnrollmentMonth,txtDateofEnrollmentYear, txtDateofBirthDay,txtDateofBirthMonth,txtDateofBirthYear, txtCourseName;
    private JButton regSubmit, reset, backRegular, btnPresentPercentage,btnGrantCertificate;

    // Variables of Dropout_UIUX
    private JFrame frame_DropoutGUI;
    private JPanel panel_DropoutGUI;
    private JLabel label_DropoutGUI, lbldateOfBirth, lblcourseName, lblstudentName, lbldateOfEnrollement, lblenrollmentID,
    lblcourseDuration, lbltuitionFee, lblNumOfRemainingModules, lblNumOfMonthsAttended, lbldateofDropout;
    private JTextField  txtstudentName, txtenrollmentId, txtcourseDuration, txttuitionFee,
    txtNumOfRemainingModules, txtNumOfMonthsAttended;
    private JComboBox<String> txtdateOfBirthDay,txtdateOfBirthMonth,txtdateOfBirthYear, txtdateOfEnrollmentDay,txtdateOfEnrollmentMonth,txtdateOfEnrollmentYear, txtdateOfDropoutDay,txtdateOfDropoutMonth,txtdateOfDropoutYear,txtcourseName;
    private JButton resetDropout, submitDropout, backDropout, btnPayBills,removeStudent;

    //variables of display
    private JTable table;
    private JButton btnDisplayRegular,btnDisplayDropout, btnClear;

    public Student_GUI() {
        frame_StudentGUI = new JFrame();

        image = new ImageIcon("Images/c.jpg");
        brgImage = new ImageIcon("Images/a.jpg");

        panel_StudentGUI = new JPanel();
        panel_StudentGUI.setLayout(null);
        frame_StudentGUI.add(panel_StudentGUI);

        label_StudentGUI = new JLabel();
        logolabel_StudentGUI = new JLabel();

        label_StudentGUI.setIcon(brgImage);
        logolabel_StudentGUI.setIcon(image);

        label_StudentGUI.setBounds(0, 0, 1080, 720);
        logolabel_StudentGUI.setBounds(350, 150, 100, 100);

        btnRegular = new JButton("Regular Student");
        btnDropout = new JButton("Dropout Student");

        btnRegular.setBounds(430,390,186,66);
        btnDropout.setBounds(430,505,186,66);

        btnRegular.setFont(new Font("Helvetica", Font.PLAIN, 20));
        btnDropout.setFont(new Font("Helvetica", Font.PLAIN, 20));

        btnRegular.setFocusable(false);
        btnDropout.setFocusable(false);

        btnRegular.addActionListener(this);
        btnDropout.addActionListener(this);

        panel_StudentGUI.add(btnRegular);
        panel_StudentGUI.add(btnDropout);

        panel_StudentGUI.add(label_StudentGUI);
        panel_StudentGUI.add(logolabel_StudentGUI);

        frame_StudentGUI.setIconImage(image.getImage());
        frame_StudentGUI.setTitle("Student's Form");
        frame_StudentGUI.setSize(1080, 720);
        frame_StudentGUI.setResizable(false);
        frame_StudentGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_StudentGUI.setVisible(true);
        frame_StudentGUI.setLocationRelativeTo(null);
    }

    // Regular UIUX frame
    public void regular_UIUX() {
        frame_RegularGUI = new JFrame("Regular Student");

        imageRegular = new ImageIcon("Images/c.jpg");

        panel_RegularGUI = new JPanel();
        panel_RegularGUI.setLayout(null);
        frame_RegularGUI.add(panel_RegularGUI);

        //creating Label
        label_RegularGUI = new JLabel("Regular Student");
        lblEnrollmentID = new JLabel("Enrollment ID:");
        lblStudentName = new JLabel("Student Name:");
        lblCourseName = new JLabel("Course Name:");
        lblCourseDuration = new JLabel("Course Duration:");
        lblDateofEnrollment = new JLabel("Date Of Enrollment:");
        lblDateofBirth = new JLabel("Date of Birth:");
        lblTuitionFee = new JLabel("Tuition Fee:");
        lblNumOfModules = new JLabel("Number of Modules:");
        lblNumOfCreditHours = new JLabel("Number of Credit Hours:");
        lblDaysPresent = new JLabel("Days Present:");

        //creating textfield
        txtEnrollmentID = new JTextField();
        txtStudentName = new JTextField();
        txtTuitionFee = new JTextField();
        txtNumOfModules = new JTextField();
        txtNumOfCreditHours = new JTextField();
        txtCourseDuration = new JTextField();
        txtDaysPresent = new JTextField();
        txtDateofEnrollmentDay = new JComboBox<>(Days());
        txtDateofEnrollmentMonth = new JComboBox<>(Months());
        txtDateofEnrollmentYear = new JComboBox<>(Years());
        txtDateofBirthDay=  new JComboBox<>(Days());
        txtDateofBirthMonth= new JComboBox<>(Months());
        txtDateofBirthYear = new JComboBox<>(Years());
        txtCourseName = new JComboBox<>(Courses());

        //creating buttons
        regSubmit = new JButton("Submit");
        reset = new JButton("Reset");
        backRegular = new JButton("Back");
        btnPresentPercentage = new JButton("Book");
        btnGrantCertificate = new JButton("Certificate");
        btnDisplayRegular = new JButton("Display");

        label_RegularGUI.setBounds(400, 40, 513, 75);
        lblEnrollmentID.setBounds(47, 150, 222, 76);
        lblStudentName.setBounds(47, 220, 222, 75);
        lblDateofBirth.setBounds(47, 290, 222, 75);
        lblDaysPresent.setBounds(47, 360, 222, 75);
        lblTuitionFee.setBounds(47, 430, 222, 75);

        lblDateofEnrollment.setBounds(540, 150, 289, 52);
        lblCourseName.setBounds(540, 220, 248, 73);
        lblCourseDuration.setBounds(540, 290, 248, 60);
        lblNumOfModules.setBounds(540, 360, 305, 68);
        lblNumOfCreditHours.setBounds(540, 430, 379,80);

        txtEnrollmentID.setBounds(279, 160, 210, 48);
        txtStudentName.setBounds(279, 230, 210, 48);
        txtDateofBirthDay.setBounds(279, 300, 44, 38);
        txtDateofBirthMonth.setBounds(329, 300, 44, 38);
        txtDateofBirthYear.setBounds(379, 300, 100, 38);
        txtDaysPresent.setBounds(279, 370, 210, 48);
        txtTuitionFee.setBounds(279, 440, 200, 48);

        txtDateofEnrollmentDay.setBounds(830, 160, 44, 38);
        txtDateofEnrollmentMonth.setBounds(880, 160,44, 38);
        txtDateofEnrollmentYear.setBounds(930, 160, 100, 38);

        txtCourseName.setBounds(830, 230, 217, 46);
        txtCourseDuration.setBounds(830, 300, 217, 48);
        txtNumOfModules.setBounds(830,370, 217, 48);
        txtNumOfCreditHours.setBounds(900,440, 144, 48);

        regSubmit.setBounds(46, 615, 140, 53);
        btnPresentPercentage.setBounds(210,615,140,53);
        btnGrantCertificate.setBounds(390,615,140,53);
        reset.setBounds(570, 615, 140, 53);
        btnDisplayRegular.setBounds(730,615,140,53);
        backRegular.setBounds(890, 615, 140, 53);

        label_RegularGUI.setFont(new Font("Helvetica", Font.BOLD, 40));
        lblEnrollmentID.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblStudentName.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblCourseName.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblCourseDuration.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblDateofEnrollment.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblDateofBirth.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblTuitionFee.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblNumOfModules.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblNumOfCreditHours.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblDaysPresent.setFont(new Font("Helvetica", Font.BOLD, 30));

        txtEnrollmentID.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtStudentName.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtCourseName.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtCourseDuration.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofEnrollmentDay.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofEnrollmentMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofEnrollmentYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofBirthDay.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofBirthMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDateofBirthYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtTuitionFee.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtNumOfModules.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtNumOfCreditHours.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtDaysPresent.setFont(new Font("Helvetica", Font.PLAIN, 14));

        regSubmit.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnPresentPercentage.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnGrantCertificate.setFont(new Font("Helvetica", Font.BOLD, 20));
        reset.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnDisplayRegular.setFont(new Font("Helvetica", Font.BOLD, 20));
        backRegular.setFont(new Font("Helvetica", Font.BOLD, 20));

        regSubmit.setFocusable(false);
        reset.setFocusable(false);
        backRegular.setFocusable(false);
        btnPresentPercentage.setFocusable(false);
        btnDisplayRegular.setFocusable(false);
        btnGrantCertificate.setFocusable(false);

        regSubmit.addActionListener(this);
        reset.addActionListener(this);
        backRegular.addActionListener(this);
        btnPresentPercentage.addActionListener(this);
        btnGrantCertificate.addActionListener(this);
        btnDisplayRegular.addActionListener(this);

        panel_RegularGUI.add(label_RegularGUI);
        panel_RegularGUI.add(lblEnrollmentID);
        panel_RegularGUI.add(lblStudentName);
        panel_RegularGUI.add(lblCourseName);
        panel_RegularGUI.add(lblCourseDuration);
        panel_RegularGUI.add(lblDateofEnrollment);
        panel_RegularGUI.add(lblDateofBirth);
        panel_RegularGUI.add(lblTuitionFee);
        panel_RegularGUI.add(lblNumOfModules);
        panel_RegularGUI.add(lblNumOfCreditHours);
        panel_RegularGUI.add(lblDaysPresent);

        panel_RegularGUI.add(txtEnrollmentID);
        panel_RegularGUI.add(txtStudentName);
        panel_RegularGUI.add(txtCourseName);
        panel_RegularGUI.add(txtCourseDuration);
        panel_RegularGUI.add(txtDateofEnrollmentDay);
        panel_RegularGUI.add(txtDateofEnrollmentMonth);
        panel_RegularGUI.add(txtDateofEnrollmentYear);
        panel_RegularGUI.add(txtDateofBirthDay);
        panel_RegularGUI.add(txtDateofBirthMonth);
        panel_RegularGUI.add(txtDateofBirthYear);
        panel_RegularGUI.add(txtTuitionFee);
        panel_RegularGUI.add(txtNumOfModules);
        panel_RegularGUI.add(txtNumOfCreditHours);
        panel_RegularGUI.add(txtDaysPresent);

        panel_RegularGUI.add(regSubmit);
        panel_RegularGUI.add(reset);
        panel_RegularGUI.add(backRegular);
        panel_RegularGUI.add(btnPresentPercentage);
        panel_RegularGUI.add(btnGrantCertificate);
        panel_RegularGUI.add(btnDisplayRegular);

        frame_RegularGUI.setIconImage(imageRegular.getImage());
        frame_RegularGUI.setTitle("Regular Form");
        frame_RegularGUI.setSize(1080, 720);
        frame_RegularGUI.setResizable(false);
        frame_RegularGUI.setLocationRelativeTo(null);
        frame_RegularGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_RegularGUI.setVisible(true);
        frame_RegularGUI.setLocationRelativeTo(null);
    }

    // Dropout UIUX frame
    public void dropout_UIUX() {
        frame_DropoutGUI = new JFrame("Dropout Student");

        imageDropout= new ImageIcon("Images/c.jpg");

        panel_DropoutGUI = new JPanel();
        panel_DropoutGUI.setLayout(null);
        frame_DropoutGUI.add(panel_DropoutGUI);

        label_DropoutGUI = new JLabel("Dropout Student");
        lblenrollmentID = new JLabel("Enrollment ID:");
        lblstudentName = new JLabel("Student Name:");
        lblcourseName = new JLabel("Course Name:");
        lblcourseDuration = new JLabel("Course Duration:");
        lbldateOfEnrollement = new JLabel("Date Of Enrollment:");
        lbldateOfBirth = new JLabel("Date of Birth:");
        lbltuitionFee = new JLabel("Tuition Fee:");
        lblNumOfRemainingModules = new JLabel("Remaining Modules:");
        lbldateofDropout = new JLabel("Date of Dropout:");
        lblNumOfMonthsAttended= new JLabel("Month Attended:");

        txtenrollmentId = new JTextField();
        txtstudentName = new JTextField();
        txttuitionFee = new JTextField();
        txtNumOfRemainingModules = new JTextField();
        txtcourseDuration = new JTextField();
        txtNumOfMonthsAttended = new JTextField();

        txtdateOfDropoutDay = new JComboBox<>(Days());
        txtdateOfDropoutMonth = new JComboBox<>(Months());
        txtdateOfDropoutYear = new JComboBox<>(Years());

        txtdateOfEnrollmentDay = new JComboBox<>(Days());
        txtdateOfEnrollmentMonth = new JComboBox<>(Months());
        txtdateOfEnrollmentYear = new JComboBox<>(Years());

        txtdateOfBirthDay=  new JComboBox<>(Days());
        txtdateOfBirthMonth= new JComboBox<>(Months());
        txtdateOfBirthYear = new JComboBox<>(Years());
        txtcourseName = new JComboBox<>(Courses());

        submitDropout = new JButton("Submit");
        resetDropout = new JButton("Clear");
        backDropout = new JButton("Back");
        btnPayBills = new JButton("Pay Bill");
        removeStudent = new JButton("Remove");
        btnDisplayDropout = new JButton("Display");

        label_DropoutGUI.setBounds(400, 40, 513, 75);
        lblenrollmentID.setBounds(47, 150, 222, 76);
        lblstudentName.setBounds(47, 220, 222, 75);
        lbldateOfBirth.setBounds(47, 290, 222, 75);
        lblNumOfMonthsAttended.setBounds(47, 360, 322, 75);
        lbltuitionFee.setBounds(47, 430, 222, 75);

        lbldateOfEnrollement.setBounds(540, 150, 289, 52);
        lblcourseName.setBounds(540, 220, 248, 73);
        lblcourseDuration.setBounds(540, 290, 248, 60);
        lblNumOfRemainingModules.setBounds(540, 360, 305, 68);
        lbldateofDropout.setBounds(540, 430, 379,80);

        txtenrollmentId.setBounds(279, 160, 210, 48);
        txtstudentName.setBounds(279, 230, 210, 48);
        txtNumOfMonthsAttended.setBounds(279, 370, 210, 48);
        txttuitionFee.setBounds(279, 440, 200, 48);

        txtdateOfBirthDay.setBounds(279, 300, 39, 48);
        txtdateOfBirthMonth.setBounds(329, 300, 39, 48);
        txtdateOfBirthYear.setBounds(379, 300, 100, 48);

        txtdateOfEnrollmentDay.setBounds(830, 160, 39, 48);
        txtdateOfEnrollmentMonth.setBounds(880, 160, 39, 48);
        txtdateOfEnrollmentYear.setBounds(930, 160, 100, 48);

        txtdateOfDropoutDay.setBounds(830, 440, 39, 48);
        txtdateOfDropoutMonth.setBounds(880, 440, 39, 48);
        txtdateOfDropoutYear.setBounds(930, 440, 100, 48);

        txtcourseName.setBounds(830, 230, 217, 46);
        txtcourseDuration.setBounds(830, 300, 217, 48);
        txtNumOfRemainingModules.setBounds(830,370, 217, 48);

        submitDropout.setBounds(46, 615, 140, 53);
        resetDropout.setBounds(210,615,140,53);
        btnPayBills.setBounds(390,615,140,53);
        removeStudent.setBounds(570, 615, 140, 53);
        btnDisplayDropout.setBounds(730,615,140,53);
        backDropout.setBounds(890, 615, 140, 53);

        label_DropoutGUI.setFont(new Font("Helvetica", Font.BOLD, 40));
        lblenrollmentID.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblstudentName.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblcourseName.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblcourseDuration.setFont(new Font("Helvetica", Font.BOLD, 30));
        lbldateOfEnrollement.setFont(new Font("Helvetica", Font.BOLD, 30));
        lbldateOfBirth.setFont(new Font("Helvetica", Font.BOLD, 30));
        lbltuitionFee.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblNumOfRemainingModules.setFont(new Font("Helvetica", Font.BOLD, 30));
        lbldateofDropout.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblNumOfMonthsAttended.setFont(new Font("Helvetica", Font.BOLD, 30));

        txtenrollmentId.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtstudentName.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtcourseName.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtcourseDuration.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfEnrollmentDay.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfEnrollmentMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfEnrollmentYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfBirthDay.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfBirthMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfBirthYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txttuitionFee.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtNumOfRemainingModules.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtNumOfMonthsAttended.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfDropoutDay.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfDropoutMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
        txtdateOfDropoutYear.setFont(new Font("Helvetica", Font.PLAIN, 14));

        submitDropout.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnPayBills.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnDisplayDropout.setFont(new Font("Helvetica",Font.BOLD,20));
        resetDropout.setFont(new Font("Helvetica", Font.BOLD, 20));
        backDropout.setFont(new Font("Helvetica", Font.BOLD, 20));
        removeStudent.setFont(new Font("Helvetica", Font.BOLD, 20));

        submitDropout.setFocusable(false);
        resetDropout.setFocusable(false);
        backDropout.setFocusable(false);
        btnPayBills.setFocusable(false);
        btnDisplayDropout.setFocusable(false);
        removeStudent.setFocusable(false);

        submitDropout.addActionListener(this);
        resetDropout.addActionListener(this);
        backDropout.addActionListener(this);
        btnPayBills.addActionListener(this);
        btnDisplayDropout.addActionListener(this);
        removeStudent.addActionListener(this);

        panel_DropoutGUI.add(label_DropoutGUI);
        panel_DropoutGUI.add(lblenrollmentID);
        panel_DropoutGUI.add(lblstudentName);
        panel_DropoutGUI.add(lblcourseName);
        panel_DropoutGUI.add(lblcourseDuration);
        panel_DropoutGUI.add(lbldateOfEnrollement);
        panel_DropoutGUI.add(lbldateOfBirth);
        panel_DropoutGUI.add(lbltuitionFee);
        panel_DropoutGUI.add(lblNumOfRemainingModules);
        panel_DropoutGUI.add(lbldateofDropout);
        panel_DropoutGUI.add(lblNumOfMonthsAttended);

        panel_DropoutGUI.add(txtenrollmentId);
        panel_DropoutGUI.add(txtstudentName);
        panel_DropoutGUI.add(txtcourseName);
        panel_DropoutGUI.add(txtcourseDuration);
        panel_DropoutGUI.add(txttuitionFee);
        panel_DropoutGUI.add(txtNumOfRemainingModules);
        panel_DropoutGUI.add(txtNumOfMonthsAttended);

        panel_DropoutGUI.add(txtdateOfEnrollmentDay);
        panel_DropoutGUI.add(txtdateOfEnrollmentMonth);
        panel_DropoutGUI.add(txtdateOfEnrollmentYear);

        panel_DropoutGUI.add(txtdateOfBirthDay);
        panel_DropoutGUI.add(txtdateOfBirthMonth);
        panel_DropoutGUI.add(txtdateOfBirthYear);

        panel_DropoutGUI.add(txtdateOfDropoutDay);
        panel_DropoutGUI.add(txtdateOfDropoutMonth);
        panel_DropoutGUI.add(txtdateOfDropoutYear);

        panel_DropoutGUI.add(submitDropout);
        panel_DropoutGUI.add(resetDropout);
        panel_DropoutGUI.add(backDropout);
        panel_DropoutGUI.add(btnPayBills);
        panel_DropoutGUI.add(btnDisplayDropout);
        panel_DropoutGUI.add(removeStudent);

        frame_DropoutGUI.setIconImage(imageDropout.getImage());
        frame_DropoutGUI.setSize(1080, 720);
        frame_DropoutGUI.setResizable(false);
        frame_DropoutGUI.setLocationRelativeTo(null);
        frame_DropoutGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_DropoutGUI.setVisible(true);
        frame_DropoutGUI.setLocationRelativeTo(null);
    }
    //resistering regular student
    public void addRegular(){
        //Taking Vlaue In String
        String enrollmentIDText= txtEnrollmentID.getText();
        String studentName = txtStudentName.getText();
        String dateOfBirthText = txtDateofBirthDay.getSelectedItem()+"-"+(txtDateofBirthMonth.getSelectedIndex()+1)+ "-" + txtDateofBirthYear.getSelectedItem();
        String daysPresentText = txtDaysPresent.getText();
        String tuitionFeeText = txtTuitionFee.getText();

        String dateOfEnrollmentText = txtDateofEnrollmentDay.getSelectedItem()+"-"+(txtDateofEnrollmentMonth.getSelectedIndex() +1)+ "-" + txtDateofEnrollmentYear.getSelectedItem();
        String courseNameRegular = txtCourseName.getSelectedItem().toString();
        String courseDurationText = txtCourseDuration.getText();
        String numberOfModulesText = txtNumOfModules.getText();
        String numberOfCredithoursText = txtNumOfCreditHours.getText();
        try{
            //Checking if any of the required file is empty
            if(enrollmentIDText.isEmpty()||studentName.isEmpty()|| dateOfBirthText.isEmpty()|| daysPresentText.isEmpty()|| tuitionFeeText.isEmpty()||
            dateOfEnrollmentText.isEmpty()|| courseNameRegular.isEmpty()||courseDurationText.isEmpty()|| numberOfModulesText.isEmpty()|| numberOfCredithoursText.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please fill all the fields.","Alert", JOptionPane.WARNING_MESSAGE);
            }else
            {
                //Parse numeric values from the text fields
                int enrollmentID = Integer.parseInt(enrollmentIDText);
                int courseDuration = Integer.parseInt(courseDurationText);
                double tuitionFee = Double.parseDouble(tuitionFeeText);
                int numOfModules = Integer.parseInt(numberOfModulesText);
                int numOfCreditHours = Integer.parseInt(numberOfCredithoursText);
                int daysPresent = Integer.parseInt(daysPresentText);

                //Checking if the numberical textfield contains only numbers no alphabets
                if(!enrollmentIDText.matches("[0-9]+") || !courseDurationText.matches("[0-9]+") ||
                !tuitionFeeText.matches("[0-9.]+") || !numberOfModulesText.matches("[0-9]+") ||
                !numberOfCredithoursText.matches("[0-9]+") || !daysPresentText.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null,"Invalid inputs. Please enter valid numeric inputs.","Alert",JOptionPane.WARNING_MESSAGE);

                }else {
                    //Check wheather student with same EnrollmentID already resister
                    boolean isAlreadyResistered = false;
                    for(Student student : studentList){
                        if(student instanceof Regular ){
                            if ( student.getEnrollmentID() == enrollmentID){
                                JOptionPane.showMessageDialog(null,"The student is already registered.","Alert",JOptionPane.WARNING_MESSAGE);
                                isAlreadyResistered = true;
                                break;
                            }
                        }
                    }
                    if(isAlreadyResistered == false){
                        //Create and add the Regular student to the list 

                        Regular regularStudent = new Regular(enrollmentID, dateOfBirthText, courseNameRegular, studentName, dateOfEnrollmentText,
                                courseDuration, tuitionFee, numOfModules, numOfCreditHours, daysPresent);
                        studentList.add(regularStudent);

                        String registeredInformation = "Enrollment ID: " + enrollmentID + "\n" +
                            "Name: " + studentName + "\n" +
                            "Date of Birth: " + dateOfBirthText + "\n" +
                            "Days Present: " + daysPresent + "\n" +
                            "Tuition Fee: " + tuitionFee + "\n" +
                            "Date of Enrollment: " + dateOfEnrollmentText + "\n" +
                            "Course Name: " + courseNameRegular + "\n" +
                            "Course Duration: " + courseDuration + " months\n" +
                            "Number of Modules: " + numOfModules + "\n" +
                            "Number of Credit Hours: " + numOfCreditHours;

                        JOptionPane.showMessageDialog(null, registeredInformation, "Student Information", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Thank you for registering.", "Info", JOptionPane.INFORMATION_MESSAGE);

                    }

                }

            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for course duration, tuition fee, number of modules, number of credit hours, and days present.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            // Handle any other exceptions that might occur during the parsing
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.");
        }
    }

    //add Dropout
    public void submitDropout()
    {
        String enrollmentIDText = txtenrollmentId.getText();
        String studentName = txtstudentName.getText();
        String courseDurationText = txtcourseDuration.getText();
        String dateOfEnrollment = txtdateOfEnrollmentDay.getSelectedItem() + "-" + (txtdateOfEnrollmentMonth.getSelectedIndex() + 1) + "-" + txtdateOfEnrollmentYear.getSelectedItem();
        String courseName = txtcourseName.getSelectedItem().toString();
        String dateOfBirth = txtdateOfBirthDay.getSelectedItem() + "-" + (txtdateOfBirthMonth.getSelectedIndex() + 1) + "-" + txtdateOfBirthYear.getSelectedItem();
        String dateOfDropout = txtdateOfDropoutDay.getSelectedItem() + "-" + (txtdateOfDropoutMonth.getSelectedIndex() + 1) + "-" + txtdateOfDropoutYear.getSelectedItem();
        String tuitionFeeText = txttuitionFee.getText();
        String numOfRemainingModulesText = txtNumOfRemainingModules.getText();
        String numOfMonthsAttendedText = txtNumOfMonthsAttended.getText();

        try {
            // Check if any of the required fields are empty
            if (enrollmentIDText.isEmpty() || studentName.isEmpty() || courseName.isEmpty() || courseDurationText.isEmpty() ||
            dateOfEnrollment.isEmpty() || dateOfBirth.isEmpty() || dateOfDropout.isEmpty() ||
            tuitionFeeText.isEmpty() || numOfRemainingModulesText.isEmpty() || numOfMonthsAttendedText.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the fields!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                // Parse numeric values from the text fields
                int enrollmentID = Integer.parseInt(enrollmentIDText);
                int courseDuration = Integer.parseInt(courseDurationText);
                double tuitionFee = Double.parseDouble(tuitionFeeText);
                int numOfRemainingModules = Integer.parseInt(numOfRemainingModulesText);
                int numOfMonthsAttended = Integer.parseInt(numOfMonthsAttendedText);

                // Check if enrollmentID and courseDuration contain only numbers (no alphabet or special characters)
                if (!enrollmentIDText.matches("[0-9]+") || !courseDurationText.matches("[0-9]+") || !tuitionFeeText.matches("[0-9.]+") ||
                !numOfRemainingModulesText.matches("[0-9]+") || !numOfMonthsAttendedText.matches("[0-9]+")) {

                    JOptionPane.showMessageDialog(null, "Invalid inputs. Please enter valid numeric inputs.", "Alert", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Check if the student with the same enrollment ID is already registered as a dropout
                    boolean isAlreadyRegistered = false;
                    for (Student student : studentList) {
                        if (student.getEnrollmentID() == enrollmentID) {
                            JOptionPane.showMessageDialog(null, "The student is already registered as a dropout.", "Alert", JOptionPane.WARNING_MESSAGE);
                            isAlreadyRegistered = true;
                            break;
                        }
                    }

                    if (!isAlreadyRegistered) {
                        // Create and add the Dropout student to the list
                        Dropout dropoutStudent = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee,
                                numOfRemainingModules, numOfMonthsAttended, dateOfDropout, enrollmentID, courseName, dateOfEnrollment);
                        studentList.add(dropoutStudent);
                        String registeredInformation = "Enrollment ID: " + enrollmentID + "\n" +
                            "Name: " + studentName + "\n" +
                            "Date of Birth: " + dateOfBirth + "\n" +
                            "Tuition Fee: " + tuitionFee + "\n" +
                            "Date of Enrollment: " + dateOfEnrollment + "\n" +
                            "Course Name: " + courseName + "\n" +
                            "Course Duration: " + courseDuration + " months\n" +
                            "Number of Remaining Modules: " + numOfRemainingModules + "\n" +
                            "Number of Months Attended: " + numOfMonthsAttended + "\n" +
                            "Date of Dropout:" + dateOfDropout;

                        JOptionPane.showMessageDialog(null, registeredInformation, "Student Information", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Thank you for registering.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for course duration, tuition fee, number of remaining modules, and number of months attended.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            // Handle any other exceptions that might occur during the parsing
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.");
        }
    }

    //Clear Regular Field
    public void clearRegular(){
        txtEnrollmentID.setText("");
        txtStudentName.setText("");
        txtCourseName.setSelectedIndex(0);
        txtCourseDuration.setText("");
        txtDateofEnrollmentDay.setSelectedIndex(0);
        txtDateofEnrollmentMonth.setSelectedIndex(0);
        txtDateofEnrollmentYear.setSelectedIndex(0);
        txtDateofBirthDay.setSelectedIndex(0);
        txtDateofBirthMonth.setSelectedIndex(0);
        txtDateofBirthYear.setSelectedIndex(0);
        txtTuitionFee.setText("");
        txtNumOfModules.setText("");
        txtNumOfCreditHours.setText("");
        txtDaysPresent.setText("");
    }
    // Clear Dropout Fields
    public void clearDropout() {
        txtenrollmentId.setText("");
        txtstudentName.setText("");
        txtcourseName.setSelectedIndex(0);
        txtcourseDuration.setText("");
        txtdateOfEnrollmentDay.setSelectedIndex(0);
        txtdateOfEnrollmentMonth.setSelectedIndex(0);
        txtdateOfEnrollmentYear.setSelectedIndex(0);
        txtdateOfBirthDay.setSelectedIndex(0);
        txtdateOfBirthMonth.setSelectedIndex(0);
        txtdateOfBirthYear.setSelectedIndex(0);
        txtdateOfDropoutDay.setSelectedIndex(0);
        txtdateOfDropoutMonth.setSelectedIndex(0);
        txtdateOfDropoutYear.setSelectedIndex(0);
        txttuitionFee.setText("");
        txtNumOfRemainingModules.setText("");
        txtNumOfMonthsAttended.setText("");

    }
    //calculate present percentage
    public void presentPercentage(){
        try {
            // Parse the numeric value for daysPresent from the text field
            double daysPresent = Double.parseDouble(txtDaysPresent.getText());

            // Parse other required values from text fields
            int enrollmentID = Integer.parseInt(txtEnrollmentID.getText());
            String dateOfBirth = txtDateofBirthDay.getSelectedItem()+"-"+(txtDateofBirthMonth.getSelectedIndex() + 1) + "-" + txtDateofBirthYear.getSelectedItem();
            String courseName = txtCourseName.getSelectedItem().toString();
            String studentName = txtStudentName.getText();
            String dateOfEnrollment =txtDateofEnrollmentDay.getSelectedItem()+"-"+(txtDateofEnrollmentMonth.getSelectedIndex() + 1) + "-" + txtDateofBirthYear.getSelectedItem();
            int courseDuration = Integer.parseInt(txtCourseDuration.getText());
            double tuitionFee = Double.parseDouble(txtTuitionFee.getText());
            int numOfModules = Integer.parseInt(txtNumOfModules.getText());
            int numOfCreditHours = Integer.parseInt(txtNumOfCreditHours.getText());

            // Regular class with the required parameters
            Regular regularStudent = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee, numOfModules, numOfCreditHours, daysPresent);

            // Call the presentPercentage method of Regular class and get the result
            char result = regularStudent.presentPercentage(daysPresent);

            // Show the result in a dialog box
            String message = ("Present Percentage: " + result + "%");
            JOptionPane.showMessageDialog(frame_StudentGUI, "Present Percentage: " + message , "Present Percentage", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            //Handle numerical exception
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for daysPresent.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            // Handle any other exceptions that might occur during the process
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Alert", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void btnGrandCertificate(){
        try {
            String enrollmentIDText = JOptionPane.showInputDialog(null, "Enter the Enrollment ID of the Student:", "Grant Certificate", JOptionPane.QUESTION_MESSAGE);

            // Check if the user clicked "OK" and entered a value
            if (enrollmentIDText != null && !enrollmentIDText.isEmpty()) {
                int enrollmentID = Integer.parseInt(enrollmentIDText);

                // Find the Regular student with the given enrollmentID
                Regular regularStudent = null;
                for (Student student : studentList) {
                    if (student instanceof Regular){ 
                        if(student.getEnrollmentID() == enrollmentID) {
                            regularStudent = (Regular) student;
                            break;
                        }
                    }}

                // If the Regular student with the given enrollmentID is found
                if (regularStudent != null) {
                    String courseName = regularStudent.getCourseName();
                    String dateOfEnrollment = regularStudent.getDateOfEnrollment();

                    // Calculate the present percentage
                    double daysPresent = regularStudent.getDaysPresent();
                    char presentPercentage = regularStudent.presentPercentage(daysPresent);

                    // Check if the present percentage is "A" or 80%
                    if (presentPercentage == 'A' || daysPresent >= 80) {
                        regularStudent.grantCertificate(courseName, enrollmentID, dateOfEnrollment);

                        boolean isGrantedScholarship = regularStudent.getIsGrantedScholarship();
                        String scholarshipStatus = isGrantedScholarship ? "Granted" : "Not Granted";

                        JOptionPane.showMessageDialog(null, "Certificate granted for Enrollment ID: " + enrollmentID + "\nScholarship Status: " + scholarshipStatus, "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Scholarship is not granted. Present percentage is below 80%.", "Not Granted", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No Regular student found with the Enrollment ID: " + enrollmentID, "Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                // Show a message if the user canceled or entered an empty value
                JOptionPane.showMessageDialog(null, "Please enter a valid Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    //display
    public void display(){
        // Create a new DefaultTableModel with column headers
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Enrollment ID", "Student Name", "Course Name", "Course Duration",
                "Date of Enrollment", "Date of Birth", "Tuition Fee", "Student Type"});

        // Add data to the model from the studentList
        for (Student student : studentList) {
            model.addRow(new Object[]{
                    student.getEnrollmentID(),
                    student.getStudentName(),
                    student.getCourseName(),
                    student.getCourseDuration(),
                    student.getDateOfEnrollment(),
                    student.getDateOfBirth(),
                    student.getTuitionFee(),
                    student instanceof Regular ? "Regular Student" : "Dropout Student"
                });
        }

        // Create a JTable with the model
        table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        // Wrap the JTable in a JScrollPane to enable scrolling
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Create a panel and add the JScrollPane to it
        JPanel panelDisplay = new JPanel(new BorderLayout());
        panelDisplay.add(scroll, BorderLayout.CENTER);

        // Create "Remove Dropout" and "Clear" buttons

        btnClear = new JButton("Clear");

        // Add action listeners to the buttons
        btnClear.addActionListener(this);

        // Create a panel for buttons
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new FlowLayout());
        panelButtons.add(btnClear);

        // Add the buttons panel to the main panel
        panelDisplay.add(panelButtons, BorderLayout.SOUTH);

        // Create a new JFrame to display the panel with the table
        JFrame displayFrame = new JFrame("Student Records");
        displayFrame.setSize(800, 800);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.add(panelDisplay);
        displayFrame.setVisible(true);

        btnClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    studentList.clear();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    JOptionPane.showMessageDialog(displayFrame, "List Cleared Successfully");
                }
            });

    }
    // Remove Dropout Student
    public void removeDropout() {
        String enrollmentIDText = JOptionPane.showInputDialog(null, "Enter the Enrollment ID of the student to remove:", "Remove Student", JOptionPane.QUESTION_MESSAGE);

        try {
            // Check if the enrollmentID field is not empty and the user clicked "OK"
            if (enrollmentIDText != null && !enrollmentIDText.isEmpty()) {
                // Parse the enrollmentID value from the user input
                int enrollmentID = Integer.parseInt(enrollmentIDText);

                // Find the Dropout student with the given enrollmentID
                Dropout dropoutStudent = null;
                for (Student student : studentList) {
                    if (student instanceof Dropout && student.getEnrollmentID() == enrollmentID) {
                        dropoutStudent = (Dropout) student;
                        break;
                    }
                }

                // If the student with the given enrollmentID is found, remove it from the list
                if (dropoutStudent != null) {
                    studentList.remove(dropoutStudent);
                    JOptionPane.showMessageDialog(null, "Student with Enrollment ID: " + enrollmentID + " has been removed.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No Dropout student found with the Enrollment ID: " + enrollmentID, "Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                // Show a message if the user canceled or entered an empty value
                JOptionPane.showMessageDialog(null, "Please enter a valid Enrollment ID to remove the student.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Pay bills
    public void payBills(){
        try {
            // Ask for Enrollment ID
            String enrollmentIDText = JOptionPane.showInputDialog(null, "Enter Enrollment ID:", "Pay Bills", JOptionPane.PLAIN_MESSAGE);
            if (enrollmentIDText == null || enrollmentIDText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enrollment ID cannot be empty.", "Alert", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int enrollmentID = Integer.parseInt(enrollmentIDText);

            // Dropout student with the given enrollmentID
            Dropout dropoutStudent = null;
            for (Student student : studentList) {
                if (student instanceof Dropout && student.getEnrollmentID() == enrollmentID) {
                    dropoutStudent = (Dropout) student;
                    break;
                }
            }

            // If the student with the given enrollmentID is found, ask for Tuition Fee and Amount Paid
            if (dropoutStudent != null) {
                // Ask for Tuition Fee
                String tuitionFeeText = JOptionPane.showInputDialog(null, "Enter Tuition Fee:", "Pay Bills", JOptionPane.PLAIN_MESSAGE);
                if (tuitionFeeText == null || tuitionFeeText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tuition Fee cannot be empty.", "Alert", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Ask for Amount Paid
                String amountPaidText = JOptionPane.showInputDialog(null, "Enter Amount Paid:", "Pay Bills", JOptionPane.PLAIN_MESSAGE);
                if (amountPaidText == null || amountPaidText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Amount Paid cannot be empty.", "Alert", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                double amountPaidByStudent = Double.parseDouble(amountPaidText);

                boolean isPaid = dropoutStudent.billsPayable(amountPaidByStudent); // Pass the amountPaid argument here

                if (isPaid) {
                    JOptionPane.showMessageDialog(null, "Bills paid successfully for the student with Enrollment ID: " + enrollmentID, "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Check if the remaining amount is fully paid
                    boolean isFullyPaid = dropoutStudent.getRemainingAmount() == 0;
                    if (isFullyPaid) {
                        JOptionPane.showMessageDialog(null, "The student has fully paid the remaining amount.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Bills are not fully paid for the student with Enrollment ID: " + enrollmentID, "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Dropout student found with the Enrollment ID: " + enrollmentID, "Not Found", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Enrollment ID, Tuition Fee, and Amount Paid.", "Alert", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegular) {
            regular_UIUX();
            frame_StudentGUI.dispose();
        }else if (e.getSource() == btnDropout) {
            dropout_UIUX();
            frame_StudentGUI.dispose();
        } else if (e.getSource() == regSubmit) {
            addRegular();
        } else if (e.getSource() == reset) {
            clearRegular();;
        } else if (e.getSource() == backRegular) {
            frame_StudentGUI.setVisible(true);
            frame_RegularGUI.dispose();

        } else if (e.getSource() == submitDropout) {
            submitDropout();

        } else if (e.getSource() == resetDropout) {
            clearDropout();
        } else if (e.getSource() == backDropout) {
            frame_StudentGUI.setVisible(true);
            frame_DropoutGUI.dispose();

        } else if (e.getSource() == btnDisplayRegular) {
            display();

        } else if (e.getSource() == btnDisplayDropout){
            display();
        }else if (e.getSource() == removeStudent) {
            removeDropout();
        } else if (e.getSource() == btnPayBills) {
            payBills();

        }else if (e.getSource() == btnPresentPercentage){
            presentPercentage();

        }else if (e.getSource() == btnGrantCertificate){
            btnGrandCertificate();

        }
    }

    // String Courses 
    public String[] Courses() {
        return new String[] {"Computing","Networking","Multimedia"};
    }
    //String for Years
    public String[] Years() {
        return new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", 
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", 
            "2020", "2021", "2022", "2023"};
    }
    //String for Months
    public String[] Months() {
        return new String[] { "1","2","3","4","5","6","7","8","9","10","11","12"};
    }
    //String for Days
    public String[] Days() {
        return new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31"};
    }
    //Main Method
    public static void main(String[] args) {
        new Student_GUI();
    }
}