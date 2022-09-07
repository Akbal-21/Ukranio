public class PruebaCuadrado {

  public static void main(String[] args) {
    Cuadrado cuad1 = new Cuadrado(0, 5, 5, 0);

    System.out.println(
      "Calculando el área de un rectángulo dadas sus coordenadas en un plano cartesiano: "
    );

    System.out.println(cuad1);

    System.out.println("Àrea: " + cuad1.area());

    System.out.println("Perimetro: " + cuad1.imprimePerimetro());

  }
}
