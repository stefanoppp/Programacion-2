import java.util.List;

public class ThreadFactorial extends Thread {
    private String nombre;
    private List<Integer> lista;
    private int procesados;

    public ThreadFactorial(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
        this.procesados = 0;
    }

    @Override
    public void run() {
        System.out.println("Hilo " + nombre + " procesando la lista.");
        while (!lista.isEmpty()) {
            int valor = lista.remove(0);
            int resultado = calcularFactorial(valor);
            System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + lista.size() + " elementos.");
            procesados++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nombre del thread: " + nombre + " ha procesado " + procesados + " elementos de la lista.");
    }

    private int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
