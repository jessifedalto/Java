import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    byte bytes[] = new byte[2];

    var rand = new Random();
    rand.nextBytes(bytes);

    System.out.println(" - Valores originais:");
    mostrarTodos(bytes);

    byte novo_bytes[] = comprimir(bytes);

    System.out.println(" - Valores comprimidos:");
    mostrarTodos(novo_bytes);

    bytes = descomprimir(novo_bytes);

    System.out.println(" - Valores após descompressão:");
    mostrarTodos(bytes);
  }

  static void mostrarTodos(byte[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.print("\t");
      System.out.println(num[i]);
    }
  }

  static byte[] comprimir(byte[] bytes) {
    byte bytes_comprimidos[] = new byte[bytes.length / 2];
    byte byte_esquerda;
    byte byte_direita;

    for (int i = 0; i < bytes_comprimidos.length; i++) {
      byte_esquerda = (byte) ((bytes[i * 2]) >>> 4);
      byte_esquerda = (byte) (byte_esquerda << 4);

      byte_direita = (byte) ((bytes[i * 2 + 1]) >>> 4);

      bytes_comprimidos[i] = (byte) (byte_esquerda + byte_direita);
    }
    return bytes_comprimidos;
  }

  static byte[] descomprimir(byte[] bytes) {
    byte bytes_descomprimidos[] = new byte[bytes.length * 2];
    byte byte_esquerda;
    byte byte_direita;

    for (int i = 0; i < bytes.length; i++) {
      byte_esquerda = (byte) (bytes[i] >>> 4);
      byte_esquerda = (byte) (byte_esquerda << 4);

      byte_direita = (byte) (bytes[i] << 4);

      bytes_descomprimidos[i * 2] = (byte) (byte_esquerda + inteiroAleatorio(0, 15));
      bytes_descomprimidos[i * 2 + 1] = (byte) (byte_direita + inteiroAleatorio(0, 15));
    }
    return bytes_descomprimidos;
  }

  static int inteiroAleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1) + min);
  }
}
