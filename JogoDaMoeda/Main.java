package JogoDaMoeda;

import JogoDaMoeda.Jogo;

class Main {
  public static void main(String[] args) 
  {
    
    Jogo jogo = new Jogo(1, 1, 1, 1, 1, 1, false);

    for (int i = 0; i < 5; i++)
    {
      System.out.print(i + 1 + "º Rodada: ");
      jogo.round();
      System.out.println();  
    }
  }
}