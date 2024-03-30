package JogoDaMoeda.Pessoa;

public class Agressivo extends Pessoa{
    private int betrayal;
  private int angry;
  Agressivo()
  { 
    this.betrayal = 0;
    this.angry = 0;
    setPlay(1);
  }
  
  @Override
  public void setLastPlay(int play)
  {
    if (play == 0 && betrayal == 0 && angry == 0)
    {
      betrayal = 3;
      angry = 1;
      setPlay(0);
    }
    if(betrayal > 0)
    {
      setPlay(0);
      betrayal--;
    }
    else
    {
      angry = 0;
      setPlay(1);
    }
  }
}
