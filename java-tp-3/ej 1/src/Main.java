import java.util.Set;
import java.util.HashSet;


class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Este empleado es " + nombre + " " + apellido + ". Su legajo es " + legajo + " y trabaja hace "
                + aniosTrabajados + " años";
    }
}

class EmpleadoSet extends Empleado {
    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof EmpleadoSet)) return false;
        EmpleadoSet emp = (EmpleadoSet) obj;
        return emp.getLegajo() == this.getLegajo();
    }

    @Override
    public int hashCode() {
        return this.getLegajo();
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<Empleado>();
        empleados.add(new Empleado("Stefano", "Peretti", 58099, 10));
        empleados.add(new Empleado("Stefano", "Peretti", 58099, 10));
        empleados.add(new Empleado("Sebastian ", "Gomez", 41011, 9));
        empleados.add(new Empleado("Jose", "De la Vega", 39912, 2));
        empleados.add(new Empleado("Francisco", "Coppo", 50950, 1));

        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
        System.out.println("\n");

        Set<EmpleadoSet> empleadosSet = new HashSet<EmpleadoSet>();
        empleadosSet.add(new EmpleadoSet("Stefano", "Peretti", 58099, 10));
        empleadosSet.add(new EmpleadoSet("Stefano", "Peretti", 58099, 10));
        empleadosSet.add(new EmpleadoSet("Sebastian ", "Gomez", 41011, 9));
        empleadosSet.add(new EmpleadoSet("Jose", "De la Vega", 39912, 2));
        empleadosSet.add(new EmpleadoSet("Francisco", "Coppo", 50950, 1));

        for (EmpleadoSet emp : empleadosSet) {
            System.out.println(emp);
        }
    }
}
