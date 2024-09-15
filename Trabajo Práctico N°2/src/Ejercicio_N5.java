import java.util.Scanner;

public class Ejercicio_N5 {
//    Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
//    El tiempo de viaje hasta llegar a otra ciudad B es de T segundos.
//    Escribir un algoritmo que determine la hora de llegada a la ciudad B.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hh, mm, ss, t, ssTotales, ssRestantes;

        System.out.println("Ingrese el tiempo de viaje (en seg): ");
        t = leer.nextInt();

        System.out.println("Se pedirá el tiempo de salida de manera segmentada.");
        System.out.println("Ingrese la hora de salida: ");
        hh = leer.nextInt();

        System.out.println("Ingrese los minutos de la salida: ");
        mm = leer.nextInt();

        System.out.println("Ingrese los segundos de la salida: ");
        ss = leer.nextInt();

        System.out.println("La hora de salida es "+hh+":"+mm+":"+ss);

        ssTotales = hh*3600 + mm*60 + ss + t;
        hh=ssTotales/3600;
        ssRestantes=ssTotales%3600;
        mm=ssRestantes/60;
        ss=ssRestantes%60;

        System.out.println("La hora de llegada será "+hh+":"+mm+":"+ss);
    }
}
