import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

       

        do {
            vistas.vista.banner();
            programas.Opciones.opciones();
            // Menu
            System.out.println("[0] Salir");
            System.out.print("[?] ");
            opcion = scanner.nextInt();

            // opciones
            switch (opcion) {
                case 1:
                programas.sumar.suma();
                break;
                
                case 2:
                programas.Resta.restar();
               break;

                case 3:
                programas.Multiplicacion.multiplicación();
                break;

                case 4:
                programas.DIvision.division();
                break;

                case 5:
                programas.Modulo.modulo();
                break;

                case 6:
                programas.Promedio.promedio();
                break;

                case 7:
                programas.Mayor1.mayor1();
                break;

                case 8:
                programas.Mayor2.mayor2();
                break;

                case 9:
                programas.Conversion1.conversion1();
               break;

                case 10:
                programas.Conversion2.conversion2();
                break;

                default:
                    break;
            }
        }while(opcion != 0);
    }
}
