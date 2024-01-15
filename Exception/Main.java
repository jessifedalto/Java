package Exception;

import java.util.Scanner;


import javax.lang.model.type.MirroredTypeException;

import java.lang.Exception;
import java.lang.RuntimeException;


public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer option;
        option = menu();
        switch (option) {
            case 1:
                try 
                {
                    System.out.println("Choose the coefficients");
                    Double a  = input.nextDouble();
                    Double b = input.nextDouble();
                    Double c = input.nextDouble();

                    System.out.println(funcA(a, b,c));
                } 
                
                catch (DivisionByZeroException e) 
                {
                    System.out.println("Division by Zero Exception");
                    e.printStackTrace();
                }

                catch(NegativeDelta e)
                {
                    System.out.println("Negative Delta");
                    e.printStackTrace();
                }

                break;
        
            case 2:
            try 
            {
                System.out.println("Choose the coefficients");
                Double a  = input.nextDouble();
                Double b = input.nextDouble();
                Double c = input.nextDouble();  
                
                System.out.println(funcB(a, b, c));    
            } 

            catch (DivisionByZeroException e) 
            {
                System.out.println("DivisionByZeroException");
                e.printStackTrace();
            }
            
            break;

            case 3:
            try 
            {
                System.out.println("Choose the coefficients");
                Double a  = input.nextDouble();
                Double b = input.nextDouble();
                Double c = input.nextDouble();
                Double d  = input.nextDouble();
                Double e = input.nextDouble();
                Double f = input.nextDouble();  
                
                System.out.println(funcC(a, b, c, d , e , f));    
            } 
            
            catch (DivisionByZeroException e) 
            {
                System.out.println("DivisionByZeroException");
                e.printStackTrace();
            }
                break;
        }
    }

    public static Integer menu()
    {
        System.out.println(" 1 - Quadratic function");
        System.out.println(" 2 - Linear function");
        System.out.println(" 3 - 2x2 System");
        Scanner input = new Scanner(System.in);
        Integer op  = input.nextInt();

        return op;
    }

    public static Result funcA(Double a, Double b, Double c) throws DivisionByZeroException, NegativeDelta
    {
        if (a == 0) {
            throw new DivisionByZeroException();
        }

        double delta = ((b *b) - 4 * a * c);

        if (delta < 0)
        {
            throw new NegativeDelta();
        }

        double x1 = ((- b + Math.sqrt(delta)) / 2 * a);
        double x2 = ((- b - Math.sqrt(delta)) / 2 * a);

        return new Result(x1, x2);
    }

    public static double funcB(Double a, Double b, Double c) throws DivisionByZeroException
    {
        if (a == 0) 
        {
            throw new DivisionByZeroException();
        }

        double x = (c - b)/ a;
        return x;
    }

    public static Result funcC(Double a, Double b, Double c, double d, double e, double f) throws DivisionByZeroException
    {
        if ((a * e) - (d * b) == 0) 
        {
            throw new DivisionByZeroException();
        }

        double y = ((a * f) - (d * c) / (a * e) - (d * b));
        double x = (c - (b * y)) / a;
        return new Result(x, y);
    }
}
