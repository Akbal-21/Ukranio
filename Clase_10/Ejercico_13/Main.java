import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> curps = new ArrayList<String>();
    int n = Integer.parseInt(args[0]);
    char s = args[1].charAt(0);

    for (int i = 0; i < n; i++) {
      curps.add(getCURP());
      System.out.println(curps.get(i));
    }

    System.out.println("---------------------");
    borrarSex(curps, Character.toUpperCase(s));
  }

  public static void borrarSex(List<String> listaC, char s) {
    Iterator<String> itC = listaC.iterator();
    while (itC.hasNext()) {
      if (itC.next().charAt(1) == s) itC.remove();
    }

    for (String i : listaC) {
      System.out.println(i);
    }
  }

  static String getCURP() {
    String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String Numero = "0123456789";

    String Sexo = "HM";

    String Entidad[] = {
      "AS",
      "BC",
      "BS",
      "CC",
      "CS",
      "CH",
      "CL",
      "CM",
      "DF",
      "DG",
      "GT",
      "GR",
      "HG",
      "JC",
      "MC",
      "MN",
      "MS",
      "NT",
      "NL",
      "OC",
      "PL",
      "QT",
      "QR",
      "SP",
      "SL",
      "SR",
      "TC",
      "TL",
      "TS",
      "VZ",
      "YN",
      "ZS",
    };

    int indice;

    StringBuilder sb = new StringBuilder(18);

    for (int i = 1; i < 5; i++) {
      indice = (int) (Letra.length() * Math.random());

      sb.append(Letra.charAt(indice));
    }

    for (int i = 5; i < 11; i++) {
      indice = (int) (Numero.length() * Math.random());

      sb.append(Numero.charAt(indice));
    }

    indice = (int) (Sexo.length() * Math.random());

    sb.append(Sexo.charAt(indice));

    sb.append(Entidad[(int) (Math.random() * 32)]);

    for (int i = 14; i < 17; i++) {
      indice = (int) (Letra.length() * Math.random());

      sb.append(Letra.charAt(indice));
    }

    for (int i = 17; i < 19; i++) {
      indice = (int) (Numero.length() * Math.random());

      sb.append(Numero.charAt(indice));
    }
    // System.out.println("CURP = " + sb.toString());

    return sb.toString();
  }
}
