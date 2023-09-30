package Hilos;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;

public class Cronometro extends Thread{

    JLabel eti;
    public Cronometro(JLabel cronometro){
        this.eti=cronometro;
    }
    public void run(){
        try {
            int x=0;
            while (VentanaCronometro.inicioHilo){
                Thread.sleep(1000);
                ejecutarHiloCronometro(x);
                x++;
            }
        }catch (Exception e){
            System.out.println("Excepción del hilo: "+ e.getMessage());
        }
    }

    private void ejecutarHiloCronometro(int x) {
        System.out.println(x+" - "+ Thread.currentThread().getName());
        VentanaCronometro.segundo++;
        if (VentanaCronometro.segundo>59){
            VentanaCronometro.segundo=0;
            VentanaCronometro.minuto++;
            if (VentanaCronometro.minuto>59){
                VentanaCronometro.minuto=0;
                VentanaCronometro.hora++;
                if (VentanaCronometro.hora>1){
                    JOptionPane.showMessageDialog(null, "Ya paso a dos horas");
                }
            }
        }
        String textSeg ="", textMin ="", textHora ="";
        if(VentanaCronometro.segundo<10){
            textSeg="0"+VentanaCronometro.segundo;
        }else{
            textSeg=""+VentanaCronometro.segundo;
        }

        if(VentanaCronometro.minuto<10){
            textMin="0"+VentanaCronometro.minuto;
        }else{
            textMin=""+VentanaCronometro.minuto;
        }

        if(VentanaCronometro.hora<10){
            textHora="0"+VentanaCronometro.hora;
        }else{
            textHora=""+VentanaCronometro.hora;
        }

        String reloj=textHora+":"+textMin+":"+textSeg;
        eti.setText(reloj);
    }

}
