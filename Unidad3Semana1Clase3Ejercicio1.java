package Unidad3Semana1Clase3Ejercicio1;
import java.util.Scanner;
public class Unidad3Semana1Clase3Ejercicio1 {
public static void main(String[] args) {
     // se crear el objeto a la clase Scanner
     Scanner ingresar=new Scanner(System.in);
     //Declarar variables
     double nota;
     
     System.out.println("favor ingresar un valor desde 1 hasta 10");
     nota=ingresar.nextDouble();
     
     while(nota<1 | nota >10)
     {
     System.out.println("Lo siento mucho pero el valor proporcionado no es correcto");
     nota=ingresar.nextDouble();
     }
   }
}