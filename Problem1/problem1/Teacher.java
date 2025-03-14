package problem1;
public class Teacher extends Person {

    //attributes
    private String mySubject; // Example: "Computer Science", "Chemistry"
    private double mySalary; // annual salary

    public Teacher(String name, int age, String gender, String subject, double salary){

        // Use Person constructor
        super(name, age, gender);

        // Initialize new properties
        this.mySubject = subject;
        this.mySalary = salary;
    }

    //Getters
    public String getMySubject() {
        return mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    //Setters
    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

     // toString method
    @Override
    public String toString() {
        return super.toString()+ ", subject: "+ this.mySubject + ", annual salary: $" + this.mySalary;
    }

    
}
