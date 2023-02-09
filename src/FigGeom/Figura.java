package FigGeom;

public abstract class Figura {
    protected float area;
    protected float perimetro;
    protected double areac;

    public float getArea() {
        return area;
    }



    public float getPerimetro() {
        return perimetro;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

}
