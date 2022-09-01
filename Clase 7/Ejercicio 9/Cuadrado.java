public class Cuadrado extends Figura implements Perimetro{

  private Coordenada superiorIzq, inferiorDer;

  public Cuadrado() {
    superiorIzq = new Coordenada(0, 0);
    inferiorDer = new Coordenada(0, 0);
  }

  public Cuadrado(Coordenada c1, Coordenada c2) {
    superiorIzq = c1;
    inferiorDer = c2;
  }

  public Cuadrado(
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
    double lado1, lado2;
    lado1 = superiorIzquierda().ordenada() - inferiorDerecha().ordenada();
    lado2 = inferiorDerecha().abcisa() - superiorIzquierda().abcisa();
    return lado1 * lado2;
  }

  @Override
  public float imprimePerimetro(){
    float lado1;
    lado1 = (float) (superiorIzquierda().ordenada() - inferiorDerecha().ordenada());
    return (lado1 * 4);
  }
}