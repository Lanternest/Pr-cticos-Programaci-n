import java.util.Scanner;

public class Ejercicio_N1 {
/*Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea saber
 cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y
 el total que recibirá, tomando en cuenta su sueldo base y comisiones.
*/
    public static void main(String[] args) {

        int i = 0;
        double sueldo=300000;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Su sueldo base es: "+sueldo);

        while (i<3){
            System.out.println("Ingrese el valor de la "+(i+1)+" venta: ");
            double venta = myObj.nextFloat();
            double comision = venta * 0.1;

            System.out.println("El valor de su comisión es: "+ comision);
            sueldo = sueldo + comision;
            i++;
        }
        System.out.println("El valor de su sueldo final será: "+ sueldo );
    }
}