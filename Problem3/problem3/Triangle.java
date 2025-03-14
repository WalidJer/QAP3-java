package problem3;
public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

   
    // Constructor for Triangle. Ensures that the sides form a valid triangle.

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: The sides (" + side1 + ", " + side2 + ", " + side3 + ") do not form a valid triangle.");
            System.out.println(" Terminating program due to invalid triangle.");
            System.exit(1);  //Terminates the program
        }
    }

    public Triangle(double side1, double side2, double side3, String name) {
        super(name);

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: The sides (" + side1 + ", " + side2 + ", " + side3 + ") do not form a valid triangle.");
            System.out.println(" Terminating program due to invalid triangle.");
            System.exit(1);  
        }
    }

    
    // Calculates the area of the triangle .

    @Override
    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        return Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
    }

    
    // Calculates the perimeter of the triangle.

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Getters
    public double getSide1() { 
        return side1; 
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3; 
    }


    // Sets new side lengths for the triangle, ensuring validity.

    public void setSides(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            System.out.println("Triangle sides updated successfully.");
        } else {
            System.out.println("Error: The new sides (" + side1 + ", " + side2 + ", " + side3 + ") do not form a valid triangle.");
            System.out.println("Triangle remains unchanged.");
        }
    }

    //toString method 
    @Override
    public String toString() {
        return super.toString() +String.format(" Sides: (%.2f, %.2f, %.2f)", side1, side2, side3);
    }
}
