public class PruebaPoligono {

  public static void main(String[] args) {
    PoligonoIrreg polIrr = new PoligonoIrreg(5);

    Coordenada c1 = new Coordenada(-2, 4);
    Coordenada c2 = new Coordenada(3, -3);
    Coordenada c3 = new Coordenada(5, -1);
    Coordenada c4 = new Coordenada(1, 6);
    Coordenada c5 = new Coordenada(-3, 4);

    polIrr.anadeVertice(c1);
    polIrr.anadeVertice(c2);
    polIrr.anadeVertice(c3);
    polIrr.anadeVertice(c4);
    polIrr.anadeVertice(c5);

    System.out.println(polIrr.toString());
  }
}