package animales;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = (nombre == null) ? "" : nombre;
    }
    public String getNombre() {return nombre; }
    
    
    public abstract String hacerSonido(); 


    public String describirAnimal() {
        return "Animal: " + getClass().getSimpleName() + " | nombre: " + nombre;
    }
}
