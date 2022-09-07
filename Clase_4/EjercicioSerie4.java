public class EjercicioSerie4{
	public static void main( String[] args ) {
		int serie = 20, num1 = 1, num2 = 2, num3 = 3, suma;
		System.out.println(num1);

		for(int i = 1; i <= 20; i++){
			suma = num1 + num2 + num3;
			System.out.println(suma);
			num1 = num2;
			num2 = num3;
			num3 = suma;
		}
	}
}