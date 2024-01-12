import java.lang.Exception;
import java.lang.RuntimeException;

class Main
{
    public static void main(String[] args)
    {
        try
        {
            funcA();
        }
        catch (RuntimeException e)
        {
            System.out.println("Runtime Exception!!");
        }
        catch (Exception e)
        {
            e.printStackTrace();  
        }

        System.out.println("Olá!");
    }

    static void funcA()
        throws MyException
    {
        try
        {
            funcB();
        }
        catch (MyRuntimeException e)
        {
            throw new MyException(e);
        }
        catch (Exception e)
        {
             throw e;   
        }
        finally
        {
            System.out.println("Liberando recursos...");
        }
    }

    static void funcB()
    {
        throw new MyRuntimeException();
    }
}
