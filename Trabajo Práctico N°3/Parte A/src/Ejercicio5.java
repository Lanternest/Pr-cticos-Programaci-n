import java.util.Scanner;

public class Ejercicio5 {
//    Escribe un programa que cuente el número de dígitos en un número dado.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número:");
        num = leer.nextInt();
        if(num == 0)
            num++;
        System.out.println("El número tiene "+Math.floor(Math.log10(Math.abs(num)) + 1)+" dígitos.");
    }
}
