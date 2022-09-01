public class EjercicioSerie3{
	public static void main( String[] args ) {
		int i;
		for(i = 1; i <= 15; i++){
			System.out.println(i);
		}

		System.out.println("----------");

		for(int j = i ; j >= 1; j--){
			j = j - 1;
			System.out.println(j);
		}
	}
}