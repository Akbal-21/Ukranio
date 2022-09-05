import java.util.*;

public class Main {

    public static void main(String[] args)

    {
        List<String> curps = new ArrayList<String>();
        char s = 'M';

        for (int i = 0; i < 10; i++) {
            curps.add(getCURP());
            System.out.println(curps.get(i));
        }
        Iterator<String> itr = curps.iterator();

        System.out.println(itr.next().charAt(10));

        System.out.println(curps.get(0));
        borrarSex(itr, s);
    }

    public static void borrarSex(Iterator<String> i, char s) {
        // int size =

        for (int j = 0; j < 10; j++) {

            if (i.hasNext()) {
                if (i.next().charAt(10) == s) {
                    i.remove();
                }else {
                    System.out.println(i.next());
    
                }
            } 
        }
    }

    // Función para generar una CURP aleatoria

    static String getCURP()

    {

        String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String Numero = "0123456789";

        String Sexo = "HM";

        String Entidad[] = { "AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC",
                "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS" };

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
