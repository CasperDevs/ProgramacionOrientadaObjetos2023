package FigGeom;

public class Cuadrado extends Figura{

    private float lado;

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = lado*lado;
    }

    @Override
    public void calcularPerimetro() {

    }
}
