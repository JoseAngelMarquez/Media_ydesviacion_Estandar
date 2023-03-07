package dev;
import java.util.Arrays;
import java.util.Scanner;

public class Media {
	


	   public static void main(String[] args) {
	       
	       Scanner input = new Scanner(System.in);
	       
	       System.out.print("Ingresa la cantidad de números: ");
	       int n = input.nextInt();
	       
	       double suma = 0.0;
	       double[] numeros = new double[n];
	       
	       for(int i = 0; i < n; i++){
	           System.out.print("Ingresa un número: ");
	           numeros[i] = input.nextDouble();
	           suma += numeros[i];
	       }
	       
	       double media = suma / n;
	       double sumaCuadrados = 0.0;
	       
	       for(int i = 0; i < n; i++){
	           sumaCuadrados += Math.pow(numeros[i] - media, 2);
	       }
	       
	       double desviacion = Math.sqrt(sumaCuadrados / (n - 1));
	       
	       Arrays.sort(numeros);
	       int maxVeces = 1;
	       int veces = 1;
	       double moda = numeros[0];
	       
	       for(int i = 1; i < n; i++) {
	           if(numeros[i] == numeros[i-1]) {
	               veces++;
	               if(veces > maxVeces) {
	                   maxVeces = veces;
	                   moda = numeros[i];
	               }
	           } else {
	               veces = 1;
	           }
	       }
	       
	       if(maxVeces == 1) {
	           System.out.println("No hay moda");
	       } else {
	           System.out.println("La moda es: " + moda);
	       }
	       
	       System.out.println("La media aritmética es: " + media);
	       System.out.println("La desviación estándar es: " + desviacion);
	       
	       input.close();
	   }
	}