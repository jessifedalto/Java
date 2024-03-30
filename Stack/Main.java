package Stack;
import Stack.Stack;

class Main {
  public static void main(String[] args) 
  {
    var test = new Stack<Integer>();
   
    test.push(10);
    test.push(20);
    test.push(25);
    test.push(30);
    test.show();

    System.out.println(test.peek());
  
    System.out.println(test.search(20));

  }
}