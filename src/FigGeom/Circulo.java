package FigGeom;

public class Circulo extends Figura {

    private float radio;

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        this.area = (float) Math.PI*radio*radio;
    }

    public void calcularPerimetro(){
        this.perimetro = (float) Math.PI*2*radio;
    }

}