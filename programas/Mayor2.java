package programas;

import java.util.Scanner;

public class Mayor2 {
    public static void mayor2(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num15 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num16 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num17 = scanner.nextInt();

        int[] numeroos = {num15, num16, num17};
        int menoor = numeroos[0];
        int mayoor = numeroos[0];

        for (int i = 1; i < numeroos.length; i++) {
            if (numeroos[i] < menoor) {
                menoor = numeroos[i];
            }
            if (numeroos[i] > mayoor) {
                mayoor = numeroos[i];
            }
        }

        System.out.println("El número menor es: " + menoor);
        System.out.println("El número mayor es: " + mayoor);

    }
}
