package ArrayList.src;

import java.util.Scanner;  

import ArrayList.Classes.ArrayList;
import ArrayList.Classes.MyStringComparer;

class Main 
{
public static void main(String[] args) 
  {
    var arr = new ArrayList<String>();
    arr.sort((s, r) -> s.compareTo(r));
  }
}
