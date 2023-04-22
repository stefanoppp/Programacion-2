import java.util.Random;
public class Hilo extends Thread {
    String nombre;
    public Hilo(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int randomize_it(){
        Random random = new Random();
        int random_iteracion = random.nextInt(31) + 10;
        return random_iteracion;
    }
    public int randomize_time(){
        Random random = new Random();
        int random_delay = random.nextInt(950) + 50;
        return random_delay;
    }
    public void run(){
        int random_it=randomize_it();
        int random_delay=randomize_time();
        System.out.println("Hilo de nombre "+nombre+". Iteracion "+ random_it+". Tiempo de espera de "+random_delay);
        try{
            Hilo.sleep(random_delay);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
