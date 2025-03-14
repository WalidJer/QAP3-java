package problem4;
public class EquilateralTriangle extends Triangle {

    
    /**
     * Constructor for Equilateral Triangle.
     * Calls the Triangle constructor with equal side lengths.
     * @param side The length of all three equal sides.
     * @param name The name of the equilateral triangle.
     */
    public EquilateralTriangle(double side) {
   
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }

    public EquilateralTriangle(double side, String name) {
        super(side, side, side, name);
    }

   
    // Gets the side length of the equilateral triangle.

    public double getSide() {
        return getSide1(); 
    }


    
    @Override
    public void scale(double factor) {
        
        super.scale(factor);
    }

    
    // Calculates the area of the equilateral triangle 

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getSide1(), 2);
    }

    
    //Calculates the perimeter of the equilateral triangle.

    @Override
    public double getPerimeter() {
        return 3 * getSide1();
    }

    
}
