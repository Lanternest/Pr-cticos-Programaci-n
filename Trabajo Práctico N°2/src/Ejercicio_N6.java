import java.util.Scanner;

public class Ejercicio_N6 {
//    Realiza un programa que pida el nombre y los dos apellidos
//    de una persona y muestre las iniciales.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, apell1, apell2;

        System.out.println("Ingrese su nombre: ");
        nombre= leer.nextLine();

        System.out.println("Ingrese su primer apellido: ");
        apell1= leer.nextLine();

        System.out.println("Ingrese su segundo apellido: ");
        apell2= leer.nextLine();

        char n,a1,a2;

        n=nombre.charAt(0);
        a1=apell1.charAt(0);
        a2=apell2.charAt(0);

        System.out.println("Las iniciales de su nombre son "+n+a1+a2);
    }
}
