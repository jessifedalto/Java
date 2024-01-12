import java.lang.RuntimeException;

public class MyRuntimeException extends RuntimeException
{
  public MyRuntimeException()
  {
    super("Ocorreu o meu erro de tempo de execução");
  }
}
