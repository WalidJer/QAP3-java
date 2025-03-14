package problem2;
public class Point {

    //attributes
    private float x;
    private float y;

    //constructors

     // Default Constructor
    public Point(){

        this.x =  0.0f;
        this.y = 0.0f;
    }

    // Constructor with parameters
    public Point(float x, float y){

        this.x = x;
        this.y = y;
    }

    //Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY(){

        return new float[]{x, y};

    }

    //Setters
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){

        this.x = x;
        this.y = y;
    }

    //toString method
    @Override
    public String toString() {
        
        return "("+ this.x + "," + this.y +")"; 
    }


}