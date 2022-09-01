import java.util.Random;
import java.util.Scanner;

public class Eje6 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    String cad, palabra = "IPN";
    long nano_startTime = System.nanoTime();
    long nano_endTime = System.nanoTime();
    long cant;
    int count = 0, x = 0;
    System.out.print("Cantidad de palabras: ");
    cant = sc.nextInt();

    for (int i = 0; i <= cant; i++) {
      if (i == cant) {
        sb.append(
          (char) (random.nextInt(21) + 'A') +
          "" +
          (char) (random.nextInt(21) + 'A') +
          "" +
          (char) (random.nextInt(21) + 'A')
        );
      } else {
        sb.append(
          (char) (random.nextInt(21) + 'A') +
          "" +
          (char) (random.nextInt(21) + 'A') +
          "" +
          (char) (random.nextInt(21) + 'A') +
          " "
        );
      }
    }
    cad = sb.toString();
    for (int i = 0; i < cad.length(); i++) {
      x = cad.indexOf(palabra, i);
      if (x != -1) {
        i = x + 1;
        count++;
      } else {
        break;
      }
    }
    //System.out.println(cad);

    System.out.println(
      "\nTiempo de ejecucion: " + (nano_endTime - nano_startTime)
    );

    System.out.println("Programa 6: " + count);

    sc.close();
  }
}
