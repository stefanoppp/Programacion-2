import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<String> nombres = new ArrayList<>();

        nombres.add("Stefano");
        nombres.add("Mateo");
        nombres.add("Miguel");
        nombres.add("Juan");
        nombres.add("Abril");


        List<String> apellidos = new ArrayList<>();

        apellidos.add("Peretti");
        apellidos.add("Gomez");
        apellidos.add("Santos");
        apellidos.add("Silva");
        apellidos.add("Alvarez");

        List<Persona> personas = new ArrayList<>();

        for (int i=0;i<=4;i++) {
            int edad = rand.nextInt(31) + 20;
            Persona persona = new Persona(nombres.get(i), apellidos.get(i), edad);
            personas.add(persona);
        }

        System.out.println("Personas");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        System.out.println("La mas grande es: ");
        int aux=0;
        // averiguamos la persona mas grande
        for (Persona persona : personas) {
            if (persona.getEdad()>=aux){
                aux=persona.getEdad();
            }
        }
        for (Persona persona : personas){
            if(persona.getEdad()==aux){
                System.out.println(persona.getNombre());
            }
        }

    }


}