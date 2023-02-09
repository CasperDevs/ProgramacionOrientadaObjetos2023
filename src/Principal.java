import FigGeom.Cuadrado;
import FigGeom.Figura;
import FigGeom.Triangulo;

public class Principal {
    public static void main(String[] args) {


        Triangulo tri = new Triangulo();
        tri.setAltura(4f);
        tri.setBase(5f);
        tri.calcularArea();
        tri.calcularPerimetro();



        System.out.printf("%f, %f", tri.getArea(), tri.getPerimetro());

        Cuadrado = cua  new Cuadrado();
        cua.setLado(5);
        cua.calcularArea();
        cua.calcularPerimetro();

    }


}
