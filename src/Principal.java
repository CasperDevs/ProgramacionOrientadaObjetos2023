import FigGeom.Figura;
import FigGeom.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Figura fig = new Figura();

        Triangulo tri = new Triangulo();
        tri.setAltura(4f);
        tri.setBase(5f);
        tri.calcularArea();
        tri.calcularPerimetro();
        System.out.printf("%f, %f", tri.getArea(), tri.getPerimetro());

    }


}
