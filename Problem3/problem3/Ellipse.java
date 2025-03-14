package problem3;
public class Ellipse extends Shape {

    //attributes 
    private double a; // Major axis
    private double b; // Minor axis

    
    // Default constructor initializes an ellipse with default values.
     
    public Ellipse() {
        super("Ellipse"); 
        this.a = 1.0;
        this.b = 1.0;
    }


    // Constructor for Ellipse with specified major and minor axes.

    public Ellipse(double a, double b) {
        super("Ellipse"); 
        if (a >= b) { 
            this.a = a;
            this.b = b;
        } else {
            this.a = b; // Ensure `a` is always the major axis
            this.b = a;
        }
    }

    
    // Constructor for Ellipse with a specific name.

    public Ellipse(double a, double b, String name) {
        super(name);
        if (a >= b) { 
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // Setters
    public void setA(double a) {
        if (a >= b) {
            this.a = a;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    public void setB(double b) {
        if (b <= a) {
            this.b = b;
        } else {
            this.b = a;
            this.a = b;
        }
    }

    
    // Calculates the area of the ellipse.

    @Override
    public double getArea() { 
        return Math.PI * a * b;
    }


    // Calculates the approximate perimeter of the ellipse.

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + String.format(" Major Axis: %.2f, Minor Axis: %.2f", a, b);
    }
}
