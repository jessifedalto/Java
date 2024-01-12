package Robot;

import java.util.LinkedList;

public class FastRobot {
    private State state;
    private Double x;
    private Double y;
    private int angle;
    private static LinkedList<FastRobot> list = new LinkedList<>();
    
    public FastRobot(){
        this.state = State.OFF;
        this.x = 0.0;
        this.y = 0.0;
        this.angle = 0;
        list.add(this);
    }
    
    public Double getX() 
    {
        return x;
    }
    
    public Double getY() {
        return y;
    }
    
    public void setState(State value)
    {
        this.state = value;
    }
    
    public State getState() {
        return state;
    }    

    public void move(Way velocity)
    {
        if (this.state.equals(State.OFF)) 
        {
            return;
        }
        
        x += velocity.getSpeed() * Math.cos(Math.toRadians((angle)));
        y += velocity.getSpeed() * Math.sin(Math.toRadians((angle)));
    }

    public void rotate(Direction direction)
    {
        if (this.state.equals(State.OFF)) 
        {
            return;
        }
            angle += direction.getAngle();
    }

    public static void moveAll(Way velocity)
    {
        for (FastRobot robot : list )
        {
            robot.move(velocity);
        }
    }

    @Override
    public String toString()
    {
        return "(" + x.toString() + ", " + y.toString() + ")";
    }
}

