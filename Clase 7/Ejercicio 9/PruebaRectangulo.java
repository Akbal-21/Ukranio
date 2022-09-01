public class PruebaRectangulo {

  public static void main(String[] args) {
    Rectangulo rect1 = new Rectangulo(2, 3, 5, 1);

    System.out.println(
      "Calculando el área de un rectángulo dadas sus coordenadas en un plano cartesiano: "
    );

    System.out.println(rect1);

    System.out.println("Àrea: " + rect1.area());

    System.out.println("Perimetro: " + rect1.imprimePerimetro());

  }
}
