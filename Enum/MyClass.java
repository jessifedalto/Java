package Enum;
public class MyClass {
    //statico, não precisa instanciar o objeto, isso é global, ou seja, para todas as variaveis
    //private int valor = 3;
    // private static Integer count = 0;
    public static void Add(){
        // count++;
        //System.out.println(valor); // da errado pois o valor pode ser alterado, não é estático
    }

    public MyClass()
    {
        // Add();
        // System.out.println(count);
    }
    //quando uso estatico? quando não vou ter polimorfismo ou herança


}
