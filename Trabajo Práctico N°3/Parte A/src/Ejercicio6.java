import java.util.Scanner;

public class Ejercicio6 {
//    Escribe un programa que busque una subcadena en una cadena de texto.
//    (Utiliza la función substring de java para String).
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cadena, palabra;

        System.out.println("Ingrese una frase:");
        cadena=leer.nextLine().toLowerCase();
        System.out.println("Ahora veamos si podemos encontrar una palabra de esa frase. Escriba la palabra:");
        palabra=leer.nextLine().toLowerCase();

        boolean resultado=cadena.contains(palabra);

        if (resultado){
            System.out.println("La palabra está en la frase.");
        }
        else {
            System.out.println("La palabra no está en la frase.");
        }
    }
}
