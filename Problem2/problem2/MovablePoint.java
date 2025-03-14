package problem2;
public class MovablePoint extends Point {

    //attributes
    private float xSpeed;
    private float ySpeed;

    //constructors

    // Default Constructor - Initializes xSpeed and ySpeed to 0.0f
    public MovablePoint(){

        // Calls the default constructor of Point
        super(); 
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Constructor with speed only
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with parameters
    public MovablePoint(float x, float y,float xSpeed, float ySpeed){

        // Calls the constructor of Point to set x and y
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    //Getters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    //Setters

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    public MovablePoint move(){

        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;

    }

    
    @Override
    public String toString() {
        
        return super.toString() +", speed=("+ this.xSpeed+ ", "+ this.ySpeed+")";
    }
    
}
