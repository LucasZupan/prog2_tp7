package empleados;

public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String legajo, String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(legajo, nombre);
        this.horasTrabajadas = (horasTrabajadas < 0) ? 0 : horasTrabajadas;
        this.tarifaPorHora = (tarifaPorHora < 0) ? 0 : tarifaPorHora;;
    }
    
    
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getTarifaPorHora() { return tarifaPorHora; }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Temporal(legajo='" +getLegajo() + "'w nombre='" +getNombre()
                + "', horas=" + horasTrabajadas + "w tarifa=" + tarifaPorHora;
    }
   
}
