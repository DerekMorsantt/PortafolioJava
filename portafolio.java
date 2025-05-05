import java.util.Scanner;

public class portafolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println();
            System.out.println("Bienvenidos a el morsant java (morsant version 1.21)");

            System.out.println(" __  __  ___  ____  ____    _    _   _ _____ ");
            System.out.println("|  \\/  |/ _ \\|  _ \\/ ___|  / \\  | \\ | |_   _|");
            System.out.println("| |\\/| | | | | |_) \\___ \\ / _ \\ |  \\| | | |  ");
            System.out.println("| |  | | |_| |  _ < ___) / ___ \\| |\\  | | |  ");
            System.out.println("|_|  |_|\\___/|_| \\_\\____/_/   \\_\\_| \\_| |_|");
            System.out.println("");

            System.out.println("[?] Selecciona una opcion para continuar");
            System.out.println("Proyecto iniciado --->> Mar 18 '8'40am am 2025");
            System.out.println("");
            // Menu
            System.out.println("[1] La suma de dos numeros");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[0] Salir");
            System.out.print("[?] ");
            opcion = scanner.nextInt();

            // opciones
            switch (opcion) {
                case 1:
                System.out.print("Ingresa tu primer numero:");
                int num = scanner.nextInt();
                System.out.print("Ingresa tu segundo numero:");
                int num1 = scanner.nextInt();

                System.out.println("El resultado de tu suma es: " + (num + num1));
                    break;
            
                default:
                    break;
            }
        }while(opcion != 0);
    }
}
