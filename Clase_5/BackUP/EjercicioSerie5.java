import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioSerie5{

	public static void main( String[] args ) {
		Random miAleatorio = new Random();
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de palabras a generar (n):");
		
		int n = lector.nextInt();
		byte[] cadenota = new byte[n*4];
		for(int i = 0; i < n; i++){
			String cadena = (char) (miAleatorio.nextInt(26)+'A') + ""
			+(char) (miAleatorio.nextInt(26)+'A') + ""
			+(char) (miAleatorio.nextInt(26)+'A')+ " ";
			cadenota = cadena.getBytes();
		}

		System.out.println(Arrays.toString(cadenota));
	}
}