package Enum;

public class FastRobot {
    private State state;
    private Double x;
    private Double y;
    private int angle;

    public FastRobot(){
        this.state = State.OFF;
        this.x = 0.0;
        this.y = 0.0;
        this.angle = 0;
    }

    public void setState(State value)
    {
        this.state = value;
    }

    public void move(State direction, State velocityState)
    {
        if (this.state.equals(State.ON)) {
            if (direction.equals(State.CIMA)) 
            {
                if (velocityState.equals(State.UM)) 
                {
                    this.x += 1 * Math.cos(Math.toRadians(this.angle));
                    this.y += 1 * Math.sin(Math.toRadians(this.angle));
                }

                else
                {
                    this.x += 2 * Math.cos(Math.toRadians(this.angle));
                    this.y += 2 * Math.sin(Math.toRadians(this.angle));
                }
                
            }

            if (direction.equals(State.BAIXO)) 
            {
                if (velocityState.equals(State.UM)) 
                {
                    this.x -= 1 * Math.cos(Math.toRadians(this.angle));
                    this.y -= 1 * Math.sin(Math.toRadians(this.angle));
                }
                else
                {
                    this.x += 2 * Math.cos(Math.toRadians(this.angle));
                    this.y += 2 * Math.sin(Math.toRadians(this.angle));
                }
            }
        }
    }

    public void rotate(State direction, State angle)
    {
        if (this.state.equals(State.ON))
        {
            if (angle.equals(State.QUINZE) && direction.equals(State.DIREITA)) 
            {
                this.angle -= 15;
            }
            if (angle.equals(State.QUINZE) && direction.equals(State.ESQUERDA)) 
            {
                this.angle += 15;   
            }
            if (angle.equals(State.TRINTA) && direction.equals(State.DIREITA)) 
            {
                this.angle -= 30;
            }
            if (angle.equals(State.TRINTA) && direction.equals(State.ESQUERDA)) 
            {
                this.angle += 30;   
            }
        }
    }

    public void jump(State direction)
    {
        if (this.state.equals(State.ON)) {
            if (direction.equals(State.CIMA)) 
            {
                this.y = y + 2;
            }

            if (direction.equals(State.BAIXO)) 
            {
                this.y = y - 2;
            }
        }
    }


    @Override
    public String toString()
    {
        return "(" + x.toString() + ", " + y.toString() + ")";
    }
}
