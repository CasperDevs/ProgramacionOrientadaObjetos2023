package FigGeom;

import java.util.Scanner;

public class Circulo extends Figura{

    private double areac;
    private double radio;

    public double getAreac() {
        return areac;
    }

    public void setAreac(double areac) {
        this.areac = areac;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public void calcularRadio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);

        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
