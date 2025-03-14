package problem4;
public abstract class Shape implements Scalable{

    //attributes
    protected String name;

    //constructor

    public Shape(String name){

        this.name = name;     
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();

    public abstract double getPerimeter();

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


    //toString method

    @Override
    public String toString() {
        
        return String.format("%-25s %-12.2f %-12.2f", name, getArea(), getPerimeter());
        
    }

    
}
