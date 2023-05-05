/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_brandonhernandez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Lab3P1_BrandonHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. ¡OK Boomer!");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Serie Euclidiana");
                    System.out.println("Puntos a ingresar:");
                    int N = sc.nextInt();
                    int i = 1;
                    double acumulador = 0;
                    while (i <= N) {
                        System.out.println("Ingrese el valor de X:");
                        int x = sc.nextInt();
                        System.out.println("Ingrese el valor de Y:");
                        int y = sc.nextInt();

                        int resultado = x - y;
                        acumulador += Math.pow(resultado, 2);

                        i++;
                    }
                    double raiz = Math.sqrt(acumulador);
                    System.out.println("La distancia euclidiana es: " + raiz);

                    break;

                case 2:
                    System.out.println("Pokebola");
                    System.out.println("Ingrese el tamaño de la Pokebola:");
                    int size = sc.nextInt();

                    for (i = 1; i <= size; i++) {
                        for (int j = 1; j <= size * 2 - 1; j++) {
                            if (i <= (size / 2) - 1 || i == size || j == 1 || j == (size * 2) - 1) {
                                System.out.print("*");
                                
                            } else if (j >= 1 && j <= (size / 2) + 1 && i > (size / 2) - 1 && i == size / 2) {
                                System.out.print("*");

                            } else if (i == size / 2 && j > ((size / 2) + 1) + ((size / 2) + 2)) {
                                System.out.print("*");

                            } else if (j > (size / 2) + 1 && j <= ((size / 2) + 1) + (size / 2) + 2 && i == size / 2) {
                                System.out.print("#");

                            } else if ((i == (size / 2) + 1 && j <= (size / 2) + 1)) {
                                System.out.print("#");
                                
                            } else if(j > ((size / 2) + 1) + (size / 2) + 2 && i == (size / 2)+1){
                                System.out.print("#");
                            }
                            else if (j > (size / 2) + 1 && j <= ((size / 2) + 1) + (size / 2) + 2  && i == (size / 2) +2 ){
                                System.out.print("#");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("¡OK Boomer!");
                    System.out.println("Ingrese su año de nacimiento:");
                    int edad = sc.nextInt();

                    while (edad <= 0) {
                        System.out.println("Edad invalida!!!");
                        edad = sc.nextInt();
                        System.out.println("Ingrese su año de nacimiento:");
                    }

                    if (edad >= 2013 && edad <= 2025) {
                        System.out.println("¡Felicidades usted es de la Generación Alpha!");
                    } else if (edad >= 1990 && edad <= 2012) {
                        System.out.println("¡Felicidades usted es de la Gen Z!");
                    } else if (edad >= 1980 && edad <= 1994) {
                        System.out.println("¡Felicidades usted es de la Generación Millenials!");
                    } else if (edad >= 1975 && edad <= 1985) {
                        System.out.println("¡Felicidades usted es de la Generación Xennials!");
                    } else if (edad >= 1960 && edad <= 1979) {
                        System.out.println("¡Felicidades usted es de la Generation X!");
                    } else if (edad >= 1946 && edad <= 1964) {
                        System.out.println("¡Felicidades usted es de la Generation Baby Boomer Gen!");
                    } else {
                        System.out.println("Su edad no esta dentro de nuestro rango de generaciones :/");
                    }

                    break;

                case 4:
                    menu = false;

                    break;

                default:
                    System.out.println("Opcion Invalida!!!!");
                    break;
            }
        }

    }

}
