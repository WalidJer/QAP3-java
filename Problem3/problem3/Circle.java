package problem3;
public class Circle extends Shape {

    //attributes
    private double radius;

    // Constructor for Circle with a default name "Circle".
    public Circle(double radius) {
        super("Circle"); 
        this.radius = radius;
    }

    
    // Constructor for Circle with a specified name.
  
    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }


    // Calculates the area of the circle.

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

   
    // Calculates the perimeter (circumference) of the circle.
   
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    //toString method
    @Override
    public String toString() {
        return super.toString() +  String.format(" Radius: %.2f", radius);
    }




}
