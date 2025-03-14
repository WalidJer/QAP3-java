package problem1;
public class Person{

    //attributes
    protected String myName; // Name of the person
    protected int myAge;  // Person's age
    protected String myGender; // "M" for Male, "F" for Female
    
    // constructor
    public Person(String name, int age, String gender){

        this.myName = name;
        this.myAge = age;
        this.myGender = gender; 

    }

    //Getters
    public String getMyName() {
        return myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    //Setters
    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }


    // toString method
    @Override
    public String toString() {
        
        return (myName + ", age: "   + myAge + ", gender: "  + myGender);
    }

}