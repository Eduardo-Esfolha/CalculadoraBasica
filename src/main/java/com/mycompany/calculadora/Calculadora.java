package com.mycompany.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        int nm1, nm2, resultado;
        String avance = " ";
        String sinal;

        System.out.println("pressione enter para efetuar a conta");
        avance = teclado.nextLine();
        System.out.println(avance);

        System.out.println("digite um numero");
        nm1 = teclado.nextInt();

        System.out.println("escolha um sinal");
        sinal = teclado2.nextLine();
        if (sinal.equalsIgnoreCase("+")) {
            System.out.println("digite outro numero");
            nm2 = teclado.nextInt();
            resultado = nm1 + nm2;
            System.out.printf("seu resultado é: %d", resultado);
        } else 
       {
            if (sinal.equalsIgnoreCase("-")) {
                System.out.println("digite outro numero");
                nm2 = teclado.nextInt();
                resultado = nm1 - nm2;
                System.out.printf("seu resultado é: %d", resultado);
            } else {
                if (sinal.equalsIgnoreCase("*")) {
                    System.out.println("digite outro numero");
                    nm2 = teclado.nextInt();
                    resultado = nm1 * nm2;
                    System.out.printf("seu resultado é: %d", resultado);
                } else {
                    if (sinal.equalsIgnoreCase("/")) {
                        System.out.println("digite outro numero");
                        nm2 = teclado.nextInt();
                        resultado = nm1 / nm2;
                        System.out.printf("seu resultado é: %d", resultado);
                    }

                }

            }
        }

    }

}


