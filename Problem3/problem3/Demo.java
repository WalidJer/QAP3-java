
package problem3;
public class Demo {
    public static void main(String[] args) {
        // Create objects from different shape classes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Ellipse(9, 6);
        shapes[2] = new Triangle(5, 6, 7);
        shapes[3] = new Equilateral(8);

        System.out.println("=======================================================================");
        System.out.println("                          SHAPE DETAILS REPORT               ");
        System.out.println("=======================================================================");
        System.out.printf("%-25s %-12s %-12s %-15s%n", "Shape Type", "Area", "Perimeter", "Additional Info");
        System.out.println("-----------------------------------------------------------------------");

        //  Loop through the array 
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]); 
            System.out.println("---------------------------------------------------------------------------");
        }
    }
    
}
