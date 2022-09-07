public class PoligonoIrreg {

  private Coordenada[] vertices;

  public PoligonoIrreg(int n) {
    vertices = new Coordenada[n];
  }

  public void anadeVertice(Coordenada c) {
    for(int i = 0; i < vertices.length; i++){
      if(vertices[i] == null){
        vertices[i] = c;
        break;
      }
    }
  }

  @Override
  public String toString() {
    String vPoligono ="";
    for(int i = 0; i < vertices.length; i++){
        vPoligono = "Vértice " + (i + 1) + " | Coordenadas: "
        + "[" + vertices[i].abcisa() + ", " + vertices[i].ordenada() + "]\n"
        + vPoligono;   
    }
    return vPoligono;
  }
}
