package empleados;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;

    public EmpleadoPlanta(String legajo, String nombre, double sueldoBase) {
        super(legajo, nombre);
        this.sueldoBase = (sueldoBase < 0) ? 0 : sueldoBase;
    }
    
    public double getSueldoBase() {return sueldoBase; }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
    
    @Override
    public String toString() {
        return "Planta(Legajo='" + getLegajo() + "', nombre='" + getNombre()
                + "' base=" + sueldoBase;
    }
}
