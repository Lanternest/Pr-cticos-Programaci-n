import java.util.Scanner;

public class Ejercicio_N7 {
//    Escribir un algoritmo para calcular la nota final de un estudiante,
//    considerando que por cada respuesta correcta suma 5 puntos,
//    por una incorrecta -1 y por respuestas en blanco 0.
//    Imprime el resultado obtenido por el estudiante.
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int correct, incorrect, blanco, total;

        System.out.println("Ingrese la cantidad de respuestas correctas: ");
        correct= leer.nextInt();

        System.out.println("Ingrese la cantidad de respuestas incorrectas: ");
        incorrect= leer.nextInt();

        System.out.println("Ingrese la cantidad de respuestas en blanco: ");
        blanco= leer.nextInt();

        total=(correct*5)+(incorrect*-1)+(blanco*0);

        System.out.println("El resultado final es: "+total);

    }
}
