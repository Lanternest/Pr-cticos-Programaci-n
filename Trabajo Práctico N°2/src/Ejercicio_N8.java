import java.util.Scanner;

public class Ejercicio_N8 {
//    Programa que pida por teclado la fecha de nacimiento de una persona
//    (dia, mes, año) y calcule su número de la suerte.
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int dia, mes, año, suma, c1, c2, c3, c4, suerte;

        System.out.println("Se pedirá su fecha de nacimiento de manera segmentada.");
        System.out.println("Ingrese el día de nacimiento: ");
        dia= leer.nextInt();

        System.out.println("Ingrese el mes de nacimiento: ");
        mes= leer.nextInt();

        System.out.println("Ingrese el año de nacimiento: ");
        año= leer.nextInt();

        suma=dia+mes+año;

        c1=suma/1000;
        c2=suma/100%10;
        c3=suma/10%10;
        c4=suma%10;
        suerte=c1+c2+c3+c4;

        System.out.println("Su número de la suerte es: "+suerte);
    }
}
