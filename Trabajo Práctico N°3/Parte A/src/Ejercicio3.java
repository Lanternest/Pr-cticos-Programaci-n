public class Ejercicio3 {
//    Escribe un programa que imprima los primeros 10 números de la serie de Fibonacci.
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int fibo;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 0; i < 10; i++) {

            fibo = num1 + num2;
            System.out.print(fibo + " ");

            num1 = num2;
            num2 = fibo;
        }
    }
}
