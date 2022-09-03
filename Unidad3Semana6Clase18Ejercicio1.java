package Unidad3Semana6Clase18Ejercicio1;
import java.util.Scanner;
public class Unidad3Semana6Clase18Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i = 1; // contador del bucle que dara tantas vueltas como sea el exponente
        int potencia; // guarda el valor de la potencia
        int base;
        int calculo = 1;
        System.out.println("Introduzca el valor de la base: ");
        base = teclado.nextInt();
        System.out.println("Introduzca el valor del exponente: ");
        potencia = teclado.nextInt();
        while (i<=potencia){
        calculo = calculo * base;
        i ++;
        }
        System.out.println("El resultado del calculo de la potencia es: "+calculo);
    }
}