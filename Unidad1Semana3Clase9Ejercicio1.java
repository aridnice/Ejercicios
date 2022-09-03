package Unidad1Semana3Clase9Ejercicio1;
import java.util.Scanner;
public class Unidad1Semana3Clase9Ejercicio1 {
public static void main(String[] args) {   
    Scanner entrada = new Scanner(System.in);
    
    int numero1; // primer número a comparar
    int numero2; // segundo número a comparar
    
    System.out.println("Escriba el primer entero: "); // indicador
    numero1 = entrada.nextInt(); // lee el primer número del usuario
    
    System.out.println("Escriba el segundo entero: "); // indicador
    numero2 = entrada.nextInt(); // lee el segundo número del usuario
    
    if (numero1 == numero2)
    System.out.println("El numero " + numero1 + " es igual a " + numero2);
    
    if (numero1 != numero2)
    System.out.println("El numero " + numero1 + " es distinto a " + numero2);
    
    if (numero1 < numero2)
    System.out.println("El numero " + numero1 + " es menor a " + numero2);
    
    if (numero1 > numero2)
    System.out.println("El numero " + numero1 + " es mayor a " + numero2);
    
    if (numero1 <= numero2)
    System.out.println("El numero " + numero1 + " es menor o igual a " + numero2);
    
    if (numero1 >= numero2)
    System.out.println("El numero " + numero1 + " es mayor o igual a " + numero2);
    
    }   
}
