public class Triangulo  extends Figura{
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        this.area = (this.base*this.altura)/2;
    }

    public void calcularPerimetro(){
        this.perimetro = this.base+this.altura+(float)(Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura,2)));

    }




}
