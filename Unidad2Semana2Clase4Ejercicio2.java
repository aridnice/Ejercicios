package Unidad2Semana2Clase4Ejercicio2;
public class Unidad2Semana2Clase4Ejercicio2 {
public static void main(String[] args) {
     // Programa Java para demostrar switch case
     // con multiples casos sin declaraciones break
     int day = 2;
     String dayType;
     String dayString;
    
     switch (day)
     {
         case 1: dayString = "Lunes";
                 break;
         case 2: dayString = "Martes";
                 break;
         case 3: dayString = "Miercoles";
                 break;
         case 4: dayString = "Jueves";
                 break;
         case 5: dayString = "Viernes";
                 break;
         case 6: dayString = "Sabado";
                 break;
         case 7: dayString = "Domingo";
                 break;
         default: dayString = "Dia inválido";
     }    
     
     switch (day)
     {
         //multiples cases sin declaraciones break
     
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Dia laborable";
                break;
            case 6:
            case 7:
                dayType = "Fin de semana";
                break;
                
            default: dayType= "Tipo de dia invalido";
        }
        System.out.println(dayString+ " es un " + dayType);
   }
}