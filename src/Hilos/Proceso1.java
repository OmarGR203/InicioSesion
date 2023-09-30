package Hilos;

import javax.swing.*;
import java.util.Scanner;

public class Proceso1 extends Thread{
    @Override
    public void run(){
        Scanner obj=new Scanner(System.in);
        System.out.println("ACCESO AL SISTEMA");
        Scanner datos = new Scanner(System.in);
        int intento, contrasena=2060, acceso = 0, eleccion, opcion;
        do {
            System.out.println("INGRESA PIN DE SEGURIDAD");
            intento = datos.nextInt();
            if (intento == contrasena) {
                System.out.println("NIP CORRECTO");
                System.out.println(" BIENVENIDO ");
            } else {
                System.out.println("Contraseña incorrecta");
                acceso = acceso + 1;
                if (acceso == 2) {
                    System.out.println("¡Acceso restringido!");
                    System.out.println("Supero el limite de intentos");
                }
            }
        }while (acceso<3);

        }
    }



