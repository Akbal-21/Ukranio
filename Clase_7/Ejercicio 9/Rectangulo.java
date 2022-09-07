public class Rectangulo extends Figura implements Perimetro{

  private Coordenada superiorIzq, inferiorDer;

  public Rectangulo() {
    superiorIzq = new Coordenada(0, 0);
    inferiorDer = new Coordenada(0, 0);
  }

  public Rectangulo(Coordenada c1, Coordenada c2) {
    superiorIzq = c1;
    inferiorDer = c2;
  }

  public Rectangulo(
    double xSupIzq,
    double ySupIzq,
    double xInfDer,
    double yInfDer
  ) {
    superiorIzq = new Coordenada(xSupIzq, ySupIzq);
    inferiorDer = new Coordenada(xInfDer, yInfDer);
  }

  //Metodo getter de la coordenada superior izquierda

  public Coordenada superiorIzquierda() {
    return superiorIzq;
  }

  //Metodo getter de la coordenada inferior derecha

  public Coordenada inferiorDerecha() {
    return inferiorDer;
  }

  //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )

  @Override
  public String toString() {
    return (
      "Esquina superior izquierda: " +
      superiorIzq +
      "\tEsquina superior derecha: " +
      inferiorDer +
      "\n"
    );
  }

  @Override
  public double area(){
    double alto, ancho;
    alto = superiorIzquierda().ordenada() - inferiorDerecha().ordenada();
    ancho = inferiorDerecha().abcisa() - superiorIzquierda().abcisa();
    return alto * ancho;
  }

  @Override
  public float imprimePerimetro(){
    float alto, ancho;
    alto = (float) (superiorIzquierda().ordenada() - inferiorDerecha().ordenada());
    ancho = (float) (inferiorDerecha().abcisa() - superiorIzquierda().abcisa());
    return (alto * 2) + (ancho * 2);
  }
}