package tp7;

import empleados.Empleado;
import empleados.EmpleadoTemporal;
import empleados.EmpleadoPlanta;
import animales.Vaca;
import animales.Animal;
import animales.Perro;
import animales.Gato;
import figuras.Rectangulo;
import figuras.Figura;
import figuras.Circulo;
import vehiculos.Auto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1) Vehiculos
        System.out.println("== Vehiculos ==");
        Auto a1 = new Auto("Toyota", "Corolla", 4);
        a1.mostrarInfo();

        // 2) Figuras 
        System.out.println("\n== Figuras ==");
        Figura[] figuras = new Figura[] {
            new Circulo("circulo1", 3.0), 
            new Rectangulo("rectangulo1", 4.0, 2.5),
            new Circulo("circulo2", 5.5)
        };
        
        for (Figura f : figuras) {
            System.out.println(
            f.getNombre() + " - area: " + f.calcularArea() 
            );
        };

        // 3) Empleados 
        System.out.println("\n== Empleados ==");
        List<Empleado> nomina = new ArrayList<>();
        nomina.add(new EmpleadoPlanta("P001", "Ana", 600000));
        nomina.add(new EmpleadoTemporal("T010", "Luis", 16, 2500));
        
        double total = 0.0;
        int cantPlanta = 0;
        int cantTemporal = 0;
        
        for (Empleado e : nomina) {
            double sueldo = e.calcularSueldo();
            total += sueldo;
            
            if (e instanceof EmpleadoPlanta) {
               cantPlanta++;
               System.out.println("[PLANTA] " + e.getNombre() + " -> sueldo:" + sueldo);
            } else if (e instanceof EmpleadoTemporal) {
               cantTemporal++;
               System.out.println("[TEMPORAL] " + e.getNombre() + " -> sueldo:" + sueldo);
            } else {
                System.out.println("[OTRO] " + e.getNombre() + " -> sueldo:" + sueldo); 
            }
        }
        
        System.out.println("Total a pagar: " + total);
        System.out.println("Cantidad Planta: " + cantPlanta + "| cantidad temporal: " + cantTemporal);
        

        // 4) Animales 
        System.out.println("\n== Animales ==");
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Rocky"));
        granja.add(new Gato("Mishi"));
        granja.add(new Vaca("Lola"));
        
        for (Animal a: granja) {
            System.out.println(a.describirAnimal() +
                    " | sonido: " + a.hacerSonido());
        }
        
    }
}
