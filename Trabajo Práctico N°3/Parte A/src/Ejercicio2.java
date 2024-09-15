import java.util.Scanner;

public class Ejercicio2 {
//    Escribe un programa que cuente el número de vocales en una cadena de texto.
//    (Investiga las funciones de String para realizar el ejercicio)
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String pof;
        int a=0, e=0, i=0, o=0, u=0;

        System.out.println("Ingrese una palabra o frase:");
        pof= leer.nextLine();

        for (int x = 0; x < pof.length(); x++) {
            char vocal = pof.toLowerCase().charAt(x);

            switch (vocal){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("El número de vocales es "+ (a+e+i+o+u));
    }
}
