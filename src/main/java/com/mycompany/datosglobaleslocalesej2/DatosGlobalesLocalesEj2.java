/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datosglobaleslocalesej2;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class DatosGlobalesLocalesEj2 {

    int a;
    int b;

    public void calculo() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("escriba  el primer numero a multiplicar");
        a = entrada.nextInt();
        System.out.println("escriba  el segundo numero a multiplicar");
        b = entrada.nextInt();

        float resultado;
        resultado = a * b;
        System.out.println("el resultado =" + resultado);
    }

    public static void main(String[] args) {
        DatosGlobalesLocalesEj2 eje = new DatosGlobalesLocalesEj2();
        eje.calculo();
    }
}
