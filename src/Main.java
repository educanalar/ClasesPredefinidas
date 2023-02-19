import java.util.Scanner;
import java.lang.Math;
public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double n;
            System.out.print("Introduce un número: ");
            n = entrada.nextDouble();
            System.out.println("Tabla del " + n);
            for (double i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
            System.out.println("su potencia cuadrada es: ");
            Math.pow(n, 2);
            System.out.println(Math.pow(n, 2));
            System.out.println("Su raiz cuadrada es: ");
            Math.sqrt(n);
            System.out.println(Math.sqrt(n));
            System.out.println("Su coseno es: ");
            Math.acos(n);
            System.out.println(Math.acos(n));
            System.out.println("su seno es: ");
            Math.asin(n);
            System.out.println(Math.asin(n));
            System.out.println("su redondeo es: ");
            Math.floor(n);
            System.out.println(Math.floor(n));
            System.out.println("Su tangente es: ");
            Math.atan(n);
            System.out.println(Math.atan(n));

        }

        }