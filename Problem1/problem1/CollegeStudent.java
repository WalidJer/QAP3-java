package problem1;
public class CollegeStudent extends Student {

    private String myMajor; // Example: "Electrical Engineering", "Communications"
    private int year; // Year in college, Example: 1 = FROSH, 2 = SOPH, etc.

    //constructor
    public CollegeStudent(String name, int age, String gender,String id, double gpa, int year, String major){

        // Use Student constructor
        super(name, age, gender, id, gpa);

        // Initialize new properties
        this.year = year;
        this.myMajor = major;
        

    }

    //Getters
    public String getMyMajor() {
        return myMajor;
    }

    public int getYear() {
        return year;
    }

    //Setters

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        
        return super.toString() + ", year: "+ this.year + ", major: "+ this.myMajor ;
    }
    
}
