package Enum;

public class Robot {
    private State state;
    private Integer x = 0;
  
    private Integer y = 0;

    public void setState(State value)
    {
        this.state = value;
    }

    public Robot(){
        this.state = State.OFF;
    }

    // public void run()
    // {
    //     if (this.state.equals(State.OFF)) {
    //         return;
    //     }
    //     System.out.println("Trabalhando");
    // }

    public void move(State direction)
    {
        if (this.state.equals(State.ON)) {
            if (direction.equals(State.DIREITA)) 
            {
                this.x = x + 1;
            }

             if (direction.equals(State.ESQUERDA)) 
            {
                this.x = x - 1;
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
