package Hilos;

import javax.swing.*;
import java.util.Scanner;

public class Proceso1 extends Thread{
    @Override
    public void run(){
       // Scanner obj=new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "ACCESO AL SISTEMA");
       // Scanner datos = new Scanner(System.in);
      //  int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        int  contrasena=2060, acceso = 0, eleccion, opcion;
        do {
           int intento = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA EL PIN DE SEGURIDAD"));

            if (intento == contrasena) {
                JOptionPane.showMessageDialog(null, "NIP CORRECTO");
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                acceso = acceso + 1;
                if (acceso == 2) {
                    JOptionPane.showMessageDialog(null, "Accesso restringido");
                    JOptionPane.showMessageDialog(null, "Supero el limite de intentos");

                }
            }
        }while (acceso<3);

        }
    }



