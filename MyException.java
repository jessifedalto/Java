import java.lang.Exception;
import java.lang.Throwable;

public class MyException extends Exception
{
  public MyException(Throwable cause)
  {
    super("Ocorreu o meu erro", cause);
  }
}
