package figuras;

public class Circulo extends Figura {
    private double radio = 1;

    public Circulo(String nombre, double radio) {
        super(nombre);
        if (radio > 0) {this.radio = radio; }
    }
    
    public double getRadio() { return radio;}

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
