package Exception;

public class Result 
{
    private double x;

    private double y;
    Result(double x, double y)
    {
        this.x = x;
        this.y = y;
    }   

    @Override
    public String toString()
    {
        return "(X: " + x + "Y: " + y + ")";
    }
}
