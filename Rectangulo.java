public class Rectangulo {

  private Cordenada superiorIzq, inferiorDer;

  public Rectangulo() {
    superiorIzq = new Cordenada(0, 0);

    inferiorDer = new Cordenada(0, 0);
  }

  public Rectangulo(
    double xSupIzq,
    double ySupIzq,
    double xInfDer,
    double yInfDer
  ) {
    superiorIzq = new Cordenada(xSupIzq, ySupIzq);

    inferiorDer = new Cordenada(xInfDer, yInfDer);
  }

  //Metodo getter de la coordenada superior izquierda

  public Cordenada superiorIzquierda() {
    return superiorIzq;
  }

  //Metodo getter de la coordenada inferior derecha

  public Cordenada inferiorDerecha() {
    return inferiorDer;
  }

  //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )

  @Override
  public String toString() {
    return (
      "Esquina superior izquierda: " +
      superiorIzq +
      "\tEsquina superior derecha:" +
      inferiorDer +
      "\n"
    );
  }
}
