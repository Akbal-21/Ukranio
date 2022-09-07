public class PruebaPoligono {

  public static void main(String[] args) {
    int v = 10000000;

    int min = -1000, max = 1000;

    //double cxy = Math.floor(Math.random()*(max-min)+min);

    PoligonoIrreg polIrr = new PoligonoIrreg(v);

    Coordenada[] coordenada = new Coordenada[v];

    for(int i = 0; i < v; i++){
      coordenada[i] = new Coordenada(Math.floor(Math.random()*(max-min)+min), Math.floor(Math.random()*(max-min)+min));
      polIrr.anadeVertice(coordenada[i]);
    }

    System.out.println(polIrr.toString());
  }
}