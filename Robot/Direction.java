package Robot;

public enum Direction 
{
    RIGHT_15(15), LEFT_15(-15), RIGHT_30(30), LEFT_30(-30);

    private Integer angle;

    Direction(Integer angle)
    {
        this.angle = angle;
    }

    public Integer getAngle() 
    {
        return angle;
    }
    
}