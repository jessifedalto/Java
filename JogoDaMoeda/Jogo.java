package JogoDaMoeda;

import java.util.LinkedList;
import java.util.Random;
import JogoDaMoeda.Pessoa.*;
import java.util.Scanner;

public class Jogo 
{
  public LinkedList<Pessoa> Population;
  public int qtt;
  public int qtt_bondoso;
  public int qtt_trapaceiro;
  public int qtt_resentido;
  public int qtt_copiador;
  public int qtt_agressivo;
  public int qtt_indeciso;
  public Boolean unlucky;

  Jogo(int qtt_bondoso, int qtt_trapaceiro, int qtt_resentido, int  qtt_copiador, int qtt_agressivo, int qtt_indeciso, Boolean unlucky)
  {
    this.qtt = qtt_bondoso + qtt_trapaceiro + qtt_resentido + qtt_copiador + qtt_agressivo + qtt_indeciso;
    this.Population = new LinkedList<Pessoa>();
    this.qtt_bondoso = qtt_bondoso;
    this.qtt_trapaceiro = qtt_trapaceiro;
    this.qtt_resentido = qtt_resentido;
    this.qtt_copiador = qtt_copiador;
    this.qtt_agressivo = qtt_agressivo;
    this.qtt_indeciso = qtt_indeciso;
    this.unlucky = unlucky;

    System.out.println("Quantidade de pessoas: " + this.qtt);
    
    for (int i = 0; i < qtt; i++)
    {
      if (qtt_bondoso > 0)
      {
        Population.add(new Bondoso()); 
        qtt_bondoso--;
      }
      else if (qtt_trapaceiro > 0)
      {
        Population.add(new Trapaceiro());
        qtt_trapaceiro--;
      }
      else if (qtt_resentido > 0)
      {
        Population.add(new Ressentido());
        qtt_resentido--;
      }
      else if (qtt_copiador > 0)
      {
        Population.add(new Copiador());
        qtt_copiador--;
      }
      else if (qtt_agressivo > 0)
      {
        Population.add(new Agressivo());
        qtt_agressivo--;
      }
      else if (qtt_indeciso > 0)
      {
        Population.add(new Indeciso());    
        qtt_indeciso--;    
      }
    }
  }

  public void round()
  {
    Random random = new Random();
    int random_number_1;
    int random_number_2;

    Scanner sc = new Scanner(System.in);

    if (Population.size() == 1){
      System.out.println("R.I.P. " + Population.get(0).getClass().getSimpleName());
      return;
    }

    if (unlucky == true)
    {
      unlucky();
    }
    
    for (int i = 0; i < Population.size()/2; i++)
    {
      sc.nextLine();
      random_number_1 = random.nextInt(qtt);
      random_number_2 = random.nextInt(qtt);

      while (random_number_1 == random_number_2){
          random_number_2 = random.nextInt(qtt);
      }

      var player_1 = Population.get(random_number_1);
      var player_2 = Population.get(random_number_2);

      int play_1 = player_1.getPlay();
      int play_2 = player_2.getPlay();
      player_1.setBalance(player_1.getBalance() - play_1);
      player_2.setBalance(player_2.getBalance() - play_2);
      
      System.out.println();
      System.out.println(player_1.getClass().getSimpleName() + random_number_1 + ":" + play_1);
      System.out.println(player_2.getClass().getSimpleName() + random_number_2 + ":" + play_2);

      if (play_1 == play_2)
      {
        if(play_1 == 0)
        {
          System.out.println("Ambos trapacearam >:(");
        }
        else
        {
          System.out.println("Ambos ganharam moedas :)");
          player_1.setBalance(player_1.getBalance() + 2);
          player_2.setBalance(player_2.getBalance() + 2);
        }
      }
      else
      {
        if(play_1 == 0)
        {
          System.out.println("O player " + i + " trapaceou >:(");
          player_1.setBalance(player_1.getBalance() + 5);
        }
        else
        {
          System.out.println("O player " + i + " trapaceou >:(");
          player_2.setBalance(player_2.getBalance() + 5);
        }
      }
      Population.get(random_number_1).setLastPlay(play_2);
      Population.get(random_number_2).setLastPlay(play_1); 
    }
    survivalCourse();   
    showBalance();
  }

  public void survivalCourse(){
    for (int i = 0; i < qtt; i++)
    {
      if (Population.get(i).getBalance() <= 0)
      {
        System.out.println("O player " + Population.get(i).getClass().getSimpleName() + " morreu.");
        Population.remove(i);
        this.qtt = Population.size();
      }
    }
    for (int i = 0; i < qtt; i++){
      if (Population.get(i).getBalance() >= 20)
      {  
        int balance = Population.get(i).getBalance() / 2;
        
        Population.get(i).setBalance(balance);
        Population.add(Population.get(i));
        this.qtt = Population.size();
        System.out.println("O player " + Population.get(i).getClass() + " teve um filho.");
      }
    }
  }

  public void showBalance(){
    for (int i = 0; i < qtt; i++)
    {
      Population.get(i).setBalance(Population.get(i).getBalance() - 1);
      System.out.println("Saldo " + Population.get(i).getClass() + ": " + Population.get(i).getBalance());
    }
  }

  public void unlucky()
  {
    Random random = new Random();
    for (int i = 0; i < 10; i++)
    {
      int random_number = random.nextInt(qtt);
      Population.get(random_number).setBalance(Population.get(random_number).getBalance() - 1);
    }
  }
}