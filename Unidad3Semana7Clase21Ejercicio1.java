package Unidad3Semana7Clase21Ejercicio1;
public class Unidad3Semana7Clase21Ejercicio1 {
    public static void main(String[] args) {
        double dinero = 1000;
        int mes = 1;
        while (mes<=12){
            dinero = dinero * 1.02;
            mes++;
        }
        System.out.println(dinero);
    }  
}