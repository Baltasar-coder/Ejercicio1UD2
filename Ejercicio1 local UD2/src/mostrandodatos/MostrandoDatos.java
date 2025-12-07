package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("¿Cúal es tu nombre? : ");
        String nombre = a.nextLine();
        System.out.print("¿Cúal es tu apellido? : ");
        String apellido = a.nextLine();
        System.out.println("Encantado, " + nombre + " " + apellido);
        a.close();
    }
}
