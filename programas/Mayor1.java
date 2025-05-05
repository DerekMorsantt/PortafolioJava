package programas;

import java.util.Scanner;

public class Mayor1 {
    public static void mayor1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num13 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num14 = scanner.nextInt();

        int[] numeros = {num13, num14};
        int menor = numeros[0]; 
        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i]; 
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
       
    }
}
