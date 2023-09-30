package Hilos;

public class ClasePrincipal{

    public static void main (String[] args) {
        Proceso1 hilo1 = new Proceso1();
//        Thread hilo2 = new Thread((Runnable) new VentanaCronometro());
        VentanaCronometro miVentana = new VentanaCronometro();
        miVentana.setVisible(true);


      //  VentanaCronometro hilo2 = new VentanaCronometro();
        hilo1.start();
        //hilo2.start();

    }

}


