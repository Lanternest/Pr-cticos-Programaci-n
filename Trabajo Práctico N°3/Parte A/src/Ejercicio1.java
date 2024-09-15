public class Ejercicio1 {
//    Escribe un programa que sume todos los números pares entre 1 y 100.
    public static void main(String[] args) {

        int suma;
        suma=0;

        for (int i = 1; i <=100; i++) {
            if (i%2!=0){
                suma=suma+i;
            }
        }
        System.out.println("La suma es "+suma);
    }
}
