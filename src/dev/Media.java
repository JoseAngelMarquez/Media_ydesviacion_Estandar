package dev;

import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el número de elementos
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();

        // Crear un arreglo para almacenar los elementos
        double[] numeros = new double[n];

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // Calcular la media
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += numeros[i];
        }
        double media = suma / n;

        // Calcular la suma de los cuadrados de las diferencias
        double sumaCuadradosDiferencias = 0;
        for (int i = 0; i < n; i++) {
            sumaCuadradosDiferencias += Math.pow(numeros[i] - media, 2);
        }

        // Calcular la desviación estándar
        double desviacionEstandar = Math.sqrt(sumaCuadradosDiferencias / n);

        // Mostrar el resultado
        System.out.println("La desviación estándar es: " + desviacionEstandar);
    }
}