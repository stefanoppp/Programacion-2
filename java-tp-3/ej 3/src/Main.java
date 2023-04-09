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
        if(posicion > lista.size()){
            throw new IndexOutOfBoundsException("Posicion excedida del tamanio");
        }
        lista.add(posicion, elemento);
    }

    public T obtenerElemento(int posicion){
        if(posicion >= lista.size()){
            throw new IndexOutOfBoundsException("La posicion solicitada es mayor a las existentes");
        }
        return lista.get(posicion);
    }

    public T obtenerPrimerElemento(){
        if(lista.isEmpty()){
            throw new IndexOutOfBoundsException("Lista sin elementos");
        }
        return lista.get(0);
    }

    public T obtenerUltimoElemento(){
        if(lista.isEmpty()){
            throw new IndexOutOfBoundsException("Lista sin elementos");
        }
        return lista.get(lista.size()-1);
    }

    public void removerElemento(int posicion){
        if(posicion >= lista.size()){
            throw new IndexOutOfBoundsException("La posicion solicitada es mayor a las existentes");
        }
        lista.remove(posicion);
    }
}
public class Main {
    public static void main(String[] args) {
        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<>();
        Empleado empleado1 = new Empleado("Stefano", "Peretti", 58099, 10);
    }
}