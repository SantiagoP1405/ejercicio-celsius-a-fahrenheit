/*
 Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para
 representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a
 Fahrenheit.
 Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
 * */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor de temperatura en Celsius");
        double celcius = scanner.nextDouble();
        double fahrenheit = (celcius*1.8) + 32;
        System.out.println((int)(fahrenheit));
    }
}
