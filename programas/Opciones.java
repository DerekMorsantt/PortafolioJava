package programas;

public class Opciones {
    
     static String lista [] ={
        "La suma de dos números",
        "Resta de dos números",
        "Multiplicación de dos números",
        "División de dos números",
        "Módulo (Residuo de una división)",
        "Promedio de tres números",
        "Número mayor y menor entre dos números",
        "Número mayor y menor entre tres números",
        "Conversión de metros a centimetros",
        "Conversión de kilogramos a gramos",
    };

    // METODO MOSTRAR OPCIONES

    public static void opciones(){

        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+ (i+1) +"] " + lista[i]);
        }
    }
}
