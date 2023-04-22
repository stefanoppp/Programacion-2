public class Main {
    public static void main(String[] args) {

        HiloRunnable Hilo1= new HiloRunnable("Stefano");
        HiloRunnable Hilo2= new HiloRunnable("Juan");
        HiloRunnable Hilo3= new HiloRunnable("Emi");
        HiloRunnable Hilo4= new HiloRunnable("Osvaldo");

        Hilo Hilo5=new Hilo("Facundo");
        Hilo Hilo6=new Hilo("Fer");
        Hilo Hilo7=new Hilo("Fabian");
        Hilo Hilo8=new Hilo("Agus");

        Thread t5 = new Thread(Hilo1);
        Thread t6 = new Thread(Hilo2);
        Thread t7 = new Thread(Hilo3);
        Thread t8 = new Thread(Hilo4);

        t5.start();
        t6.start();
        t7.start();
        t8.start();
        Hilo5.start();
        Hilo6.start();
        Hilo7.start();
        Hilo8.start();



    }
}