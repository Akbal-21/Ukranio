import java.util.*;

public class PoligonoIrreg {

  private List<Coordenada> vertices;

  public PoligonoIrreg(int n) {
    vertices = new ArrayList<Coordenada>();
  }

  public void anadeVertice(Coordenada c) {
    vertices.add(c);
  }

  @Override
  public String toString() {
    String vPoligono ="";
    for(Coordenada i : vertices){
        vPoligono = "Vértice | Coordenadas: "
        + "[" + i.abcisa() + ", " + i.ordenada() + "]\n"
        + vPoligono;   
    }
    return vPoligono;
  }
}