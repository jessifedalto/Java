package JogoDaMoeda.Pessoa;

public class Ressentido extends Pessoa{
    private int sad = 0;
  
    Ressentido()
    {
      setPlay(1);
    }
    
    @Override
    public void setLastPlay(int play)
    {
      if (play == 0)
      {
        sad = 1;
      }
      if(sad == 1){
        setPlay(0);
      }
    }
}
