package problem2;
public class Demo {

    public static void main(String[] args) {
         // Create the Point object
         Point point = new Point(1.0f, 2.0f);
         System.out.println();
         System.out.println("Point: " + point);
 
         // Create the MovablePoint object
         MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
         System.out.println("MovablePoint before moving: " + movablePoint);
 
         // Move the MovablePoint for the first time
         movablePoint.move();
         System.out.println("MovablePoint after first move: " + movablePoint);

        // Move the MovablePoint again 
        movablePoint.move();
        System.out.println("MovablePoint after another move: " + movablePoint);
        System.out.println();
    }
    
}
