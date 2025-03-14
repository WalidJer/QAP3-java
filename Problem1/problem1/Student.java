package problem1;
public class Student extends Person{

    //attributes
    protected String myIdNum; // Student ID Number
    protected double myGPA; // Grade Point Average
    
    public Student(String name, int age, String gender,String id, double gpa){

        // Use Person constructor
        super(name, age, gender);

        // Initialize what's new to Student
        this.myIdNum = id;
        this.myGPA = gpa;
    }

    //Getters
    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    //Setters
    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }


    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID Number: " + this.myIdNum + ", GPA: " + this.myGPA;
    }
    
}
