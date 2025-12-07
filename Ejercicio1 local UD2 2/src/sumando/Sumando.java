package sumando;

import java.util.Scanner;

public class Sumando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cúal es tu primer número?: ");
        int a = sc.nextInt();
        System.out.print("¿Y el segundo?: ");
        int b = sc.nextInt();
        System.out.println("La suma de esos 2 numeros es: " + (a + b));
        sc.close();
    }
}
