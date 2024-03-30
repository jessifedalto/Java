package JogoDaMoeda.Pessoa;

public class Pessoa 
{
  public int play;
  public int balance;

  Pessoa(){
    this.play = 0;
    this.balance = 10;
  }  
  
  public int getBalance()
  {
    return this.balance;
  }

  public int getPlay()
  {
    return this.play;
  }

  public void setPlay(int play)
  {
    this.play = play;
  }
  
  public void setBalance(int balance)
  {
    this.balance = balance;
  }

  public void setLastPlay(int play){
   
  }
  
} 
