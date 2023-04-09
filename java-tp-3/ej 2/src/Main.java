import java.util.ArrayList;
import java.util.Collections;

class Empleado implements Comparable<Empleado>{
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getLegajo() - o.getLegajo();
    }

    @Override
    public String toString() {
        return "El empleado es " + nombre + " " + apellido + ". Su legajo es " + legajo + " y ttrabaja hace "
                + aniosTrabajados + "anios";
    }
}

class ListaGenerica<T extends Comparable<T>>{
    private ArrayList<T> lista;

    public ListaGenerica(){
        lista = new ArrayList<>();
    }

    public void agregar(T elemento){
        lista.add(elemento);
    }

    public ArrayList<T> obtenerLista(){
        return lista;
    }

    public int cantidadElementos(){
        return lista.size();
    }

    public void agregarPrimero(T elemento){
        lista.add(0, elemento);
    }

    public void ordenar(){
        Collections.sort(lista);
    }

    public void desordenar(){
        Collections.shuffle(lista);
    }

    public void agregarEnPosicion(T elemento, int posicion){
        lista.add(posicion, elemento);
    }

    public T obtenerElemento(int posicion){
        return lista.get(posicion);
    }

    public T obtenerPrimerElemento(){
        return lista.get(0);
    }

    public T obtenerUltimoElemento(){
        return lista.get(lista.size()-1);
    }

    public void removerElemento(int posicion){
        lista.remove(posicion);
    }
}

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<>();

        Empleado empleado1 = new Empleado("Stefano", "Petti", 58099, 10);
        Empleado empleado2 = new Empleado("Juan", "Balda", 59000, 4);

        listaEmpleados.agregar(empleado1);
        listaEmpleados.agregar(empleado2);

    }
}

