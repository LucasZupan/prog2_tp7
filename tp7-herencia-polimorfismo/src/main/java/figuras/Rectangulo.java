package figuras;

public class Rectangulo extends Figura {
    private double ancho = 1;
    private double alto = 1;

    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        if (ancho > 0) {this.ancho = ancho; }
        if (alto > 0) {this.alto = alto; }
    }
    
    public double getAncho() {return ancho; }
    public double getAlto() {return alto; }
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
