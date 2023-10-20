/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package la2p1_linsyposso;

import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class La2P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("1.Piedra, Papel o Tijera de un turno");
            System.out.println("2.Números deficientes, abundantes y perfectos");
            System.out.println("3.Potencia Iterativa");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            if (opcion == 1) {
                System.out.println("Bienvenido a Piedra, Papel o Tijera");
                System.out.println("Elija que quiere usar J1: 0.Piedra, 1.Papel, 2.Tijeras: ");
                int elementojugador = Leer.nextInt();
                System.out.println("Elija que quiere usar J2: 0.Piedra, 1.Papel, 2.Tijeras: ");
                int elementojugador2 = Leer.nextInt();
                if (elementojugador < 0 || elementojugador > 2) {
                    System.out.println("Eleccion invalida");
                    continue;
                }
                System.out.println("El jugador 1 eliegio: " + elementojugador);
                System.out.println("El jugador 2 eliegio: " + elementojugador2);
                if (elementojugador == 0 && elementojugador2 == 0) {
                    System.out.println("Empate");
                } else if (elementojugador == 1 && elementojugador == 1) {
                    System.out.println("Empate");
                } else if (elementojugador == 2 && elementojugador == 2) {
                    System.out.println("Empate");
                } else if (elementojugador == 0 && elementojugador2 == 1) {
                    System.out.println("Gano jugador 2!");
                } else if (elementojugador == 1 && elementojugador2 == 0) {
                    System.out.println("Gano jugador 1!");
                } else if (elementojugador == 0 && elementojugador2 == 2) {
                    System.out.println("Gana jugador 1!");
                } else if (elementojugador == 2 && elementojugador2 == 0) {
                    System.out.println("Gana jugador 2!");
                } else if (elementojugador == 1 && elementojugador2 == 2) {
                    System.out.println("Gana jugador 2!");
                } else if (elementojugador == 2 && elementojugador == 1) {
                    System.out.println("Gana jugador 1!");
                } else if (elementojugador < 0 || elementojugador > 2) {
                    System.out.println("Eleccion invalida");         
                    }
                
                }
            if (opcion == 2) {
                int numero = 0;
                System.out.print("Ingrese un numero: ");
                numero = Leer.nextInt();
                int divisor = 0;
                int i = 1;
             
                while (i < numero) {
                    if (numero % i == 0) {
                       divisor += i;
                    }
                    i++;
                }
                if (divisor < numero) {
                    System.out.println(numero + " es deficiente");   
                }else if (numero == divisor){
                    System.out.println(numero + " es perfecto");
                }else if (divisor > numero)
                    System.out.println(numero + " es abundante");     
        }
            if (opcion == 3){
                System.out.println("Ingrese la base: ");
                int numero = Leer.nextInt();
                System.out.println("Ingrese el exponente: ");
                int exponente = Leer.nextInt();
                
                int resultado = 0;
                int contador = 0;
                
                while (contador < numero) {
                    int sumadebase = 0;
                    int multi = numero;
                    while (sumadebase < numero) {
                        resultado += multi;
                        sumadebase ++;
                    }
                    contador ++;
                }
                System.out.println("El resultado de "+ numero + "^" + exponente + " es: " + resultado);
            }
            if(opcion == 4){
                op = 1;
                System.out.println("Bye :D");
            }  
    }
        while (op != 1);
       
        }
}

