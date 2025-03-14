package problem4;

public class Demo {

    public static void main(String[] args) {
        // Create objects from different shape classes
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Ellipse(9, 6);
        shapes[2] = new Triangle(5, 6, 7);
        shapes[3] = new EquilateralTriangle(8);

        // Print details before scaling (WITH HEADERS)
        System.out.println("===================================================================================");
        System.out.println("                                SHAPE DETAILS BEFORE SCALING                       ");
        System.out.println("===================================================================================");
        System.out.printf("%-25s %-12s %-12s %-25s%n", "Shape Type", "Area", "Perimeter", "Additional Info");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]); // Calls toString() from Shape.java
            System.out.println("-----------------------------------------------------------------------------------");
        }

        // Apply scaling
        double scaleFactor = 2;
        System.out.println("\nApplying scale factor: " + scaleFactor + "\n");

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].scale(scaleFactor);
        }

        // Print details after scaling
        System.out.println("===================================================================================");
        System.out.println("                                SHAPE DETAILS AFTER SCALING                        ");
        System.out.println("===================================================================================");
        System.out.printf("%-25s %-12s %-12s %-25s%n", "Shape Type", "Area", "Perimeter", "Additional Info");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]); 
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }
    
}
