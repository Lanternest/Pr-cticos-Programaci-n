import java.util.Scanner;

public class Ejercicio_N4 {
//    Dos vehículos viajan a diferentes velocidades (v1 y v2)
//    y están separados por una distancia «d». El que está detrás viaja
//    a una velocidad mayor. Se pide hacer un algoritmo para ingresar la
//    distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h)
//    y con esto determinar y mostrar en qué tiempo (minutos) alcanzará el vehículo
//    más rápido al otro.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double t, d, v1, v2, difVel;

        System.out.println("Ingrese la velocidad (km/h) del primer vehículo (más lento): ");
        v1 = leer.nextDouble();

        System.out.println("Ingrese la velocidad (km/h) del segundo vehículo (más rápido): ");
        v2= leer.nextDouble();

        System.out.println("Ingrese la distancia (km) entre ambos vehículos: ");
        d= leer.nextDouble();

        difVel=v2-v1;
        t=d/difVel;
        t=t*60;
        System.out.println("El tiempo (m) que tardaran en encontrarse ambos vehículos es "+t);
    }
}
