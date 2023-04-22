import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int) (Math.random() * 13) + 3);
        }

        ThreadFactorial hilo1 = new ThreadFactorial("Hilo 1", lista);
        ThreadFactorial hilo2 = new ThreadFactorial("Hilo 2", lista);
        ThreadFactorial hilo3 = new ThreadFactorial("Hilo 3", lista);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
