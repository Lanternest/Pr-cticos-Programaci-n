import java.util.Scanner;
/*
    Realiza un programa que reciba los valores numéricos A y B,
    debes realizar un algoritmo que intercambie los valores de
    ambas y muestre por pantalla el resultado final de cada una.
 */
public class Ejercicio_N3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double a,b;

        System.out.println("Ingrese el valor de A: ");
        a = leer.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        b = leer.nextDouble();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("El valor de A es: "+a);
        System.out.println("El valor de B es: "+b);
    }
}
