package Robot;

public enum Way 
{
    BEHIND_SLOW(-1), 
    AHEAD_SLOW(1), 
    BEHIND_FAST(-2), 
    AHEAD_FAST(2);
    private Integer speed;

    Way(Integer speed)
    {
        this.speed = speed;
    }
    
    public Integer getSpeed() 
    {
        return speed;
    }


}
