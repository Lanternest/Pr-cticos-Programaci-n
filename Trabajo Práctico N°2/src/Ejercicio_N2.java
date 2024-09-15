import java.util.Scanner;

public class Ejercicio_N2 {
/*
    Un alumno desea saber cuál será su calificación final en la materia de Algoritmos.
    Dicha calificación se compone de los siguientes porcentajes: 55% del promedio de sus
    tres calificaciones parciales. 30% de la calificación del examen final. 15% de la
    calificación de un trabajo final.
*/
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double prom, suma,  notaFinal;
        int nota, examFinal, tpFinal;
        nota=0;
        suma=0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese nota "+i+" de 3:");
            nota= leer.nextInt();
            suma= suma+nota;
        }
        prom=suma/3;
        System.out.println("EL promedio es: "+nota);

        System.out.println("Ingrese la nota del Exámen Final: ");
        examFinal= leer.nextInt();
        System.out.println("Ingrese la nota del Trabajo Final:");
        tpFinal= leer.nextInt();

        notaFinal = prom*0.55+examFinal*0.3+tpFinal*0.15;
        System.out.println("La Nota Final es:"+ notaFinal);
    }
}
