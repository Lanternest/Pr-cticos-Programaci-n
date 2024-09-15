import java.util.Scanner;

public class Ejercicio4 {
//    Escribe un programa que verifique si una palabra es un palíndromo.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto, inverso;

        System.out.println("Ingresa una palabra:");
        texto= leer.nextLine().toLowerCase();

        inverso="";

        for (int i = texto.length()-1; i >=0; i--) {
            inverso=inverso+texto.charAt(i);
        }
        if (texto.equals(inverso)){
            System.out.println(texto+" es palíndromo");
        }
        else {
            System.out.println(texto+" no es palíndromo");
        }
    }
}
