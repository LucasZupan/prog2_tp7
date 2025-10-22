package empleados;

public abstract class Empleado {
    private String legajo;
    private String nombre;

    public Empleado(String legajo, String nombre) {
        this.legajo = (legajo == null) ? "" : legajo;
        this.nombre = (nombre == null) ? "" : nombre;;
    }
    public String getLegajo() {return legajo;}
    public String getNombre() {return nombre;}
    
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "Dmpleado(legajo='" + legajo + "'" + ", nombre='" 
                + nombre + "')";
    }
}
