import java.util.Random;

class Main {
  public static void main(String[] args) {

    byte[] bytes = new byte[2];
    var rand = new Random();
    rand.nextBytes(bytes);
    mostrarTodos(bytes);
    comprimir(bytes);

    System.out.println(255 >> 4);
    
  }

  static void mostrarTodos(byte[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }

  static byte[] comprimir(byte[] bytes) 
  {
    // int a = Byte.toUnsignedInt(bytes[0]);
    // Integer b = bytes[1];
   
    // String binaria = Integer.toBinaryString(bytes[0]);
    // bytes[0] = (byte)((bytes[0] >> 4) << 4);
    // bytes[1] = (byte)((bytes[1] >> 4) << 4);
    for (int i = 0; i < 4; i++) 
    {
      bytes[i] += (byte)((bytes[i] >> 4) << 4);
      bytes[(bytes.length/2)+i] = (byte)((bytes[(bytes.length/2)+i] >> 4) << 4);
      byte new_byte = byte_left + byte_right;
    }
    System.out.println(bytes[i]);
    System.out.println(bytes[(bytes.length/2)+i]);
    System.out.println(new_byte);

  }

  // static byte[] descomprimir(byte[] bytes) {

  // }

}
